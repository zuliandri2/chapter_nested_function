object nested_func {

  def main(args: Array[String]): Unit = {

    println("Factorial of 2: " + factorials(2))
    println("Factorial of 3: " + factorials(3))
  }

  def factorials(x: Int): Int = {

    def fact(x: Int, accumulation: Int): Int = {
      if (x <= 1) accumulation
      else fact(x - 1, x * accumulation)
    }

    fact(x, 1)

  }

}
