/**
  * Created by artivatic on 28/4/17.
  */
object RegisterUser {
  /*
 * Call user Register API
 * */
  def callRegisterUserApi(BASE_URL: String, apikey: String, userId: String, body: Map[String,Any]): String = {
    val apiCalling = ArtivaticService
    apiCalling.addKey(BASE_URL,apikey)
    var requestBody=JsonUtility.serialize(body);
    println(requestBody)
    var response=apiCalling.postApiCalling(requestBody,"user" + '/' + userId)

    return response


  }

}
