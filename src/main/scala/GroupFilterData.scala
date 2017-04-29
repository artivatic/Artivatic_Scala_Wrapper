/**
  * Created by artivatic on 26/4/17.
  */
import java.util

import scala.collection.Searching.SearchImpl
import scala.collection.mutable.ListBuffer
class GroupFilterData {

  var products:ListBuffer[ProductIds]=new ListBuffer();
  var filter:ListBuffer[CategoryFilters]=new ListBuffer();
  var sort :ListBuffer[Sorts]=new ListBuffer();
  var groupId:String=""

  def getGroupId:String=groupId;
  def setGroupId(group: String): Unit =
  {
    this.groupId=group
  }

  var search = ""


  def getProducts:ListBuffer[ProductIds] = products

  def setProducts(products: ListBuffer[ProductIds]): Unit = {
    this.products = products
  }

  def getFilter: ListBuffer[CategoryFilters] = filter

  def setFilter(Filter: ListBuffer[CategoryFilters]): Unit = {
    this.filter = Filter
  }
  def getSearch:String=search
  def setSearch(search:String): Unit =
  {
    this.search=search;
  }
  def getSort:ListBuffer[Sorts]=sort
  def setSort(sort:ListBuffer[Sorts]): Unit =
  {
    this.sort=sort;
  }


}
