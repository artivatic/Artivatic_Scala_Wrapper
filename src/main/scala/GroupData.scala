import scala.collection.mutable.ListBuffer

/**
  * Created by artivatic on 28/4/17.
  */
class GroupData(client_user_ids:String,client_member_ids:ListBuffer[String], client_group_ids :String,groupName:String ,avGroupId:String) {


   var client_user_id:String = client_user_ids
   var client_member_id:ListBuffer[String]=client_member_ids
   var client_group_id :String= client_group_ids
 var group_name:String = groupName
  var av_group_id:String =avGroupId


}
