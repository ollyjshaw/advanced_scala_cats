package advancedscala

import advancedscala.PrintableInstances._
import advancedscala.PrintableSyntax._
import cats.syntax.show._
import cats.syntax.eq._
import org.scalatest.{FlatSpec, Matchers}


class CatTest extends FlatSpec with Matchers {

  "A Cat" should "format properly" in {
    val kitty = Cat("bill", 3, "red")
    val name = kitty.name.formaty
    name shouldBe "bill"
  }

  it should "print itself" in {
    val kitty = Cat("bill", 3, "red")
    kitty.formaty shouldBe "bill is 3 and is red"
  }

  it should "show" in {
    val kitty = Cat("bill", 3, "red")
    kitty.show shouldBe "bill is 3 and is red (from show)"
  }

  it should "equal itself" in {
    val kitty = Cat("bill", 3, "red")
    val kitty2 = Cat("bill", 3, "red")

    kitty =!= (kitty2) shouldBe false
  }

  it should "not equal another" in {
    val kitty = Cat("bill", 3, "red")
    val kitty2 = Cat("bob", 3, "red")

    kitty =!= (kitty2) shouldBe true
  }

}
