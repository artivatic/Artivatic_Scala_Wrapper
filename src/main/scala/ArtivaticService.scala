import scalaj.http.{Http, HttpOptions}

/**
  * Created by artivatic on 27/4/17.
  */
object ArtivaticService {
  var url:String="";
  var artivatic_app_key:String=""

  def addKey(url:String,artivatic_app_key:String): Unit =
  {
    this.url=url;
    this.artivatic_app_key=artivatic_app_key;

  }

  def postApiCalling(json_body:String,addUrl:String): String = {
    var inputUrl=url+addUrl

    val response = Http(inputUrl).postData(json_body)
      .header("Content-Type", "application/json")
      .header("apikey", artivatic_app_key)
      .option(HttpOptions.readTimeout(10000)).asString

    response.equals("[]") match {
      case true =>
        ""

      case false =>
       // println(response.body.toString)
        return response.body.toString


    }
  }
  def getApiCalling(addUrl:String): String =
  {
    var inputUrl=url+addUrl

    val response = Http(inputUrl)
      .header("Content-Type", "application/json")
      .header("apikey", artivatic_app_key)
      .option(HttpOptions.readTimeout(10000)).asString

    response.equals("[]") match {
      case true =>
        ""

      case false =>
        // println(response.body.toString)
        return response.body.toString


    }
  }


}
