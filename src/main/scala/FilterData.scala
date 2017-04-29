/**
  * Created by artivatic on 28/4/17.
  */

import java.util

import scala.collection.mutable.ListBuffer

class FilterData {
  var products:ListBuffer[ProductIds]=new ListBuffer();
  var filter:ListBuffer[CategoryFilters]=new ListBuffer();
  var sort :ListBuffer[Sorts]=new ListBuffer();

    var userIds: ListBuffer[UserIds] = new ListBuffer();
  var search:String = ""

  def getUserIds:ListBuffer[UserIds] = userIds

  def setUserIds(userIds: ListBuffer[UserIds]): Unit = {
    this.userIds = userIds
  }
  def getSort:ListBuffer[Sorts]=sort
  def setSort(sort:ListBuffer[Sorts]): Unit =
  {
    this.sort=sort
  }
  def getProducts: ListBuffer[ProductIds] = products

  def setProducts(products:ListBuffer[ProductIds]): Unit = {
    this.products = products
  }
  def getSearch:String=search

  def setSearch(search:String): Unit =
  {
    this.search=search
  }

  def getFilter:ListBuffer[CategoryFilters] = filter

  def setFilter(filter: ListBuffer[CategoryFilters]): Unit = {
    this.filter = filter
  }
}

