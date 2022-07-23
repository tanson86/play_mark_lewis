import org.scalatestplus.play.{HtmlUnitFactory, OneBrowserPerSuite, PlaySpec}
import org.scalatestplus.play.guice.GuiceOneServerPerSuite

class TaskList1InMemorySeleniumSpec extends PlaySpec with GuiceOneServerPerSuite with OneBrowserPerSuite with HtmlUnitFactory{
  "TaskList1InMemory" must {
    "login and access functions " in {
      goTo(s"http://localhost:$port/login1")
        pageTitle mustBe "Login"
        find("h2").foreach(s=>s mustBe "Login Using POST HTTP request")
        click on "login-un"
        textField("login-un").value = "tanson"
        click on "login-pwd"
        pwdField("login-pwd").value = "password"
        submit()
      eventually{ //This makes sure all tests are done after the page is loaded
        pageTitle mustBe "Task list"
        println("test reached here"+currentUrl) //this can be used to debug
        find("h2").foreach(s=>s mustBe "Tasklist")
        findAll("li").map(l=>l.text.matches("Work|Eat|Sleep"))
        findAll("li").toList equals  List("Work","Eat","Sleep","Love")
      }
    }
  }
}
