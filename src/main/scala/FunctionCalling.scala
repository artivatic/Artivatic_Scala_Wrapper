

import scala.collection.mutable.ListBuffer

/**
  * Created by artivatic on 27/4/17.
  */

object FunctionCalling {
  val artivaticBaseUrl: String = "http://49.204.83.22:9000/"       //Intiallise the Ativatic BaseUrl
  val artivatic_app_key: String = "pSbdBxrduu27JoY5pWZ9TQ=="       //Artivatic Api key



  def callData()
  {
    /*
    call to groupPredict Api

     */

//    var groupFilterData=new GroupFilterData;                            //Intiallise the class of GroupFilterData for request body
//    var category: ListBuffer[CategoryFilters] = new ListBuffer();       //Intiallise the ListBuffer of CategoryFilter class
//    var filters: ListBuffer[Filter] = new ListBuffer();                 //Intiallise the ListBuffer of CategoryFilter
//    var categoryFilters = new CategoryFilters("food");                  //Add the type of Category
//    categoryFilters.setFilter1(filters)                                  // Set the filter Type
//    var filtersdata = new Filter("{type_value}", "{collumn_names}", "{value}");
//    filters += filtersdata                                                //Add the data in  ListBuffer[Filter]
//    category += categoryFilters;                                          //Add the data in  ListBuffer[CategoryFilter]
//    var userdata=new ListBuffer[UserIds];                                 //Intiallise the ListBuffer[UserIds]
//    var sort=new ListBuffer[Sorts]                                        //Intiallise the listBuffer[Sorts]
//    var sortdata=new Sorts()                                              //Intiallise the  class of Sorts
//    sortdata.setCollumn_name("{collumn_name}")                            //Intiallise the set collumn_type
//    sortdata.setType("{type}")                                            //Intiallise the type
//    sort+=sortdata                                                        //Add the class data in ListBuffer[Sorts]
//
//  var user=new UserIds("{userId}","{weight}") //by default we take the value of weight is 0.8
//    userdata.+=(user)                                                      //Add the class data of user to ListBuffer[UserIds]
//    groupFilterData.setSort(sort)                                          //set the sort of groupFilterData class
//    groupFilterData.setSearch("")                                          //set the search query
//    groupFilterData.setGroupId("")                                         //set the GroupId
//    groupFilterData.setFilter(category)                                    //set the ListBuffer[CategoryFilter]
//   println(JsonUtility.serialize(groupFilterData));                        //Print the request body in json format
//    var api=GroupPredictApi;                                               //Intiallise the class of GroupPredictAPi
//   var response= api.predictFilterData(artivaticBaseUrl,artivatic_app_key,groupFilterData)
//    println(response)                                                      //print the response



/*
Call the suggest User to Product Api
 */

//    var userId:ListBuffer[String]=new ListBuffer();                         //Intiallise the ListBuffer of String for adding userId
//    var filterdata:ListBuffer[Filter]=new ListBuffer();                     //Intiallise the ListBuffer of Filter Class
//    userId+="1"                                                             //Add the userId in String ListBuffer
//    userId+="2"
//    userId+="3"
//    userId+="4"
//    userId+="5"
//    var suggestionDataModel=new SuggestionDataModel;                          //Intiallise the class for Suggestion Data
//    suggestionDataModel.setUserIds(userId)                                    //Set the userId
//    suggestionDataModel.setFilter(filterdata)                                 //Set the FilterData
//    var api=UsertoProductSuggestApi;                                          //Call the UserToProduct Api class
//   var response= api.suggestUsersToProduct(artivaticBaseUrl,artivatic_app_key,suggestionDataModel,"f823")
//    println(response)                                              //Print the response of api Call



    /*
Call the suggest user to User Api
     */

//    var userId:ListBuffer[String]=new ListBuffer();                            //Intiallise the ListBuffer[String] to add userId
//    var filterData:ListBuffer[Filter]=new ListBuffer();                        //Intiallise the ListBuffer[Filter]  to add FilterData
//    userId+="1"                                                                //Add the userId in ListBuffer
//    userId+="2"
//    userId+="3"
//    userId+="4"
//    userId+="5"
//    var suggestionDataModel=new SuggestionDataModel;                            //Add the Suggestion class for requestBody
//    suggestionDataModel.setUserIds(userId)                                      // set the ListBuffer of userId in suggestionDataModel
//    suggestionDataModel.setFilter(filterData)                                   //set the filter Data
//    var apicall=UserToUserSuggestApi;                                           //Intiallise the class UserToUsersuggestApi
//    var response= apicall.suggestUsersToUser(artivaticBaseUrl,artivatic_app_key,suggestionDataModel,"1")
//    println(response)                                                //print the response




    /*
    FilterApi calling

     */


//    var filterData=new FilterData;                                                //Intiallise the FilterData class
//        var category: ListBuffer[CategoryFilters] = new ListBuffer();              //Intiallise the ListBuffer[CategoryFilter]
//        var filter: ListBuffer[Filter] = new ListBuffer();                         //Intiallise the CategoryFilter class
//        var categoryFilters = new CategoryFilters("food");                         //intiallise the Filter class
//        categoryFilters.setFilter1(filter)                                         //set the ListBuffer[Filter] in CategoryFilter
//        var filtersdata = new Filter("{type_value}", "{collumn_name}", "{value}"); //Intiallise the FilterData class
//        filter += filtersdata                                                      //add the ListBuffer
//        category += categoryFilters;                                               //add the value of ListBuffer[CategoryFilter]
//        var userdata=new ListBuffer[UserIds];                                      //Intiallise the ListBuffer of userIds
//        var sorts=new ListBuffer[Sorts]                                            //Intiallise the ListBuffer of Sorts
//        var sortdata=new Sorts()                                                   //Intiallise the Sort class
//        sortdata.setCollumn_name("{collumn_name}")                                 //Set the column_name
//        sortdata.setType("{type}")                                                 //Set the type
//        sorts+=sortdata                                                            //Set the value of sortdata to ListBuffer
//        var user=new UserIds("1","0.8")                                            //set the userId and weight
//        userdata.+=(user)                                                          //add the value to ListBuffer
//        filterData.setSearch("")
//        filterData.setUserIds(userdata)
//
//        filterData.setFilter(category)
//
//        var api=PredictApi;                                                        //add the PredictApi call
//        var response= api.predictFilter(artivaticBaseUrl,artivatic_app_key,filterData)
//        println(response)

    /*
    call the Interect Api
     */

//    var interect=InteractApi                                                    //Intiallise the interact Api class
//    var response=interect.interectAPi(artivaticBaseUrl,artivatic_app_key,"{user_id}","{product_id}",9)
//    println(response)

    /*
    Add User Registeration
     */

//   var map:Map[String,Any]=Map();                     //Intiallise the Map[String,Any]
//
//    map+=("name"->"shikha")                           //Add the data in map List
//    map+=("category"->"user")
//    map+=("id"->"2")
//
//    var response=RegisterUser
//   var read= response.callRegisterUserApi(artivaticBaseUrl,artivatic_app_key,"{userId}",map)
//    println(read)

//

    /*
    addProduct
     */
//    var map:Map[String,Any]=Map(); //Intiallise the Map
//    map+=("category"->"baby-gear") //add the value
//    map+=("id"->"14")
//    map+=("year"->"3")
//    map+=("price"->"1408")
//    map+=("name"->"cosmos")
//
//    var product=AddProductApi           //Intiallise the AddProductApi
//    var response=product.addProductData(artivaticBaseUrl,artivatic_app_key,"{ProductId}",map)
//    println(response)

    /*
    Add metaData
     */
//    var metadata=MetaDataApi
//   var response= metadata.getMetaData(artivaticBaseUrl,artivatic_app_key)
//    println(response)

    /*
    GroupCreation Api
     */

//
//    var listdata:ListBuffer[String]=new ListBuffer();       //Intiallise the ListBuffer[String]
//    listdata+=("500")                                       // Add the data in List
//    listdata+=("144")
//    listdata+=("291")
//    listdata+=("385")
//
//    var data=new GroupData("{client_user_ids}",listdata,"{client_group_ids}","{groupName}","{avGroupId}")
//    var call=GroupCreateApi;
//    var response =call.callGroupCreateApi(artivaticBaseUrl,artivatic_app_key,data)
//    println(response)
    /*
    GroupList Api call
     */
//
//    var detail=GetGroupList;                   //Intiallise the GroupList object
//    var response =detail.getGroupMember(artivaticBaseUrl,artivatic_app_key,"{client_group_Id}");
//    println(response)

    /*
    GroupDetail Api call
     */

//    var detail=GetGroupDetails                //Intiallise the GroupDetail Api
//    var response=detail.getGroupMember(artivaticBaseUrl,artivatic_app_key,"{client_group_id}")
//    println(response)



  }
  def main(args: Array[String]){
    callData();

  }

}
