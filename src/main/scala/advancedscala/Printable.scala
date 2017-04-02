package advancedscala

trait Printable[A] {
  def format(value: A): String
}

object PrintableInstances {
  implicit val stringPrinter = new Printable[String] {
    override def format(value: String): String = value
  }
  implicit val intPrinter = new Printable[Int] {
    override def format(value: Int): String = value.toString
  }
}


object PrintableSyntax {

  implicit class PrinterOps[A](value: A) {
    def formaty(implicit f: Printable[A]): String = f.format(value)

    def printy(implicit f: Printable[A]): Unit = {
      println(f.format(value))
    }
  }

}