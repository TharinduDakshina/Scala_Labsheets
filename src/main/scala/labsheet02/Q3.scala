package labsheet02

object Q3 {

  def getTotal(hour: Int, ot: Int): Unit = {
    var total=(hour*250.0)+(ot*85);
    total=total-(total*12.0)/100;
    println("Salary : "+total);
  }

  def main(args: Array[String]): Unit = {
    getTotal(40,30);
  }
}
