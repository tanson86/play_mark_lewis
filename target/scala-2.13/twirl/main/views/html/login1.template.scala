
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

object login1 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[LoginData],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm:Form[LoginData])(implicit request:MessagesRequestHeader, flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Login")/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
    """),format.raw/*4.5*/("""<h1>Login Using GET HTTP request</h1><br>
    <form method="get" action="validateLogin1Get">
        Username <input type="text" name="username" /><br/>
        Password <input type="password" name="password" /><br/>
        <input type="submit" value="Submit"/>
    </form>

<h2>Login Using POST HTTP request</h2><br>
<form method="post" action=""""),_display_(/*12.30*/routes/*12.36*/.TaskList1Controller.validateLogin1Post),format.raw/*12.75*/("""">
    """),_display_(/*13.6*/helper/*13.12*/.CSRF.formField),format.raw/*13.27*/("""
    """),format.raw/*14.5*/("""Username <input type="text" name="username" id="login-un"/><br/>
    Password <input type="password" name="password" id="login-pwd"/><br/>
    <input type="submit" value="Submit"/>
</form>

<h1>Login Using POST HTTP request but with PLAY FORMS</h1><br>
"""),_display_(/*20.2*/helper/*20.8*/.form(action=routes.TaskList1Controller.validateLogin1Form)/*20.67*/{_display_(Seq[Any](format.raw/*20.68*/("""
"""),_display_(/*21.2*/helper/*21.8*/.CSRF.formField),format.raw/*21.23*/("""
"""),_display_(/*22.2*/helper/*22.8*/.inputText(loginForm("Username"))),format.raw/*22.41*/("""
"""),_display_(/*23.2*/helper/*23.8*/.inputText(loginForm("Password"))),format.raw/*23.41*/("""
"""),format.raw/*24.1*/("""<div class=""form-actions>
    <button type="submit">Login</button>
</div>
""")))}),format.raw/*27.2*/("""

"""),format.raw/*29.1*/("""<h1>Create User Using POST HTTP request</h1><br>
<form method="post" action=""""),_display_(/*30.30*/routes/*30.36*/.TaskList1Controller.create1UserPost),format.raw/*30.72*/("""">
    """),_display_(/*31.6*/helper/*31.12*/.CSRF.formField),format.raw/*31.27*/("""
    """),format.raw/*32.5*/("""Username <input type="text" name="username" id="create-un"/><br/>
    Password <input type="password" name="password" id="create-pwd"/><br/>
    <input type="submit" value="Submit"/>
</form>
""")))}))
      }
    }
  }

  def render(loginForm:Form[LoginData],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)(request,flash)

  def f:((Form[LoginData]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => (request,flash) => apply(loginForm)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/login1.scala.html
                  HASH: 7b0cf816a42266d0d7856e6801d6c3a03c45cd01
                  MATRIX: 767->1|941->82|968->84|989->97|1027->98|1058->103|1433->451|1448->457|1508->496|1542->504|1557->510|1593->525|1625->530|1905->784|1919->790|1987->849|2026->850|2054->852|2068->858|2104->873|2132->875|2146->881|2200->914|2228->916|2242->922|2296->955|2324->956|2430->1032|2459->1034|2564->1112|2579->1118|2636->1154|2670->1162|2685->1168|2721->1183|2753->1188
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|36->12|36->12|36->12|37->13|37->13|37->13|38->14|44->20|44->20|44->20|44->20|45->21|45->21|45->21|46->22|46->22|46->22|47->23|47->23|47->23|48->24|51->27|53->29|54->30|54->30|54->30|55->31|55->31|55->31|56->32
                  -- GENERATED --
              */
          