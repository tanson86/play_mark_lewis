
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

object login2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*4.1*/("""<h2>Login User</h2>
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
<button onclick="createUser()" id="create-btn">Create</button>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/login2.scala.html
                  HASH: a85e6498d479f0bd92673427c553341e405d91e6
                  MATRIX: 723->1|819->4|847->6
                  LINES: 21->1|26->2|28->4
                  -- GENERATED --
              */
          