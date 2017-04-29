
import java.io.StringWriter
import java.lang.reflect.{ParameterizedType, Type}
import java.util.{Calendar, Date, TimeZone}

import com.fasterxml.jackson.core.`type`.TypeReference
import com.fasterxml.jackson.databind.{ObjectMapper, SerializationFeature}
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.google.gson.Gson
import net.liftweb.json._

/**
  * Created by artivatic on 26/4/17.
  */
object MyDefaultFormats  extends Formats {
  val SYSTEM_TIMEZONE = TimeZone.getTimeZone(Calendar.getInstance().getTimeZone.getDisplayName())
  import java.text.{ParseException, SimpleDateFormat}

  val dateFormat = new DateFormat {
    def parse(s: String) = try {
      Some(formatter.parse(s))
    } catch {
      case e: ParseException => None
    }

    def format(d: Date) = formatter.format(d)

    private def formatter = {
      val f = dateFormatter
      f.setTimeZone(MyDefaultFormats.SYSTEM_TIMEZONE)
      f
    }
  }

  protected def dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")

  /** Lossless date format includes milliseconds too.
    */
  def lossless = new DefaultFormats {
    override def dateFormatter = MyDefaultFormats.dateFormatter
  }

  /** Default formats with given <code>TypeHint</code>s.
    */
  def withHints(hints: TypeHints) = new DefaultFormats {
    override val typeHints = hints
  }
}


object JsonUtility {
  implicit val formats = MyDefaultFormats
//  implicit val formats = net.liftweb.json.DefaultFormats
//  implicit val formats = net.liftweb.json.DefaultFormats

  val mapper = new ObjectMapper()
  mapper.registerModule(DefaultScalaModule)
  mapper.configure(SerializationFeature.INDENT_OUTPUT, true)
  //mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false)  // breaks on array type

  def serialize(value: Any): String = {
    import java.io.StringWriter
    val writer = new StringWriter()
    mapper.writeValue(writer, value)
    writer.toString
  }

  def deserialize[T: Manifest](value: String) : T =
    mapper.readValue(value, typeReference[T])

  private [this] def typeReference[T: Manifest] = new TypeReference[T] {
    override def getType = typeFromManifest(manifest[T])
  }

  private [this] def typeFromManifest(m: Manifest[_]): Type = {
    if (m.typeArguments.isEmpty) { m.runtimeClass }
    else new ParameterizedType {
      def getRawType = m.runtimeClass
      def getActualTypeArguments = m.typeArguments.map(typeFromManifest).toArray
      def getOwnerType = null
    }
  }


  def toJSONString(obj:Any):String = {
    compact(JsonAST.render(Extraction.decompose(obj)))
  }

  def toJSONStringFromJava(obj:AnyRef):String = {
    val gSon = new Gson()
    gSon.toJson(obj)
  }

  def jsonString2Object[A: Manifest](jsonString:String):Option[A]={
    if (jsonString.equalsIgnoreCase(""))
      None
    else
      Some(parse(jsonString).values.asInstanceOf[A])
  }
}
