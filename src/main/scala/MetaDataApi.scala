/**
  * Created by artivatic on 28/4/17.
  */
object MetaDataApi {
  /*
* Call user Register API
* */
  def getMetaData(BASE_URL: String, apikey: String): String = {
    val apiCalling = ArtivaticService
    apiCalling.addKey(BASE_URL,apikey)
   var response= apiCalling.getApiCalling("getclient/metadata")

    return response
  }
}
