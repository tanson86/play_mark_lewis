
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

object tasklist2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tasks:Seq[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<h2>Tasklist 2</h2>

<ul>
    """),_display_(/*6.6*/for((t,i)<-tasks.zipWithIndex) yield /*6.36*/{_display_(Seq[Any](format.raw/*6.37*/("""
        """),format.raw/*7.9*/("""<li onclick="deleteTask("""),_display_(/*7.34*/i),format.raw/*7.35*/(""")">"""),_display_(/*7.39*/t),format.raw/*7.40*/("""</li>
    """)))}),format.raw/*8.6*/("""
"""),format.raw/*9.1*/("""</ul>


<br>
    Add task <input type="text" id="newtask"/><br>
    <button onclick="addTask()"> Add </button>

<div>
    <a href=""""),_display_(/*17.15*/routes/*17.21*/.TaskList1Controller.logout),format.raw/*17.48*/("""">Logout</a>
</div>"""))
      }
    }
  }

  def render(tasks:Seq[String]): play.twirl.api.HtmlFormat.Appendable = apply(tasks)

  def f:((Seq[String]) => play.twirl.api.HtmlFormat.Appendable) = (tasks) => apply(tasks)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/tasklist2.scala.html
                  HASH: b3d101b5112c1f447a8abe1dfdec9f451746063e
                  MATRIX: 738->1|851->21|878->22|934->53|979->83|1017->84|1052->93|1103->118|1124->119|1154->123|1175->124|1215->135|1242->136|1401->268|1416->274|1464->301
                  LINES: 21->1|26->2|27->3|30->6|30->6|30->6|31->7|31->7|31->7|31->7|31->7|32->8|33->9|41->17|41->17|41->17
                  -- GENERATED --
              */
          