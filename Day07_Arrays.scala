// https://www.hackerrank.com/challenges/30-arrays
object Solution {
    def main(args: Array[String]) {
        readLine // ignore N
        println(
          (readLine split " " reverse)
          mkString " "
        )
    }
}
