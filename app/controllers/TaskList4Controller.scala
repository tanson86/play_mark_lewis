package controllers

import play.api.mvc.{AbstractController, ControllerComponents}

import javax.inject.{Inject, Singleton}

@Singleton
class TaskList4Controller @Inject()(cc: ControllerComponents) extends AbstractController(cc){
  def load = Action { implicit request =>
    Ok(views.html.tasklist4React())
  }
}
