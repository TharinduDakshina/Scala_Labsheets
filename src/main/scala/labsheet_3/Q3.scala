package labsheet_3

object Q3 {
  def main(args: Array[String]) = {
    var (num1, num2) = (11, 12);
    avarage(num1, num2);
  }

  def avarage(x: Int, y: Int): Unit = {
    var z = x + y;
    var a: Double = z / 2.0;
    printf("%.2f\n", a)
  }

}
