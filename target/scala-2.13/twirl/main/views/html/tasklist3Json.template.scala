
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object tasklist3Json extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request:RequestHeader, flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Task list 3 JSON")/*3.26*/{_display_(Seq[Any](format.raw/*3.27*/("""
"""),format.raw/*4.1*/("""<div id="contents">JSON</div>

<input id="csrfToken" type="hidden" value=""""),_display_(/*6.45*/helper/*6.51*/.CSRF.getToken.value),format.raw/*6.71*/(""""/>
<input id="validatePath" type="hidden" value=""""),_display_(/*7.48*/routes/*7.54*/.TaskList2Controller.validate),format.raw/*7.83*/(""""/>

<div id="screen3div1">
    <h2>Login User</h2>
    Username: <input type="text" id="login-un"/>
    <br>
    Password:<input type="password" id="login-pwd"/>
    <br>
    <button onclick="login()" id="login-btn">Login</button>

    <h2>Create User</h2>
    Username: <input type="text" id="create-un"/>
    <br>
    Password:<input type="password" id="create-pwd"/>
    <br>
    <button onclick="createUser()" id="create-btn">Create</button>
</div>

<div id="screen3div2" hidden>

    <h2>Tasklist 3</h2>

    <ul>

    </ul>


    <br>
    Add task <input type="text" id="newtask"/><br>
    <button onclick="addTask()"> Add </button>

    <div>
        <a href=""""),_display_(/*39.19*/routes/*39.25*/.TaskList1Controller.logout),format.raw/*39.52*/("""">Logout</a>
    </div>
</div>

<script src=""""),_display_(/*43.15*/routes/*43.21*/.Assets.versioned("javascripts/taskList3.js")),format.raw/*43.66*/(""""></script>
""")))}))
      }
    }
  }

  def render(request:RequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply()(request,flash)

  def f:(() => (RequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = () => (request,flash) => apply()(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/tasklist3Json.scala.html
                  HASH: 72f46e2d3ab45ded38ff2bd89b32638a6af85b74
                  MATRIX: 750->1|891->49|918->51|950->75|988->76|1015->77|1116->152|1130->158|1170->178|1247->229|1261->235|1310->264|2006->933|2021->939|2069->966|2142->1012|2157->1018|2223->1063
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|30->6|30->6|30->6|31->7|31->7|31->7|63->39|63->39|63->39|67->43|67->43|67->43
                  -- GENERATED --
              */
          