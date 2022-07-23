// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTaskList2Controller TaskList2Controller = new controllers.ReverseTaskList2Controller(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTaskList3Controller TaskList3Controller = new controllers.ReverseTaskList3Controller(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTaskList1Controller TaskList1Controller = new controllers.ReverseTaskList1Controller(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTaskList2Controller TaskList2Controller = new controllers.javascript.ReverseTaskList2Controller(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTaskList3Controller TaskList3Controller = new controllers.javascript.ReverseTaskList3Controller(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTaskList1Controller TaskList1Controller = new controllers.javascript.ReverseTaskList1Controller(RoutesPrefix.byNamePrefix());
  }

}
