#    Artivatic Data labs Pvt. Ltd.

      

#### Features In Artivatic Scala Library

- User Registration
- Product Adding
- Adding Interactions
- Product Predictions
   - Single User among all registered products(Including Filters)
    - For Single User among specified products
     - For Groups among all registered products(Including Filters)
      - For Groups among specified products

###  User Registartion
Intialise the Base_url and apikey before proceed to registering the user by calling the following function.



```scala
var response=RegisterUser
var map:Map[String,Any]=Map();
map+=("name"->"shikha")
map+=("category"->"user")
map+=("id"->"2")
var read= response.callRegisterUserApi(artivaticBaseUrl,artivatic_app_key,"{userId}",map)
 println(read)

```
Keeping track that the keys of the Map of User data are in accordance of the user Meta data provided during Artivatic Sign Up.

### Product Registration
Intialise the Base_url and apikey before proceed to registering the user by calling the following function. 
```scala
 var map:Map[String,Any]=Map();
    map+=("category"->"baby-gear")
    map+=("id"->"14")
    map+=("year"->"3")
    map+=("price"->"1408")
    map+=("name"->"cosmos")
var product=AddProductApi
var response=product.addProductData(artivaticBaseUrl,artivatic_app_key,"{productid}",map)
println(response)
```
Keeping track that the keys of the Map of Product data are in accordance of the Product Meta data provided during Artivatic Sign Up.
### Adding Interactions

Interactions can be added to Artivatic using different methods. The data required to add interact are userId, productId and the level of interaction.

The level of interaction is predefined in the SDK for ease of implementation but you may choose to use your own signed integer values to represent the different levels of interaction.
#### Predefined Interaction Levels are as follows :- 

```scala
var DISLIKE:Int = -6;
var NOT_INTERESTED:Int = -3;
var QUICK_DETAILS:Int = 1;
var LONG_VIEW:Int = 2;
var INTERESTED:Int = 3;
var WISHLIST:Int = 4;
var BOUGHT:Int = 5;
var LIKED :Int = 6;
```
```scala
var interect = InteractApi
var response = interect.interectAPi(artivaticBaseUrl,artivatic_app_key,"{userId}","{productId}",{interactLevel})
println(response)
```
### Predict Products

Initialise the class of UserId , ProductId, CategoryFilter, and Sorts and set the value using set method of each class.
 
```scala
var filterData=new FilterData;
var category: ListBuffer[CategoryFilters] = new ListBuffer();
var filtersss: ListBuffer[Filter] = new ListBuffer();
var categoryFilters = new CategoryFilters("food");
categoryFilters.setCategory("{category_name}");
categoryFilters.setFilter1(filtersss)
var filtersdata = new Filter("{type_value}", "{collumn_name}", "{value}");
filtersss += filtersdata
category += categoryFilters;
var userdata=new ListBuffer[UserIds];
var sorts=new ListBuffer[Sorts]
var sortdata=new Sorts()
sortdata.setCollumn_name("{collumn_name}")
sortdata.setType("{type}")
sorts+=sortdata
var user=new UserIds("{userId}","{weight}")
userdata.+=(user)
filterData.setSearch("{search}")
filterData.setUserIds(userdata)
filterData.setFilter(category)
var api=PredictApi;
var response= api.predictFilter(artivaticBaseUrl,artivatic_app_key,filterData)
println(response)

```

### Group Creation
Intialise the class of GroupCreateApi and add the client_user_id, ArrayList of client_member_id, add the client_group_id , group_name and artivatic_group_id.sending the apikey and baseurl and the groupData.

```scala
var memberId:ListBuffer[String]=new ListBuffer();
var data=new GroupData("{client_user_id}",memberId:ListBuffer[String],"{client_group_ids}","{groupName}","{avGroupId}")
var call=GroupCreateApi;
var response =call.callGroupCreateApi(artivaticBaseUrl,artivatic_app_key,data)
println(response)
```
- #### User Group List :
```scala
var detail=GetGroupList;
var response =detail.getGroupMember(artivaticBaseUrl,artivatic_app_key,"{client_groupid}");
println(response) 
```
- #### User Group Detail :
```scala
var detail=GetGroupDetails
var response=detail.getGroupMember(artivaticBaseUrl,artivatic_app_key,"{client_group_id}")
println(response)
```
### suggest UsersToUser
Call the Api suggest user to user
```scala
var userId:ListBuffer[String]=new ListBuffer();
var filterdata:ListBuffer[Filter]=new ListBuffer();
var suggestionDataModel=new SuggestionDataModel;
suggestionDataModel.setUserIds(userId:ListBuffer[String])
suggestionDataModel.setFilter(filterdata)
var api=UsertoProductSuggestApi;
var apicall=UserToUserSuggestApi;
var response= apicall.suggestUsersToUser(artivaticBaseUrl,artivatic_app_key,suggestionDataModel,"{userId}")
println(response)
```
### suggest UsersToProduct

```scala

var userId:ListBuffer[String]=new ListBuffer();
var filterdata:ListBuffer[Filter]=new ListBuffer();
var suggestionDataModel=new SuggestionDataModel;  
suggestionDataModel.setUserIds(userId:ListBuffer[String])  
suggestionDataModel.setFilter(filterdata) 
var api=UsertoProductSuggestApi;
var response= api.suggestUsersToProduct(artivaticBaseUrl,artivatic_app_key,suggestionDataModel,"{productId}")
println(response)
```
