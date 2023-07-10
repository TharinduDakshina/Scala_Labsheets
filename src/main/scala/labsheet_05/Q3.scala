package labsheet_05

import scala.io.StdIn

object Q3 {

  def sum(number: Int,tot:Int): Int = {
     if(number>0){
      return sum(number-1,tot+number)
     }else{
       return tot
     }
  }

  def main(args: Array[String]): Unit = {
    print("Enter number : ");
    var number = StdIn.readInt();
    var total=sum(number,0);
    println("Sum of "+number+" : "+total);
  }

}
