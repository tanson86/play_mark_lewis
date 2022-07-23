// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_4: controllers.HomeController,
  // @LINE:14
  TaskList1Controller_2: controllers.TaskList1Controller,
  // @LINE:27
  TaskList2Controller_1: controllers.TaskList2Controller,
  // @LINE:36
  TaskList3Controller_0: controllers.TaskList3Controller,
  // @LINE:41
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_4: controllers.HomeController,
    // @LINE:14
    TaskList1Controller_2: controllers.TaskList1Controller,
    // @LINE:27
    TaskList2Controller_1: controllers.TaskList2Controller,
    // @LINE:36
    TaskList3Controller_0: controllers.TaskList3Controller,
    // @LINE:41
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_4, TaskList1Controller_2, TaskList2Controller_1, TaskList3Controller_0, Assets_3, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_4, TaskList1Controller_2, TaskList2Controller_1, TaskList3Controller_0, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getProductViaQueryParams""", """controllers.HomeController.getProduct(prodType:String, prodId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getProductViaPath/""" + "$" + """prodType<[^/]+>/""" + "$" + """prodId<[^/]+>""", """controllers.HomeController.getProduct(prodType:String, prodId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getProductViaRe/""" + "$" + """prodType<[a-z]{2}\d\d>/""" + "$" + """prodId<[^/]+>""", """controllers.HomeController.getProduct(prodType:String, prodId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """random""", """controllers.HomeController.randomNum"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """taskList""", """controllers.TaskList1Controller.taskList()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login1""", """controllers.TaskList1Controller.login1"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validateLogin1Get""", """controllers.TaskList1Controller.validateLogin1Get(username:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.TaskList1Controller.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteTask1/""" + "$" + """taskName<[^/]+>""", """controllers.TaskList1Controller.deleteTask1(taskName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validateLogin1Form""", """controllers.TaskList1Controller.validateLogin1Form"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validateLogin1Post""", """controllers.TaskList1Controller.validateLogin1Post"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create1UserPost""", """controllers.TaskList1Controller.create1UserPost"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTask1""", """controllers.TaskList1Controller.addTask1"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteTask1ViaPost""", """controllers.TaskList1Controller.deleteTask1ViaPost"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """load2""", """controllers.TaskList2Controller.load"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login2""", """controllers.TaskList2Controller.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create2""", """controllers.TaskList2Controller.create(un:String, pwd:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete2""", """controllers.TaskList2Controller.deleteTask(task:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addtask2""", """controllers.TaskList2Controller.addTask(task:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validate2""", """controllers.TaskList2Controller.validate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """load3""", """controllers.TaskList3Controller.load"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """data""", """controllers.TaskList3Controller.data"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validate3""", """controllers.TaskList3Controller.validate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_4.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_getProduct1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getProductViaQueryParams")))
  )
  private[this] lazy val controllers_HomeController_getProduct1_invoker = createInvoker(
    HomeController_4.getProduct(fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getProduct",
      Seq(classOf[String], classOf[Int]),
      "GET",
      this.prefix + """getProductViaQueryParams""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_getProduct2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getProductViaPath/"), DynamicPart("prodType", """[^/]+""",true), StaticPart("/"), DynamicPart("prodId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getProduct2_invoker = createInvoker(
    HomeController_4.getProduct(fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getProduct",
      Seq(classOf[String], classOf[Int]),
      "GET",
      this.prefix + """getProductViaPath/""" + "$" + """prodType<[^/]+>/""" + "$" + """prodId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_getProduct3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getProductViaRe/"), DynamicPart("prodType", """[a-z]{2}\d\d""",false), StaticPart("/"), DynamicPart("prodId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getProduct3_invoker = createInvoker(
    HomeController_4.getProduct(fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getProduct",
      Seq(classOf[String], classOf[Int]),
      "GET",
      this.prefix + """getProductViaRe/""" + "$" + """prodType<[a-z]{2}\d\d>/""" + "$" + """prodId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_randomNum4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("random")))
  )
  private[this] lazy val controllers_HomeController_randomNum4_invoker = createInvoker(
    HomeController_4.randomNum,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "randomNum",
      Nil,
      "GET",
      this.prefix + """random""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_TaskList1Controller_taskList5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("taskList")))
  )
  private[this] lazy val controllers_TaskList1Controller_taskList5_invoker = createInvoker(
    TaskList1Controller_2.taskList(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList1Controller",
      "taskList",
      Nil,
      "GET",
      this.prefix + """taskList""",
      """ Routess for TaskList1""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_TaskList1Controller_login16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login1")))
  )
  private[this] lazy val controllers_TaskList1Controller_login16_invoker = createInvoker(
    TaskList1Controller_2.login1,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList1Controller",
      "login1",
      Nil,
      "GET",
      this.prefix + """login1""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_TaskList1Controller_validateLogin1Get7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validateLogin1Get")))
  )
  private[this] lazy val controllers_TaskList1Controller_validateLogin1Get7_invoker = createInvoker(
    TaskList1Controller_2.validateLogin1Get(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList1Controller",
      "validateLogin1Get",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """validateLogin1Get""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_TaskList1Controller_logout8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_TaskList1Controller_logout8_invoker = createInvoker(
    TaskList1Controller_2.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList1Controller",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_TaskList1Controller_deleteTask19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteTask1/"), DynamicPart("taskName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TaskList1Controller_deleteTask19_invoker = createInvoker(
    TaskList1Controller_2.deleteTask1(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList1Controller",
      "deleteTask1",
      Seq(classOf[String]),
      "GET",
      this.prefix + """deleteTask1/""" + "$" + """taskName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_TaskList1Controller_validateLogin1Form10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validateLogin1Form")))
  )
  private[this] lazy val controllers_TaskList1Controller_validateLogin1Form10_invoker = createInvoker(
    TaskList1Controller_2.validateLogin1Form,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList1Controller",
      "validateLogin1Form",
      Nil,
      "POST",
      this.prefix + """validateLogin1Form""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_TaskList1Controller_validateLogin1Post11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validateLogin1Post")))
  )
  private[this] lazy val controllers_TaskList1Controller_validateLogin1Post11_invoker = createInvoker(
    TaskList1Controller_2.validateLogin1Post,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList1Controller",
      "validateLogin1Post",
      Nil,
      "POST",
      this.prefix + """validateLogin1Post""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_TaskList1Controller_create1UserPost12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create1UserPost")))
  )
  private[this] lazy val controllers_TaskList1Controller_create1UserPost12_invoker = createInvoker(
    TaskList1Controller_2.create1UserPost,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList1Controller",
      "create1UserPost",
      Nil,
      "POST",
      this.prefix + """create1UserPost""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_TaskList1Controller_addTask113_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTask1")))
  )
  private[this] lazy val controllers_TaskList1Controller_addTask113_invoker = createInvoker(
    TaskList1Controller_2.addTask1,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList1Controller",
      "addTask1",
      Nil,
      "POST",
      this.prefix + """addTask1""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_TaskList1Controller_deleteTask1ViaPost14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteTask1ViaPost")))
  )
  private[this] lazy val controllers_TaskList1Controller_deleteTask1ViaPost14_invoker = createInvoker(
    TaskList1Controller_2.deleteTask1ViaPost,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList1Controller",
      "deleteTask1ViaPost",
      Nil,
      "POST",
      this.prefix + """deleteTask1ViaPost""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_TaskList2Controller_load15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("load2")))
  )
  private[this] lazy val controllers_TaskList2Controller_load15_invoker = createInvoker(
    TaskList2Controller_1.load,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList2Controller",
      "load",
      Nil,
      "GET",
      this.prefix + """load2""",
      """ Routes for TaskList2""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_TaskList2Controller_login16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login2")))
  )
  private[this] lazy val controllers_TaskList2Controller_login16_invoker = createInvoker(
    TaskList2Controller_1.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList2Controller",
      "login",
      Nil,
      "GET",
      this.prefix + """login2""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_TaskList2Controller_create17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create2")))
  )
  private[this] lazy val controllers_TaskList2Controller_create17_invoker = createInvoker(
    TaskList2Controller_1.create(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList2Controller",
      "create",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """create2""",
      """GET     /validate2                          controllers.TaskList2Controller.validate(un,pwd)""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_TaskList2Controller_deleteTask18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete2")))
  )
  private[this] lazy val controllers_TaskList2Controller_deleteTask18_invoker = createInvoker(
    TaskList2Controller_1.deleteTask(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList2Controller",
      "deleteTask",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """delete2""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_TaskList2Controller_addTask19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtask2")))
  )
  private[this] lazy val controllers_TaskList2Controller_addTask19_invoker = createInvoker(
    TaskList2Controller_1.addTask(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList2Controller",
      "addTask",
      Seq(classOf[String]),
      "GET",
      this.prefix + """addtask2""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_TaskList2Controller_validate20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validate2")))
  )
  private[this] lazy val controllers_TaskList2Controller_validate20_invoker = createInvoker(
    TaskList2Controller_1.validate,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList2Controller",
      "validate",
      Nil,
      "POST",
      this.prefix + """validate2""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_TaskList3Controller_load21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("load3")))
  )
  private[this] lazy val controllers_TaskList3Controller_load21_invoker = createInvoker(
    TaskList3Controller_0.load,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList3Controller",
      "load",
      Nil,
      "GET",
      this.prefix + """load3""",
      """ Routes for tasklist3""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_TaskList3Controller_data22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("data")))
  )
  private[this] lazy val controllers_TaskList3Controller_data22_invoker = createInvoker(
    TaskList3Controller_0.data,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList3Controller",
      "data",
      Nil,
      "GET",
      this.prefix + """data""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_TaskList3Controller_validate23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validate3")))
  )
  private[this] lazy val controllers_TaskList3Controller_validate23_invoker = createInvoker(
    TaskList3Controller_0.validate,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList3Controller",
      "validate",
      Nil,
      "POST",
      this.prefix + """validate3""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Assets_versioned24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned24_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_4.index())
      }
  
    // @LINE:8
    case controllers_HomeController_getProduct1_route(params@_) =>
      call(params.fromQuery[String]("prodType", None), params.fromQuery[Int]("prodId", None)) { (prodType, prodId) =>
        controllers_HomeController_getProduct1_invoker.call(HomeController_4.getProduct(prodType, prodId))
      }
  
    // @LINE:9
    case controllers_HomeController_getProduct2_route(params@_) =>
      call(params.fromPath[String]("prodType", None), params.fromPath[Int]("prodId", None)) { (prodType, prodId) =>
        controllers_HomeController_getProduct2_invoker.call(HomeController_4.getProduct(prodType, prodId))
      }
  
    // @LINE:10
    case controllers_HomeController_getProduct3_route(params@_) =>
      call(params.fromPath[String]("prodType", None), params.fromPath[Int]("prodId", None)) { (prodType, prodId) =>
        controllers_HomeController_getProduct3_invoker.call(HomeController_4.getProduct(prodType, prodId))
      }
  
    // @LINE:11
    case controllers_HomeController_randomNum4_route(params@_) =>
      call { 
        controllers_HomeController_randomNum4_invoker.call(HomeController_4.randomNum)
      }
  
    // @LINE:14
    case controllers_TaskList1Controller_taskList5_route(params@_) =>
      call { 
        controllers_TaskList1Controller_taskList5_invoker.call(TaskList1Controller_2.taskList())
      }
  
    // @LINE:15
    case controllers_TaskList1Controller_login16_route(params@_) =>
      call { 
        controllers_TaskList1Controller_login16_invoker.call(TaskList1Controller_2.login1)
      }
  
    // @LINE:16
    case controllers_TaskList1Controller_validateLogin1Get7_route(params@_) =>
      call(params.fromQuery[String]("username", None), params.fromQuery[String]("password", None)) { (username, password) =>
        controllers_TaskList1Controller_validateLogin1Get7_invoker.call(TaskList1Controller_2.validateLogin1Get(username, password))
      }
  
    // @LINE:17
    case controllers_TaskList1Controller_logout8_route(params@_) =>
      call { 
        controllers_TaskList1Controller_logout8_invoker.call(TaskList1Controller_2.logout)
      }
  
    // @LINE:18
    case controllers_TaskList1Controller_deleteTask19_route(params@_) =>
      call(params.fromPath[String]("taskName", None)) { (taskName) =>
        controllers_TaskList1Controller_deleteTask19_invoker.call(TaskList1Controller_2.deleteTask1(taskName))
      }
  
    // @LINE:20
    case controllers_TaskList1Controller_validateLogin1Form10_route(params@_) =>
      call { 
        controllers_TaskList1Controller_validateLogin1Form10_invoker.call(TaskList1Controller_2.validateLogin1Form)
      }
  
    // @LINE:21
    case controllers_TaskList1Controller_validateLogin1Post11_route(params@_) =>
      call { 
        controllers_TaskList1Controller_validateLogin1Post11_invoker.call(TaskList1Controller_2.validateLogin1Post)
      }
  
    // @LINE:22
    case controllers_TaskList1Controller_create1UserPost12_route(params@_) =>
      call { 
        controllers_TaskList1Controller_create1UserPost12_invoker.call(TaskList1Controller_2.create1UserPost)
      }
  
    // @LINE:23
    case controllers_TaskList1Controller_addTask113_route(params@_) =>
      call { 
        controllers_TaskList1Controller_addTask113_invoker.call(TaskList1Controller_2.addTask1)
      }
  
    // @LINE:24
    case controllers_TaskList1Controller_deleteTask1ViaPost14_route(params@_) =>
      call { 
        controllers_TaskList1Controller_deleteTask1ViaPost14_invoker.call(TaskList1Controller_2.deleteTask1ViaPost)
      }
  
    // @LINE:27
    case controllers_TaskList2Controller_load15_route(params@_) =>
      call { 
        controllers_TaskList2Controller_load15_invoker.call(TaskList2Controller_1.load)
      }
  
    // @LINE:28
    case controllers_TaskList2Controller_login16_route(params@_) =>
      call { 
        controllers_TaskList2Controller_login16_invoker.call(TaskList2Controller_1.login)
      }
  
    // @LINE:30
    case controllers_TaskList2Controller_create17_route(params@_) =>
      call(params.fromQuery[String]("un", None), params.fromQuery[String]("pwd", None)) { (un, pwd) =>
        controllers_TaskList2Controller_create17_invoker.call(TaskList2Controller_1.create(un, pwd))
      }
  
    // @LINE:31
    case controllers_TaskList2Controller_deleteTask18_route(params@_) =>
      call(params.fromQuery[Int]("task", None)) { (task) =>
        controllers_TaskList2Controller_deleteTask18_invoker.call(TaskList2Controller_1.deleteTask(task))
      }
  
    // @LINE:32
    case controllers_TaskList2Controller_addTask19_route(params@_) =>
      call(params.fromQuery[String]("task", None)) { (task) =>
        controllers_TaskList2Controller_addTask19_invoker.call(TaskList2Controller_1.addTask(task))
      }
  
    // @LINE:33
    case controllers_TaskList2Controller_validate20_route(params@_) =>
      call { 
        controllers_TaskList2Controller_validate20_invoker.call(TaskList2Controller_1.validate)
      }
  
    // @LINE:36
    case controllers_TaskList3Controller_load21_route(params@_) =>
      call { 
        controllers_TaskList3Controller_load21_invoker.call(TaskList3Controller_0.load)
      }
  
    // @LINE:37
    case controllers_TaskList3Controller_data22_route(params@_) =>
      call { 
        controllers_TaskList3Controller_data22_invoker.call(TaskList3Controller_0.data)
      }
  
    // @LINE:38
    case controllers_TaskList3Controller_validate23_route(params@_) =>
      call { 
        controllers_TaskList3Controller_validate23_invoker.call(TaskList3Controller_0.validate)
      }
  
    // @LINE:41
    case controllers_Assets_versioned24_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned24_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
