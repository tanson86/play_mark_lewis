// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:41
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseTaskList2Controller(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def deleteTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList2Controller.deleteTask",
      """
        function(task0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete2" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("task", task0)])})
        }
      """
    )
  
    // @LINE:32
    def addTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList2Controller.addTask",
      """
        function(task0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addtask2" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("task", task0)])})
        }
      """
    )
  
    // @LINE:30
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList2Controller.create",
      """
        function(un0,pwd1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "create2" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("un", un0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("pwd", pwd1)])})
        }
      """
    )
  
    // @LINE:33
    def validate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList2Controller.validate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validate2"})
        }
      """
    )
  
    // @LINE:27
    def load: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList2Controller.load",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "load2"})
        }
      """
    )
  
    // @LINE:28
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList2Controller.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login2"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def getProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getProduct",
      """
        function(prodType0,prodId1) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getProductViaQueryParams" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("prodType", prodType0), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("prodId", prodId1)])})
          }
        
        }
      """
    )
  
    // @LINE:11
    def randomNum: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.randomNum",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "random"})
        }
      """
    )
  
  }

  // @LINE:36
  class ReverseTaskList3Controller(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def load: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList3Controller.load",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "load3"})
        }
      """
    )
  
    // @LINE:37
    def data: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList3Controller.data",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "data"})
        }
      """
    )
  
    // @LINE:38
    def validate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList3Controller.validate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validate3"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseTaskList1Controller(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def deleteTask1ViaPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList1Controller.deleteTask1ViaPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteTask1ViaPost"})
        }
      """
    )
  
    // @LINE:15
    def login1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList1Controller.login1",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login1"})
        }
      """
    )
  
    // @LINE:21
    def validateLogin1Post: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList1Controller.validateLogin1Post",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validateLogin1Post"})
        }
      """
    )
  
    // @LINE:16
    def validateLogin1Get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList1Controller.validateLogin1Get",
      """
        function(username0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validateLogin1Get" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("username", username0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password1)])})
        }
      """
    )
  
    // @LINE:14
    def taskList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList1Controller.taskList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "taskList"})
        }
      """
    )
  
    // @LINE:17
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList1Controller.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:18
    def deleteTask1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList1Controller.deleteTask1",
      """
        function(taskName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteTask1/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("taskName", taskName0))})
        }
      """
    )
  
    // @LINE:23
    def addTask1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList1Controller.addTask1",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addTask1"})
        }
      """
    )
  
    // @LINE:22
    def create1UserPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList1Controller.create1UserPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "create1UserPost"})
        }
      """
    )
  
    // @LINE:20
    def validateLogin1Form: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList1Controller.validateLogin1Form",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validateLogin1Form"})
        }
      """
    )
  
  }


}
