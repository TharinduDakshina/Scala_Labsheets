package labsheet_05

import scala.io.StdIn

object Q4 {

  def checkEvenOrOdd(n: Int): String = {
    if (n==1) return "Odd";
    if(n==0) return "Even"
    else {
      return checkEvenOrOdd(n-2)
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter number : ");
    var number = StdIn.readInt();

    var responce=checkEvenOrOdd(number);
    println(responce);
  }
}
