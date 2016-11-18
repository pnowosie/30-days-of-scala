// https://www.hackerrank.com/challenges/30-operators
object Solution {
  def main(args: Array[String]) {
    val (mealCost, tip, tax) = (readFloat, readInt, readInt)
    println("The total meal cost is %.0f dollars." format mealCost * (100+tip+tax)/100)
  }
}
