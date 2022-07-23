package controllers

import models.TaskList1InMemoryModel
import play.api.mvc.{MessagesAbstractController, MessagesControllerComponents}

import javax.inject.{Inject, Singleton}
import play.api.data._
import play.api.data.Forms._

case class LoginData(userName:String,password:String)

@Singleton
class TaskList1Controller @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc){

  val loginForm = Form(mapping(
    "Username" -> text(3,10),
    "Password"->text(8)
  )(LoginData.apply)(LoginData.unapply))

  def validateLogin1Form = Action{ implicit request =>
    loginForm.bindFromRequest().fold(
      errors => BadRequest(views.html.login1(errors)),
      success => if(TaskList1InMemoryModel.validateUser(success.userName,success.password))
                  Redirect(routes.TaskList1Controller.taskList()).withSession("username"->success.userName)
                else
                  Redirect(routes.TaskList1Controller.login1).flashing("error"->"Invalid credentials!!!")
    )
  }

  def login1 = Action{ implicit request =>
     Ok(views.html.login1(loginForm))
  }

  def validateLogin1Get(username:String,password:String) = Action{
    Ok(s"Username is $username and password is secret")
  }

  def validateLogin1Post = Action{ implicit request =>
    val body = request.body.asFormUrlEncoded
    body.map{
      m => {
        val username = m.get("username").get.head
        val password = m("password").head
        if(TaskList1InMemoryModel.validateUser(username,password))
          Redirect(routes.TaskList1Controller.taskList()).withSession("username"->username)
        else
          Redirect(routes.TaskList1Controller.login1).flashing("error"->"Invalid credentials!!!")
      }
    }.get

  }

  def create1UserPost = Action { implicit request =>
    val body = request.body.asFormUrlEncoded
    body.map {
      m => {
        val username = m.get("username").get.head
        val password = m("password").head
        if (TaskList1InMemoryModel.createUser(username, password))
          Redirect(routes.TaskList1Controller.taskList()).withSession("username"->username)
        else
          Redirect(routes.TaskList1Controller.login1).flashing("error"->"Username already exists!!!")
      }
    }.get
  }

  def taskList() = Action{ implicit request =>
    val userName = request.session.get("username")
    userName.map { un =>
      val tasks: Seq[String] = TaskList1InMemoryModel.getTasks(un)
      Ok(views.html.tasklist1(tasks))
    }.getOrElse(Redirect(routes.TaskList1Controller.login1))
  }

  def addTask1 = Action{implicit request =>
    val userName = request.session.get("username")
    val body = request.body.asFormUrlEncoded
    userName.map { un =>
      val tasks: Seq[String] = TaskList1InMemoryModel.getTasks(un)
      body.map{ m =>
        val task:String = m.get("task").get.head
        TaskList1InMemoryModel.addTask(un, task)
        val tasks: Seq[String] = TaskList1InMemoryModel.getTasks(un)
        println(tasks)
        Ok(views.html.tasklist1(tasks))
      }.getOrElse(Ok(views.html.tasklist1(tasks)))
    }.getOrElse(Redirect(routes.TaskList1Controller.login1))
  }

  def deleteTask1(taskName:String) = Action{ implicit request =>
    val userName = request.session.get("username")
    val body = request.body.asFormUrlEncoded
    userName.map { un =>
        TaskList1InMemoryModel.removeTask(un,taskName)
      Ok(views.html.tasklist1(TaskList1InMemoryModel.getTasks(un)))
    }.getOrElse(Redirect(routes.TaskList1Controller.login1))
  }

  def deleteTask1ViaPost = TODO

  def logout = Action{implicit request =>
    val userName = request.session.get("username")
    Redirect(routes.TaskList1Controller.login1).withNewSession
  }
}
