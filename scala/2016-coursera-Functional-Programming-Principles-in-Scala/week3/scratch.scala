import week3.Rational
import week3._

object scratch {
  def main(args: Array[String]): Unit = {
    println(new week3.Rational(1, 2))
    println(new Rational(1, 2))
  }

  def error(msg: String) = throw new Error(msg)
  error("test")

  val x = null
  val y: String = x
  val z: Int = null
}
