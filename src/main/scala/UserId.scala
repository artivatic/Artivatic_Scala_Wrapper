/**
  * Created by artivatic on 27/4/17.
  */
class UserIds( UserIDs: String, weights: String) {
 var UserID :String= UserIDs
  var weight :String= weights


 //def getWeight: String = weight

 def setWeight(weights: String): Unit = {
  this.weight = weights
 }
 // def getUserID: String = UserID

  def setUserID(userID: String): Unit = {
   this.UserID = userID
  }


}
