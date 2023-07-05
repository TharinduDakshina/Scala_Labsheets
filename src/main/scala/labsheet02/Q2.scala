package labsheet02

object Q2 {

  def main(args: Array[String]): Unit = {
    var (a:Int,b:Int,c:Int,d:Int)=(2,3,4,5);
    var k:Float=4.3f;

    println("a) println( - -b * a + c *d --); --> "+(b-1*a+c*d));
    b=b-1;
    d=d-1;
    println("b) println(a++); --> "+(a+1));
    a=a+1;
    println("c) println (–2 * ( d – k ) +c); --> "+(-2*(d-k)+c));
    println("d) println (c=c++); --> "+(c));
    c=c+1;
    println("e) println (c=++c*a++); --> "+((c+1)*a));
    c=c+1;
    a=a+1;
  }

}
