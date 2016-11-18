// https://www.hackerrank.com/challenges/30-binary-numbers
object Solution {

    def main(args: Array[String]) {
        println( readInt.toBinaryString.split("0").max.length )
    }
}
