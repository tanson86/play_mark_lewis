
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

object tasklist1 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Seq[String],RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tasks:Seq[String])(implicit request:RequestHeader, flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Task list")/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""
    """),format.raw/*4.5*/("""<h2>Tasklist</h2>

<!--    An alternate approach using post -->
<!--    <ul>-->
<!--        """),_display_(/*8.14*/for((t,i) <- tasks.zipWithIndex) yield /*8.46*/{_display_(Seq[Any](format.raw/*8.47*/("""-->
<!--            <li> """),_display_(/*9.23*/t),format.raw/*9.24*/(""" """),format.raw/*9.25*/("""</li>-->
<!--            <form method="post" action=""""),_display_(/*10.46*/routes/*10.52*/.TaskList1Controller.deleteTask1ViaPost),format.raw/*10.91*/("""">-->
<!--                """),_display_(/*11.22*/helper/*11.28*/.CSRF.formField),format.raw/*11.43*/("""-->
<!--                <input type="hiden" name="index" value=""""),_display_(/*12.62*/i),format.raw/*12.63*/(""""/><br>-->
<!--                <input type="submit" value="submit"/>-->
<!--            </form>-->
<!--        """)))}),format.raw/*15.14*/("""-->
<!--    </ul>-->
    <table>
        """),_display_(/*18.10*/for(t<-tasks) yield /*18.23*/{_display_(Seq[Any](format.raw/*18.24*/("""
        """),format.raw/*19.9*/("""<tr>
            <td>"""),_display_(/*20.18*/t),format.raw/*20.19*/("""</td>
            <td><a href=""""),_display_(/*21.27*/routes/*21.33*/.TaskList1Controller.deleteTask1(t)),format.raw/*21.68*/("""">Delete</a></td>
        </tr>
        """)))}),format.raw/*23.10*/("""

    """),format.raw/*25.5*/("""</table>

    <br>
    <form method="post" action=""""),_display_(/*28.34*/routes/*28.40*/.TaskList1Controller.addTask1),format.raw/*28.69*/("""">
        """),_display_(/*29.10*/helper/*29.16*/.CSRF.formField),format.raw/*29.31*/("""
        """),format.raw/*30.9*/("""<input type="text" name="task"/><br>
        <input type="submit" value="submit"/>
    </form>

    <div>
        <a href=""""),_display_(/*35.19*/routes/*35.25*/.TaskList1Controller.logout),format.raw/*35.52*/("""">Logout</a>
    </div>
""")))}))
      }
    }
  }

  def render(tasks:Seq[String],request:RequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(tasks)(request,flash)

  def f:((Seq[String]) => (RequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (tasks) => (request,flash) => apply(tasks)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/tasklist1.scala.html
                  HASH: 5ca6b976d0d2846765605e2cecde1e4a3e04565c
                  MATRIX: 758->1|916->66|943->68|968->85|1006->86|1037->91|1156->184|1203->216|1241->217|1293->243|1314->244|1342->245|1423->299|1438->305|1498->344|1552->371|1567->377|1603->392|1695->457|1717->458|1860->570|1929->612|1958->625|1997->626|2033->635|2082->657|2104->658|2163->690|2178->696|2234->731|2306->772|2339->778|2418->830|2433->836|2483->865|2522->877|2537->883|2573->898|2609->907|2760->1031|2775->1037|2823->1064
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|39->15|42->18|42->18|42->18|43->19|44->20|44->20|45->21|45->21|45->21|47->23|49->25|52->28|52->28|52->28|53->29|53->29|53->29|54->30|59->35|59->35|59->35
                  -- GENERATED --
              */
          