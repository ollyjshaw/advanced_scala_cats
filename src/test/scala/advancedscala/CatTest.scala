package advancedscala

import advancedscala.JsonSyntax._
import advancedscala.JsonWriterInstances._
import org.scalatest.{FlatSpec, Matchers}
import advancedscala.PrintableSyntax._
import advancedscala.PrintableInstances._


class CatTest extends FlatSpec with Matchers{

  "A Cat" should "format properly" in {
    val kitty = Cat("bill", 3, "red")
    val name = kitty.name.formaty
    name shouldBe "bill"
  }

  it should "print itself" in {
    val kitty = Cat("bill", 3, "red")
    kitty.formaty shouldBe "bill is 3 and is red"
  }

}
