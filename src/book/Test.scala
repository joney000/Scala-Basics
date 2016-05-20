package book
// Basic Programming Syntex
import scala.util.control.Breaks._
import java.text.MessageFormat
import Array._
import scala.collection.mutable.ArrayBuffer

object Test{
  def main(args : Array[String]) = {
    for(i <- 1 to 10)print(i+" ")
    println()
    for(i <- 1 until 10)print(i+" ")
    println()
    //Nested Loop
    for(i <- 1 to 5 ; j <- 1 to 3)println(i+" + "+j+" = "+(i+j))
    println()
    /*
     * by default there is no jump statements in scala 
     * i.e no break or continue
     */
     // break replacement
     breakable {
         for(i <- 1 to 5 ; j <- 1 to 3)if(i+j > 6)break; else println("in breakable "+i+" + "+j+" = "+(i+j))
     }
    // continue replacement
    for(i <- 1 to 5 ; j <- 1 to 3 if(i+j < 6))println("in continue "+i+" + "+j+" = "+(i+j))
    
    // Yield : store result in a vector
    val newarr = for(i <- 1 to 5)yield i % 2
    
    
    println()
    // for loop can be written in multiple lines 
    for{
      i <- 1 to 5 
      temp = i- 3;
      j <- temp to 0
    }println("i="+i+" j="+j)
    
    println
    // function that takes variable no of args
    def sum(arr : Int*) = {
      var x = 0
      for(a_i <- arr)x = x + a_i
      x
    }
    println(sum(4 ,3 ,4 , 5))
    println(sum(4 , 5))
    
    println
    val str = MessageFormat.format("the ans is {0} for {1}" , " everything" ,42.asInstanceOf[AnyRef])
    println(str)
    
    //Arrays
    val arr = ofDim[Int](10)
    for( i <- 0 to 9) arr(i) = i;
    println(arr(1))
    val arr1 = ofDim[Int](10,10)
    for( i <- 0 to 9 ; j <- 0 to 9) arr1(i)(j) = i*j;
    println(arr1(2)(5))    
    
    //Variable Arrays
    val arr2 = ArrayBuffer[Int]()
    arr2 += 1
    arr2 += 12
    arr2 += (3,4,5)
    println(arr2(4))
   
    arr2 ++= Array(32,14,25)   // Imp : you can add any type of collection by ++= function
    println(arr2(6))
    
    //Map
    val mp = Map("a" -> 3 , "b" -> 6 , "c" -> 7)
    println("map = "+mp)
    
    
    
    
  }   
}