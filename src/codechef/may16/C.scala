//
package codechef.may16
import scala.math._
import scala.io.StdIn._
import scala.util.Random
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Map
import scala.collection.mutable.HashMap
import scala.collection.mutable.Set




object Main extends App{
    
    var m = ArrayBuffer.empty[(Set[Int] , Long)]
    var a = 0
    var b = 0
    var res = 0L
    val mod = 1000*1000*1000L + 7
    def gcd(a: Int , b: Int): Int = if(b==0)a else gcd(b , a%b )
    def run = {
          val tests = readInt
          for(t <- 1 to tests){
              var s = readLine.split(" ")
              a = s(0).toInt
              b = s(1).toInt
              m = ArrayBuffer.empty[(Set[Int] , Long)]
              if(b==1){
                 println(1)
                 
              }else if(b==2){
                for(i <- 1 to b ; j <- i to b;if(gcd(i,j)==1))m += ((Set(i,j), 1))
                println(m.size)
              }else{
                for(i <- 1 to b ; j <- i to b;if(gcd(i,j)==1))m += ((Set(i,j), 1))
                for(i<- 3 to a){
                  temp = ArrayBuffer.empty[(Set[Int] , Long)];
                  for(j <- 1 to b){
                    var check = false
                    for(k <- 1 to )
                  }
                }
                }
              //	println("time= "+(end -st)/1000.0)
          }
      }
        
      run
 
          
}
