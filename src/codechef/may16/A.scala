//package codechef.may16

package codechef.may16

import scala.math._
import scala.io.StdIn._
import scala.util.Random
import scala.collection.mutable.ArrayBuffer


object Main extends App{
    
   
   
    def prec(a : ArrayBuffer[Int] , rmq : ArrayBuffer[ArrayBuffer[Int]] , SparseTable : ArrayBuffer[Int]) = {
     val n = a.size
     
     
	   for(i <- 0 to n-1)rmq(0)(i) = i
	   
     for (k <- 1 to 20 ; if ((1<<k)< n) ) {
	      for (i <- 0 to n; if ((i + (1<<k))<= n)) {
          val x = rmq(k-1)(i)
          val y = rmq(k-1)(i+(1<<k-1));
          if(a(x)<=a(y))rmq(k)(i) = x; 
		      else rmq(k)(i) = y;//assign min index
        }
     }
  
   }
    def qr(i : Int , j : Int , a : ArrayBuffer[Int] , rmq : ArrayBuffer[ArrayBuffer[Int]] , SparseTable : ArrayBuffer[Int]) : Int = {
      val k = SparseTable(j-i)
      val p = rmq(k)(i)
      val q = rmq(k)(j-(1<<k)+1)
//      println("qr "+k+" "+p+" "+q)
      if(a(p) <= a(q))return p 
      else return q
     
    }
    def kth(l : Int,r : Int, k : Int, arr : ArrayBuffer[Int]) :Int = {
		
		 // If k is smaller than number of elements in array
    if(k > 0 && k <= r - l + 1)
    {
        val pos = rand(arr, l, r);
        if (pos-l == k-1)return arr(pos);
        if (pos-l > k-1)return kth(l, pos-1, k,arr);
        return kth(pos+1, r, k-pos+l-1,arr);
    }
    return -10000000;
	}
	def rand(arr : ArrayBuffer[Int], l : Int, r : Int): Int = {
    val n = r-l+1;
    val pivot = ((int)(Math.random()*1000000)) % n;
    swap(arr,l + pivot,r);
    part(arr, l, r);
	}
 def swap( arr : ArrayBuffer[Int],a : Int, b : Int) : Unit = {
	  val temp = arr(a);
	  arr(a)= arr(b);
	  arr(b)=temp;
	}
	public static int part(int arr[], int l, int r)throws Exception{
    int x = arr[r], i = l;
    for (int j = l; j <= r - 1; j++)
    {
        if (arr[j] <= x)
        {
            swap(arr,i,j);
            i++;
        }
    }
    swap(arr,i,r);
    return i;
}
    def run = {
          val sss = readLine.split(" ")
          val n = sss(0).toInt
          val m = sss(1).toInt
          
          var SparseTable = ArrayBuffer.fill(n+2)(0)
          for(i <- 2 to n)SparseTable(i) = SparseTable(i>>1)+1
          var rmq = ArrayBuffer.fill(SparseTable(n)+1 ,n)(0)
          var a = ArrayBuffer.fill(n)(0)
          
          val s = readLine.split(" ")
          for(j <- 1 to n)a(j-1) = s(j-1).toInt
          prec(a ,rmq,SparseTable)
          var ans = 0L
          for(j <- 1 to m){
             val ss = readLine.split(" ")
             var t = (((ss(0).toInt * 1L * max(ans,0L)  + ss(1).toInt)%n+ 1), (((ss(2).toInt * 1L * max(ans,0L))+ ss(3).toInt )%n+ 1))
             if(t._1 > t._2)t = t.swap
             val idx = qr(t._1.toInt - 1, t._2.toInt - 1  ,a , rmq , SparseTable)
             ans = a(idx)
   //          println("min l = " + t._1 +"  r = "+t._2 + " min idx = "+idx);
             println(ans)
          }
         /*
          for (k <- 0 to 20 ; if ((1<<k)< n) ) {
			      for(j <- 0 to n-1)print(""+rmq(k)(j)+" ");
			      print("\n");
		      }
          
          */
   }
        
   run
 	
}
