// https://www.hackerrank.com/challenges/30-review-loop
object Solution {
    def main(args: Array[String]) {
        for (T <- 1 to readInt) {
            val (evens, odds) = (readLine zipWithIndex) partition  { _._2%2==0 }
          println(s"${str(evens)} ${str(odds)}")
        }
    }
  
    def str(p: Seq[(Char,Int)]) = (p map { _._1 }) mkString 
}
