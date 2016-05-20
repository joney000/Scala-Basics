package oops

class Rational( x :Int , y :Int ) {  // parameterzed constructor
  private def nu :Int = x
  private def de :Int = y
  //
  def this( x : Int) = this(x,1)  //constructor with 1 param
  
  private def g(a : Int , b : Int):Int = {
    if(b==0)a
    else g( b , a%b)
  }
  def add(a : Rational , b:Rational):Rational = {
    val up = a.nu * b.de + a.de * b.nu
    val down = a.de * b.de
    val gcd = g(a.nu * b.de + a.de * b.nu , a.de * b.de )
    return new Rational(up/gcd , down / gcd)
  }
  override def toString = "" +nu +"/"+de
  
  
}
object rationals extends App{
  var rr = new Rational(2,3)
  print(rr+"\n")
  rr = rr.add(rr,new Rational(5,2))
  print(rr+"\n")
  
}