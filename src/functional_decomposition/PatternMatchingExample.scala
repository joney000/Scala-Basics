package functional_decomposition
trait Expr 
case class Number(n:Int)extends Expr
case class Sum(e1 : Expr , e2 : Expr)extends Expr
//case class : matchable classes
object PatternMatchingExample extends App{
  
def show(e : Expr):String = e match {
    case Number(x) => x.toString
    case Sum(l , r)=> show(l)+" "+show(r)
  }
  print(show(Sum(Number(2) , Number(2))))
  val tuple = (1,2,3)
  val f = tuple._1
  print("\n"+tuple._3+"\n")
  print ("Merge Sort Starts \n")
  def msort[T]( arr : List[T])(comp : (T,T)=> Boolean) : List[T] = {
    
    val halfSize = arr.length / 2
    if(halfSize == 0)arr
    else {
          def merge[T] ( a : List[T] , b : List[T])(comp : (T,T)=> Boolean) : List[T] = (a,b) match {
            case (Nil , b) => b
            case (a , Nil) => a
            case (firstElemA :: remainListA  , firstElemB :: remainListB ) => // head :: remainList
              if(comp(firstElemA,firstElemB))firstElemA :: merge (remainListA , b)(comp)
              else firstElemB :: merge (a ,remainListB)(comp)
          }
          val (a, b) = arr splitAt(halfSize)
          merge(msort(a)(comp) , msort(b)(comp))(comp)
    }
  }
  val list = List(1,3,-4,5,7,-2,-54)
  val resList =  msort(list)((x:Int , y:Int) => x <= y)
  print("\n"+resList+"\n")
  val listName = List("jas" , "tarun" , "rahul")
  val resName =  msort(listName)((x:String , y:String) => x <= y)
  print("\n"+resName+"\n")
}
