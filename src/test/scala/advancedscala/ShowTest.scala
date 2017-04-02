package advancedscala

import java.util.Date

import cats.Show
import cats.instances.int._
import cats.instances.string._
import cats.syntax.show._
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by ollyshaw on 02/04/17.
  */
class ShowTest extends FlatSpec with Matchers {

  "some objects" should "show" in {
    val showInt = 123.show
    showInt shouldBe "123"

    val showString = "foo".show
    showString shouldBe "foo"
  }

  "dates " should "show" in {
    val date = new Date()
    implicit val dateShow: Show[Date] = {
      Show.show(date => s"${date.getTime} ms since epoch")
    }
    date.show.endsWith("epoch") shouldBe true
  }
}
