/**
  * Created by artivatic on 28/4/17.
  */
object AddProductApi {
  /*
  * Call user AddProduct Api
  * */

  def addProductData(BaseUrl: String, ApiKey: String, productId: String, body: Map[String,Any]): String = {
    val apiCalling = ArtivaticService
    apiCalling.addKey(BaseUrl,ApiKey)
    var responseBody=JsonUtility.serialize(body)
    //println(responseBody)
   var response= apiCalling.postApiCalling(responseBody,"product" + '/' + productId)
    return response


  }

}
