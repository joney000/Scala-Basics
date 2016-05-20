package functional_decomposition
import math.Ordering

object PatternMatchingExample_Impicit extends App{

  def msort[T]( arr : List[T])(implicit ord : Ordering[T]) : List[T] = {
    
    val halfSize = arr.length / 2
    if(halfSize == 0)arr
    else {
          def merge( a : List[T] , b : List[T]) : List[T] = (a,b) match {
            case (Nil , b) => b
            case (a , Nil) => a
            case (firstElemA :: remainListA  , firstElemB :: remainListB ) => // head :: remainList
              if(ord.lt(firstElemA,firstElemB))firstElemA :: merge (remainListA , b)
              else firstElemB :: merge (a ,remainListB)
          }
          val (a, b) = arr splitAt(halfSize)
          merge(msort(a) , msort(b))
    }
  }
  val list = List(1,3,-4,5,7,-2,-54)
  val resList =  msort(list)
  print("\n"+resList+"\n")
  val listName = List("jas" , "tarun" , "rahul")
  val resName =  msort(listName)
 
    for(name <- resName)
      yield "sa"+name 
}
