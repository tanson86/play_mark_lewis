package models

import scala.collection.mutable

object TaskList1InMemoryModel {

  val userAccessMap = mutable.Map("tanson"->"password")
  val userTasks: mutable.Map[String,List[String]] = mutable.Map("tanson"->List("Work","Eat","Sleep"))
  def validateUser(username:String,password:String):Boolean = {
    userAccessMap.get(username).map(_==password).getOrElse(false)
  }

  def createUser(name:String, pwd:String):Boolean = {
    if(userAccessMap.contains(name)) return false
    else userAccessMap(name) = pwd
    true
  }

  def getTasks(userName:String):Seq[String] = {
    userTasks.getOrElse(userName,Nil)
  }

  def addTask(userName:String, task:String):Unit = {
    userTasks(userName)=task::userTasks.getOrElse(userName,Nil)
  }

  def removeTask(userName:String, task:String):Boolean = {
    if(!getTasks(userName).contains(task)) false
    //we can also use patch to delete the same.
    userTasks(userName)=getTasks(userName).toList.filter(_!=task)
    true
  }

  def removeTask(userName:String, index:Int):Boolean = {
    //we can also use patch to delete the same.
    userTasks(userName)=getTasks(userName).toList.patch(index,Nil,1)
    true
  }
}
