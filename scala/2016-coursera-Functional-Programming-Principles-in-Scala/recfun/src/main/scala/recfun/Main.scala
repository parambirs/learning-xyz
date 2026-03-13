package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int =
      if (c == 0 || c == r) 1
      else pascal(c - 1, r - 1) + pascal(c, r - 1)
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def count(init: Int, rest: List[Char]): Int =
        if (init < 0 || rest.isEmpty) init
        else if (rest.head == '(') count(init + 1, rest.tail)
        else if (rest.head == ')') if (init < 0) -1 else count(init - 1, rest.tail)
        else count(init, rest.tail)

      count(0, chars) == 0
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if(money < 0 || coins.isEmpty) 0
      else if (money == 0) 1
      else coins.map(coin => countChange(money - coin, coins.filter(_ <= coin))).sum
    }
  }
