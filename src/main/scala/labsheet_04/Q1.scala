package labsheet_04

object Q1 {
  def main(args: Array[String]): Unit = {
   var totalAmount= countfaltAndTotal(20000);
    println("Total Amount : "+totalAmount);
  }

  def countfaltAndTotal(dipositAmount: Double): Double = {
    if (dipositAmount > 20000) {
      if (dipositAmount > 200000) {
        if (dipositAmount > 2000000) {
          var total = dipositAmount * 3.50 / 100
          total = total + dipositAmount * 6.5 / 100
          return total + dipositAmount;
        } else {
          var total = dipositAmount * 4.0 / 100
          total = total + dipositAmount * 6.5 / 100
          return total + dipositAmount;
        }
      } else {
        var total = dipositAmount * 2.0 / 100
        total = total + dipositAmount * 6.5 / 100
        return total + dipositAmount;
      }
    } else {
      return dipositAmount
    }
  }
}
