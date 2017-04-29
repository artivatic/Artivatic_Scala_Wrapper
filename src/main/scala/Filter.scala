/**
  * Created by artivatic on 26/4/17.
  */

class Filter(type_value1:String="",collumn_names:String="",values:String="") {
  var type_value: String = type_value1
  var collumn_name:String = collumn_names
  var value:String = values


 // def getType_value: String = type_value;

  def setTypee_value(type_value: String): Unit = {
    this.type_value = type_value;
  }

 // def getCollumn_name: String = collumn_name

  //
  def setCollumn_name(collumn_name: String): Unit = {
    this.collumn_name = collumn_name
  }

 // def getvalue: String = value

  def setValue(values: String): Unit = {
    this.value = values
  }



}
