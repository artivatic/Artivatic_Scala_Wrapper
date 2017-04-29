/**
  * Created by artivatic on 28/4/17.
  */
object GetGroupDetails {

  /*
* Call group details api
* */

  def getGroupMember(BASE_URL: String, apikey: String, client_groupid: String): String = {
    var map:Map[String,String]=Map();

    map+=("client_group_id"->client_groupid)

    val apiCalling = ArtivaticService
    var body=JsonUtility.serialize(map)

 apiCalling.addKey(BASE_URL,apikey)

    val response = apiCalling.postApiCalling(body, "getGroupMembers")
    response
  }

}
