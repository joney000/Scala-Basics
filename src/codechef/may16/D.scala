//package codechef.may16
/*
 * 
 */
/*
package codechef.may16

import scala.math._
import scala.io.StdIn._
import scala.util.Random
import scala.collection.mutable.ArrayBuffer



object Main extends App{
    
    
    var a = ArrayBuffer.fill(100001)(0)
    var b = ArrayBuffer.fill(100001)(0)
    val INF_L = BigInt(10000000000000L)
    var n = 0
    var W = BigInt(0L)
    var L = BigInt(0L)
    // binary search functional
    def binarySearch(list: ArrayBuffer[Int], target: BigInt, ll: BigInt, rr: BigInt): BigInt = {
        
      
        var m = BigInt(0)
        var l = ll
        var r = rr
        
        while( l <= r ){
             m = l + (r-l)/2;
 //          println("In here :"+l+" "+m+" "+r+" "+ch(m,target))
             if( ch(m ,target) ){ // second comparison
                  r = m - 1
             }else{
                 l = m + 1
             }
          if(l > r) return l         
        }
        return -1
 
    }
    def ch(mid: BigInt , target : BigInt): Boolean = {
      var tot : BigInt = BigInt(0L)
      for(i <- 1 to n){
        val after : BigInt = a(i) + b(i) * mid
        if(after >= L)tot += after
        if(tot >= target)return true
      }
 //     println("In ch :"+target+" "+tot)
      if(tot >= target)return true
      else return false
    }
    def run = {
         
              val s = readLine.split(" ")
              n = s(0).toInt
              W = BigInt(s(1).toLong)
              L = BigInt(s(2).toLong)
              for(i <- 1 to n){
                val ss = readLine.split(" ")
                a(i) = ss(0).toInt
                b(i) = ss(1).toInt
              }
              var st = BigInt(0L)
              var end = BigInt("40000000000000700000")
              val ans = binarySearch(a ,W ,st,end)
              print(ans)
        
          
   }
        
   run
 	
}
*/