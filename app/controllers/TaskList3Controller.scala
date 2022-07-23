package controllers

import models.{TaskList1InMemoryModel, UserData}
import play.api.libs.json.{JsError, JsSuccess, Json}
import play.api.mvc.ControllerHelpers.request2flash
import play.api.mvc.{AbstractController, ControllerComponents}

import javax.inject.{Inject, Singleton}

@Singleton
class TaskList3Controller @Inject()(cc: ControllerComponents) extends AbstractController(cc){

  def load = Action{ implicit request =>
    Ok(views.html.tasklist3Json())
  }
  def data = Action{
    Ok(Json.toJson(Seq("A","B","C")))
  }

  implicit val userDataRead = Json.reads[UserData]

  def validate = Action{ implicit request =>
    request.body.asJson.map{ body =>
      Json.fromJson[UserData](body) match {
        case JsSuccess(ud, path) => {
          if(TaskList1InMemoryModel.validateUser(ud.username,ud.password))
            Ok(Json.toJson(true)).withSession("username"->ud.username)
          else
            Redirect(routes.TaskList3Controller.load)
        }
        case e @ JsError(_) => Redirect(routes.TaskList3Controller.load)
      }
    }.getOrElse(Redirect(routes.TaskList3Controller.load))
  }
}
