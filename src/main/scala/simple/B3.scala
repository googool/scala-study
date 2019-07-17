package simple2

import java.util.Date

object B3 extends App {

  def f(up: Int) = {
    var a = 0
    var b = 1
    for (i <- 1 to up) {
      val c = a + b
      a = b
      b = c % 1000000007
    }
    a
  }

  val n = 1000000000
  val start = new Date().getTime
  println(f(n))
  val end = new Date().getTime
  println(end - start)

}
