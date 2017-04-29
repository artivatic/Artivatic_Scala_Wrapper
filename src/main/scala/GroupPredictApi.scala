/**
  * Created by artivatic on 28/4/17.
  */
object GroupPredictApi {

  /*
  * Call group predict with filters
  * */

  def predictFilterData(BASE_URL: String, apikey: String, groupFilterData: GroupFilterData): String = {

    var apicall=ArtivaticService;
    apicall.addKey(BASE_URL,apikey)
    var bodyy=JsonUtility.serialize(groupFilterData)
    //println(bodyy)
   var response= apicall.postApiCalling(bodyy, "groupPredictFilter/details")

    return  response
  }

}
