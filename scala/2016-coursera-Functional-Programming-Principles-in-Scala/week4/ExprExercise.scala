trait Expr
case class Number(n: Int) extends Expr
case class Var(ch: String) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr
case class Prod(e1: Expr, e2: Expr) extends Expr

object Main {
  def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(e1, e2) => eval(e1) + eval(e2)
  }

  def show(e: Expr, prec: Int = 0): String = e match {
    case Number(n) => n.toString
    case Var(ch) => ch
    case Sum(e1, e2) => prec match {
      case 0 => show(e1) + " + " + show(e2)
      case _ => "(" + show(e1) + " + " + show(e2) + ")"
    }
    case Prod(e1, e2) => show(e1, 1) + " * " + show(e2, 1)
  }

  def main(args: Array[String]): Unit = {
    println(show(Sum(Prod(Number(2), Var("x")), Var("y"))))
    println(show(Prod(Sum(Number(2), Var("x")), Var("y"))))
  }

}
