package controllers

import models.TaskList1InMemoryModel
import play.api.mvc.{AbstractController, ControllerComponents}

import javax.inject.{Inject, Singleton}

@Singleton
class TaskList2Controller @Inject()(cc: ControllerComponents) extends AbstractController(cc){

  def load = Action{ implicit request=>
    Ok(views.html.tasklist2SPA())
  }

  def login = Action{
    Ok(views.html.login2())
  }

  def validate(un:String,pwd:String) = Action{
    if(TaskList1InMemoryModel.validateUser(un,pwd))
      Ok(views.html.tasklist2(TaskList1InMemoryModel.getTasks(un))).withSession("username"->un)
    else
      Ok(views.html.login2())
  }

  def validate = Action{
    implicit request =>
      val body = request.body.asFormUrlEncoded
      body.map{
        m => {
          val username = m.get("un").get.head
          val password = m("pwd").head
          if(TaskList1InMemoryModel.validateUser(username,password))
            Ok(views.html.tasklist2(TaskList1InMemoryModel.getTasks(username))).withSession("username"->username)
          else
            Ok(views.html.login2())
        }
      }.get
  }

  def create(un:String,pwd:String) = Action{
    if(TaskList1InMemoryModel.createUser(un,pwd))
      Ok(views.html.tasklist2(TaskList1InMemoryModel.getTasks(un))).withSession("username"->un)
    else
      Ok(views.html.login2())
  }

  def deleteTask(task:Int) = Action{ request =>
    val userName = request.session.get("username").get
    println(userName)
    TaskList1InMemoryModel.removeTask(userName,task)
    println(TaskList1InMemoryModel.getTasks(userName))
    Ok(views.html.tasklist2(TaskList1InMemoryModel.getTasks(userName)))
  }

  def addTask(task:String) = Action{ request =>
    val userName = request.session.get("username").get
    TaskList1InMemoryModel.addTask(userName,task)
    Ok(views.html.tasklist2(TaskList1InMemoryModel.getTasks(userName)))
  }
}
