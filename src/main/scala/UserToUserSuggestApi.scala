/**
  * Created by artivatic on 27/4/17.
  */
object UserToUserSuggestApi {
  /*
  * Call user to Users suggestion api
  * */

  def suggestUsersToUser(BASE_URL: String, apikey: String, suggestionDataModel: SuggestionDataModel , userId: String): String = {
    var artivaticService=ArtivaticService
    artivaticService.addKey(BASE_URL,apikey)
    var bodyy=JsonUtility.serialize(suggestionDataModel)
    //println(bodyy)

    var response= artivaticService.postApiCalling(bodyy,"suggestUsersToUser/details/"+userId)

  //  println(response)

    return response
  }

}
