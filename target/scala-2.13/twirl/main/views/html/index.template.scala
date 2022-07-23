
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String)(implicit flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Play with Scala.js")/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
	"""),format.raw/*4.2*/("""<h2>Standard template</h2>

	<p id="randomNumP">Click for a new random number: <span id="randomNum">4</span></p>

	<script src=""""),_display_(/*8.16*/routes/*8.22*/.Assets.versioned("javascripts/basic.js")),format.raw/*8.63*/(""""></script>
""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(message:String,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(message)(flash)

  def f:((String) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (message) => (flash) => apply(message)(flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 8d975cddd0b51cfbd23d4ea3734497aa258ada74
                  MATRIX: 735->1|868->41|895->43|929->69|968->71|996->73|1151->202|1165->208|1226->249|1268->262
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|32->8|32->8|32->8|33->9
                  -- GENERATED --
              */
          