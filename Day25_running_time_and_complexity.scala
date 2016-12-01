object Solution {
    
    def isPrime(n: Int) = 
      !(2 to math.sqrt(n).toInt exists { n % _ == 0 }) && n > 1
  
    def main(args: Array[String]) {
        Iterator.continually(readInt)
          .take (readInt)
          .map (isPrime) 
          .map { if (_) "Prime" else "Not prime" } 
          .foreach (println)
    }
}
