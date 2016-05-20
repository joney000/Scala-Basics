/*
package codechef.may16
import scala.math._
import scala.io.StdIn._
import scala.util.Random
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Map
import scala.collection.mutable.HashMap




object Main extends App{
    
    var m = ArrayBuffer.empty[Long]
  
    var a = 0
    var b = 0L
    var res = 0L
    val mod = 1000*1000*1000L + 7

   
     def rec1(pos : Int, sum : Long , mapPos : Int) : Unit= {
      
     
      if(pos==a && sum == b){
        res = (res + 1) % mod
   //     println("Inc on call"+calls);
//        println("In Rec0 : "+res+" "+ pos+ " " +sum);
      }
      if(pos < a && sum < b ){
    
        for(i <- mapPos to (m.length-1)) { 
                   
              rec1(pos + 1 ,m((m.length-1)-i) + sum ,i)
        }
      
      }
    }
    def rec(pos : Int, sum : Long , parent : Long) : Unit= {
      
     
      if(pos==1 && sum >= 0){
        for(i <- 0 to (m.length-1)) { 
            if(m((m.length-1)-i)==sum && m((m.length-1)-i) <= parent){ 
              res = (res + 1) % mod
   //           println("curr res = "+res)
              return
            }
        }
   //    println("Inc on call"+calls);
//        println("In Rec0 : "+res+" "+ pos+ " " +sum);
      }
      
      if(pos > 1 && sum > 0 ){
        
        var factor : Double = sum*1.0D / pos;
   //     println("pos = "+pos+" sum = "+sum+" fact = "+factor)

        for(i <- 0 to (m.length-1)) { 
                   
              if(m((m.length-1)-i) >= factor && m((m.length-1)-i) < sum && m((m.length-1)-i) <= parent){
   //              println("calling pos = "+(pos -1)+"new sum = "+ sum+" - "+ m((m.length-1)-i)+" = "+(sum - m((m.length-1)-i) ) +" fact = "+factor + " parent = "+parent)
               
              
                rec(pos - 1 , sum- m((m.length-1)-i) , m((m.length-1)-i))
              }
        }
      
      }
    }
       
   

    def run = {
         
         val st1 = System.currentTimeMillis 
         val end1 = System.currentTimeMillis 
      //    println("prec time= "+(end1 -st1)/1000.0)
     //     println(dp)
          val tests = readInt
         
          var mp = Map((1,1L)->1L)
          
          for(t <- 1 to tests){
              var s = readLine.split(" ")
              a = s(1).toInt
              b = s(0).toLong
              m = ArrayBuffer.empty[Long]
 //             m += 0
              if(b>=1)m += 1
              if(b>=2)m += 2
              var sum  = 3L
              while(sum <= b){
                m += sum
                sum = m(m.length - 1) + m(m.length-2) 
              }
             
              res = 0L
        //      val st = System.currentTimeMillis 
          //    val ans1 = mp.get((a,b))   
         //     if(ans1 == None){
                 rec(a,b,10000000000L)
        //         mp += (a,b) -> res
        //       }else res = ans1.get
                  println(""+res)
            //  println("test :"+t+" "+"res = "+res)
            //  println("size="+m.length + " calls = "+calls)
            //  println("res = "+res)
        //        println("new : "+res)
         //       println("new : "+res)
        //        println("new = "+res)
                res = 0
         //       rec1(0,0,0)
          //      println("old = "+res)
        //      val end = System.currentTimeMillis 
             //	println("time= "+(end -st)/1000.0)
          }
      }
        
      run
 
          
}
*/