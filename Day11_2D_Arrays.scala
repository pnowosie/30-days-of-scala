// https://www.hackerrank.com/challenges/30-2d-arrays

object Solution {
    def hourGlassSum(Mx: Array[Array[Int]])(top: Int)(left: Int) =
        Mx(top)(left) + Mx(top)(left+1) + Mx(top)(left+2)   +
                       Mx(top+1)(left+1)                    +
        Mx(top+2)(left) + Mx(top+2)(left+1) + Mx(top+2)(left+2)

    def main(args: Array[String]) {
        val Mx = 0 until 6 map { _ => readLine split " " map { _.toInt } } toArray
      
        print((
          for { x <- 0 to 3; y <- 0 to 3 } 
          yield hourGlassSum(Mx)(x)(y)   ) 
          max
        )
    }
}
