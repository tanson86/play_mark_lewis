import models.TaskList1InMemoryModel
import org.scalatestplus.play._

class TaskList1InMemoryModelTest extends PlaySpec{

  "TaskList1InMemoryModel" must {
    "do valid login for default user" in {
      TaskList1InMemoryModel.validateUser("tanson","password") mustBe(true)
    }

    "reject login with valid username but wrong pwd" in {
      TaskList1InMemoryModel.validateUser("tanson","passwordd") mustBe(false)
    }

    "reject login with invalid username but correct pwd" in {
      TaskList1InMemoryModel.validateUser("tansonn","password") mustBe(false)
    }

    "get tasks for default user" in {
      TaskList1InMemoryModel.getTasks("tanson") mustBe(List("Work","Eat","Sleep"))
    }

    "create new user" in {
      TaskList1InMemoryModel.createUser("thomas","password") mustBe(true)
      TaskList1InMemoryModel.getTasks("thomas") mustBe(Nil)
      TaskList1InMemoryModel.createUser("thomas","password") mustBe(false)
    }

    "create new user with an existing username" in {
      TaskList1InMemoryModel.createUser("tanson","password") mustBe(false)
    }

    "add task for user" in {
      TaskList1InMemoryModel.addTask("tanson","Todo")
      TaskList1InMemoryModel.getTasks("tanson") mustBe(List("Todo","Work","Eat","Sleep"))
      TaskList1InMemoryModel.getTasks("tanson") must contain("Todo")
    }

    "add new task for new user" in {
      //TaskList1InMemoryModel.createUser("thomas","password") mustBe(true)
      TaskList1InMemoryModel.getTasks("thomas") mustBe(Nil)
      TaskList1InMemoryModel.addTask("thomas","Todo1")
      TaskList1InMemoryModel.getTasks("thomas") mustBe(List("Todo1"))
    }

    "remove task for user" in {
      TaskList1InMemoryModel.removeTask("tanson", "Sleep")
      TaskList1InMemoryModel.getTasks("tanson") must not contain("Sleep")
    }

  }
}
