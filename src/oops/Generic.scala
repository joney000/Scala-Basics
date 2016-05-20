package oops

class Node[T](val data : T  ,val next : Node[T])

object Generic extends App{
   def nth[T](curr : Node[T] , n: Int) : T = {
     if(n==1)curr.data
     //else if(curr.next==null)error("size is less then n")
     else nth(curr.next , n-1)
   }
   
   val list = new Node(2,new Node(3,new Node(5,null)))
   print(nth(list,3))
 }