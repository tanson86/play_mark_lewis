
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

object tasklist2SPA extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request:RequestHeader, flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Task list 2 SPA")/*3.25*/{_display_(Seq[Any](format.raw/*3.26*/("""
    """),format.raw/*4.5*/("""<div id="contents"></div>

<input id="csrfToken" type="hidden" value=""""),_display_(/*6.45*/helper/*6.51*/.CSRF.getToken.value),format.raw/*6.71*/(""""/>
    <input id="validatePath" type="hidden" value=""""),_display_(/*7.52*/routes/*7.58*/.TaskList2Controller.validate),format.raw/*7.87*/(""""/>

<script src=""""),_display_(/*9.15*/routes/*9.21*/.Assets.versioned("javascripts/taskList2.js")),format.raw/*9.66*/(""""></script>
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
                  SOURCE: app/views/tasklist2SPA.scala.html
                  HASH: 2c365ae2ae87734783c13e9fe679c2d8f827f5df
                  MATRIX: 749->1|890->49|917->51|948->74|986->75|1017->80|1114->151|1128->157|1168->177|1249->232|1263->238|1312->267|1357->286|1371->292|1436->337
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|30->6|30->6|30->6|31->7|31->7|31->7|33->9|33->9|33->9
                  -- GENERATED --
              */
          