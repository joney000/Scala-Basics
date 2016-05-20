import scala.math._

object Sqrt extends App{
  //neuton's method for sqrt calculation
  
  def sqrt(res: Double , x : Double):Double = {
      def isGood(res : Double ,x: Double):Boolean = if(abs(res * res - x) <= 0.0000000001D)true else false
      if(isGood(res,x))res
      else sqrt((x/res + res)/2 , x)
  }
  val a = sqrt(1D,2)
  println(a)
  
}