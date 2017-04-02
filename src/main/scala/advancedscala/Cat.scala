package advancedscala
import PrintableInstances._
import PrintableSyntax._

/**
  * Created by ollyshaw on 02/04/17.
  */
case class Cat (name: String, age: Int, color: String)

object Cat {
implicit val catPrintable = new Printable[Cat] {
  override def format(value: Cat): String = {
    val name = value.name.formaty
    val age = value.age.formaty
    val color = value.color.formaty
    s"$name is $age and is $color"
  }
}
}