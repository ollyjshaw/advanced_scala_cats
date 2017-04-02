package advancedscala
import org.scalatest.{Matchers, FlatSpec}
import JsonWriterInstances._
import JsonSyntax._

class PersonTest extends FlatSpec with Matchers{

  "A Person" should "serializable to Json" in {
    val dave = Person("Dave", "dave@dave.com")
    val david_json = Json.toJson(dave)
    println(david_json)
    david_json.asInstanceOf[JsObject].get.size shouldBe 2
    david_json.asInstanceOf[JsObject].get.size shouldBe 2
  }

  "A Person" should "serializable to Json with extension method" in {
    val dave = Person("Dave", "dave@dave.com")
    val david_json = dave.toJson
    println(david_json)
    david_json.asInstanceOf[JsObject].get.size shouldBe 2
    david_json.asInstanceOf[JsObject].get.size shouldBe 2
  }

}
