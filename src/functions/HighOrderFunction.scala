package functions

object HighOrderFunction extends App{
  
  def f1(a : Int) : Int = a * a * a;
  def f2(a : Int) : Int = 2 * a;
  def sum(fn: Int => Int ,a : Int , b : Int) : Int = {
     if(a > b)0
     else fn(a) + sum(fn,a+1,b)
  }
  //higher order fn
  val p = sum(f1,1,5)
  val q = sum(f2,1,5)
  print(""+p+" "+q+"\n")
  // anonymous fns
  val r = sum(x => x*x*x ,1,5)
  val s = sum(x => 2*x ,1,5)
  print(""+r+" "+s+"\n")
  
  
}