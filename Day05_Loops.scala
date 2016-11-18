// https://www.hackerrank.com/challenges/30-loops
object Solution {
    def main(args: Array[String]) {
        val n = readInt
        (for { 
            i <- 1 to 10 
         } yield s"$n x $i = ${n*i}"
        ).foreach(println)
    }
}
