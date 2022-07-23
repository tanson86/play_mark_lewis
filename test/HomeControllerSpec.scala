import controllers.HomeController
import org.scalatestplus.play.PlaySpec
import play.api.test.Helpers.{contentAsString, defaultAwaitTimeout}
import play.api.test._

class HomeControllerSpec extends PlaySpec{
  "HomeController" must {
    "give back expected page " in {
      val controller = new HomeController(Helpers.stubControllerComponents())
      val result = controller.index().apply(FakeRequest())
      val bodyText = contentAsString(result)
      bodyText must include ("Standard template")
    }


  }
}
