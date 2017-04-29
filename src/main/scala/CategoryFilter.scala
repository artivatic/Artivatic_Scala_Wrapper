/**
  * Created by artivatic on 26/4/17.
  */

import java.nio.file.DirectoryStream
import java.util

import scala.collection.mutable.ListBuffer
import scala.reflect.internal.TreeGen

class CategoryFilters(categorys:String) {
  var category:String= categorys

  def getCategory: String = category

  def setCategory(category: String): Unit = {
    this.category= category
  }
  var Filter:ListBuffer[Filter]=new ListBuffer();

  def setFilter1(Filterss:ListBuffer[Filter]): Unit =
  {
    this.Filter=Filterss;

  }


  /**
    * @param attributeName name of product attribute for filtering
    * @param value         value field should match
    **/
  def addFilterColumnEquals(attributeName: String, value: String): Unit = {

 // var filter = new Filter("EQUALS",attributeName,value)
   Filter+= new Filter("EQUALS",attributeName,value);

  }

  /**
    * @param attributeName name of product attribute for filtering
    * @param latitude      value field should match
    * @param longitude     value field should match
    * @param radius        value field should match
    **/
  def addGeoFilterColumnRange(attributeName: String, latitude: String, longitude: String, radius: String): Unit = {
    Filter+=new Filter("DIST",attributeName,latitude+","+longitude+","+radius);
  //  Filter.addString(new Nothing("DIST", attributeName, latitude + "," + longitude + "," + radius))
  }

  /**
    * @param attributeName name of product attribute for filtering
    * @param value         value attribute should be less than
    **/
  def addFilterColumnLessThan(attributeName: String, value: String): Unit = {
    Filter+=new Filter("LESS_THAN",attributeName , value);
    //Filter.addString(new Nothing("LESS_THAN", attributeName, value))
  }

  /**
    * @param attributeName name of product attribute for filtering
    * @param value         value attribute should be greater than
    **/
  def addFilterColumnGreaterThan(attributeName: String, value: String): Unit = {
    Filter+=new Filter("GREATER_THAN", attributeName, value);
   // Filter.addString(new Nothing("GREATER_THAN", attributeName, value))
  }

  def addFilterColumnLessThanEquals(attributeName: String, value: String): Unit = {
    Filter+=new Filter("LESS_THAN_EQUALS", attributeName, value);
   // Filter.addString(new Nothing("LESS_THAN_EQUALS", attributeName, value))
  }

  def addFilterColumnGreaterThanEquals(attributeName: String, value: String): Unit = {
    Filter+=new Filter("GREATER_THAN_EQUALS", attributeName, value);
   // Filter.addString(new Nothing("GREATER_THAN_EQUALS", attributeName, value))
  }

  /**
    * @param attributeName name of product attribute for filtering
    * @param minValue      value attribute should be greater than

    * @param maxValue      value attribute should be less than
    **/
  def addFilterColumnInRange(attributeName: String, minValue: String, maxValue: String): Unit = {
    addFilterColumnLessThan(attributeName, maxValue)
    addFilterColumnGreaterThan(attributeName, minValue)
  }
}




