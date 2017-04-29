/**
  * Created by artivatic on 27/4/17.
  */

import java.util

import scala.collection.mutable.ListBuffer

class SuggestionDataModel
{
  var userIds:ListBuffer[String]=new ListBuffer();
  var filter:ListBuffer[Filter]=new ListBuffer();

  def getFilter:ListBuffer[Filter]=filter
  def setFilter(filters:ListBuffer[Filter]): Unit =
  {
    this.filter=filters
  }
  def getUserIds:ListBuffer[String]=userIds
  def setUserIds(userId:ListBuffer[String]): Unit =
  {
    this.userIds=userId
  }

}

