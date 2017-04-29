import FunctionCalling.callData

/**
  * Created by artivatic on 28/4/17.
  */
object InteractApi {
  /*
 call the interect Api
  */
  def interectAPi(BASE_URL: String, apikey: String, userId: String, productId: String, interactLevel: Int): String = {
    val urladd = "interact/" + userId + '/' + productId
    var map:Map[String,Any]=Map();
    map+=("level"->interactLevel)
    var body=JsonUtility.serialize(map)
    val apiCalling = ArtivaticService
    apiCalling.addKey(BASE_URL,apikey)
   var response= apiCalling.postApiCalling(body,urladd)
    return response

  }

  /*
  call the interect Api with predictionId
   */

  def interectPredictionAPi(BASE_URL: String, apikey: String, userId: String, productId: String, interactLevel: Int, predictId: String): String = {
    val urladd = "interact/" + userId + '/' + productId
    var map:Map[String,Any]=Map()
    map+=("level"->interactLevel)
    map+=("predictId"->predictId)
    var body =JsonUtility.serialize(map)
    var apicalling=ArtivaticService
    apicalling.addKey(BASE_URL,apikey)
    var response=apicalling.postApiCalling(body,urladd)
    return response

  }

}
