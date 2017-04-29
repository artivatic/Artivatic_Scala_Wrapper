/**
  * Created by artivatic on 28/4/17.
  */
object PredictApi {
  /*
     * Call predict with filters
     * */
  def predictFilter( BASE_URL: String, apikey: String,filterData: FilterData): String = {
    val apiCalling = ArtivaticService
    apiCalling.addKey(BASE_URL,apikey)
    var body=JsonUtility.serialize(filterData)
println(body)
 var response=  apiCalling.postApiCalling(body,"predictFilter/details")
    response
  }
}
