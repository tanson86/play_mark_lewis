// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:41
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:27
  class ReverseTaskList2Controller(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def deleteTask(task:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete2" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("task", task)))))
    }
  
    // @LINE:32
    def addTask(task:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addtask2" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("task", task)))))
    }
  
    // @LINE:30
    def create(un:String, pwd:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "create2" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("un", un)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("pwd", pwd)))))
    }
  
    // @LINE:33
    def validate: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validate2")
    }
  
    // @LINE:27
    def load: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "load2")
    }
  
    // @LINE:28
    def login: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login2")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def getProduct(prodType:String, prodId:Int): Call = {
    
      (prodType: @unchecked, prodId: @unchecked) match {
      
        // @LINE:8
        case (prodType, prodId)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "getProductViaQueryParams" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("prodType", prodType)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("prodId", prodId)))))
      
      }
    
    }
  
    // @LINE:11
    def randomNum: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "random")
    }
  
  }

  // @LINE:36
  class ReverseTaskList3Controller(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def load: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "load3")
    }
  
    // @LINE:37
    def data: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "data")
    }
  
    // @LINE:38
    def validate: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validate3")
    }
  
  }

  // @LINE:14
  class ReverseTaskList1Controller(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def deleteTask1ViaPost: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "deleteTask1ViaPost")
    }
  
    // @LINE:15
    def login1: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login1")
    }
  
    // @LINE:21
    def validateLogin1Post: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validateLogin1Post")
    }
  
    // @LINE:16
    def validateLogin1Get(username:String, password:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "validateLogin1Get" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("username", username)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:14
    def taskList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "taskList")
    }
  
    // @LINE:17
    def logout: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:18
    def deleteTask1(taskName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteTask1/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("taskName", taskName)))
    }
  
    // @LINE:23
    def addTask1: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addTask1")
    }
  
    // @LINE:22
    def create1UserPost: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "create1UserPost")
    }
  
    // @LINE:20
    def validateLogin1Form: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validateLogin1Form")
    }
  
  }


}
