object HelloWorksheet {
  println("Welcome to the new Scala worksheet")   //> Welcome to the new Scala worksheet
  def fun ( a : Int , b : Int):Int = if( a %2 == 0)a else b;
                                                  //> fun: (a: Int, b: Int)Int
  var x = fun(2,5)                                //> x  : Int = 2
  x = fun(3,5)
}