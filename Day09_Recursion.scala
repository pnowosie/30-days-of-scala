// https://www.hackerrank.com/challenges/30-recursion
object Solution {
    def main(args: Array[String]) {
        def factorial(n: Int): Int = if (n > 1) n * factorial(n-1) else 1
        
        List( readInt ) map factorial foreach println
    }
}
