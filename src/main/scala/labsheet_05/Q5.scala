package labsheet_05

import scala.io.StdIn

object Q5 {

  def main(args: Array[String]): Unit = {
    print("Enter number : ");
    var number = StdIn.readInt();

    var responce = checkEvenOrOdd(number,0);
    println("Sum of even numbers : "+responce);
  }

  def checkEvenOrOdd(n: Int,tot:Int): Int = {
    if(n>0){
      if(n%2==0){
        return checkEvenOrOdd(n-1,tot+n)
      }else {
        return checkEvenOrOdd(n-1,tot)
      }
    }else{
      return tot;
    }
  }

}
