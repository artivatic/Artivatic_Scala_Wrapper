/**
  * Created by artivatic on 28/4/17.
  */
object GroupCreateApi {
  /*
  * Call create group api
  * */

  def callGroupCreateApi(BASE_URL: String, apikey: String, groupData:GroupData): String = {
    val apiCalling = ArtivaticService
    apiCalling.addKey(BASE_URL,apikey)
    var body=JsonUtility.serialize(groupData)
   var response= apiCalling.postApiCalling(body,"saveGroupDetails")

   return response
  }
}
