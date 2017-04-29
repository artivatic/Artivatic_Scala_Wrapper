/**
  * Created by artivatic on 28/4/17.
  */
object GetGroupList {
  /*
 * Call group list api
 * */
  def getGroupMember(BASE_URL: String, apikey: String, client_groupid: String): String = {


    var map:Map[String,String]= Map();

    map+=("client_group_id"->client_groupid)
    var body=JsonUtility.serialize(map)
    println(body)
    val apiCalling = ArtivaticService
    apiCalling.addKey(BASE_URL,apikey)
    var response=apiCalling.postApiCalling(body,"getGroupMembers")
    return response


  }
}
