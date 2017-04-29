/**
  * Created by artivatic on 27/4/17.
  */
object UsertoProductSuggestApi {

  /*
  * Call user to product suggestion api
  * */
  def suggestUsersToProduct(BASE_URL: String, apikey: String, suggestionDataModel: SuggestionDataModel , productId: String): String = {
  var artivaticService=ArtivaticService
    artivaticService.addKey(BASE_URL,apikey)
    var bodyy=JsonUtility.serialize(suggestionDataModel)
    //println(bodyy)

   var response= artivaticService.postApiCalling(bodyy,"suggestUsersToProduct/details/"+productId)


   return response
  }
}
