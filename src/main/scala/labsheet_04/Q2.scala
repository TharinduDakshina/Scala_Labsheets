package labsheet_04

import scala.io.StdIn

object Q2 {

  def checkType(value:Int): Unit = {
    if(value<0)println("Negative number.");
    else if(value==0) println("Zero")
    else if((value%2)==0)println("Even Number");
    else println("Odd number");
  }

  def getInput(): Unit = {
    print("Enter any integer : ");
    var value= StdIn.readInt();
    checkType(value)
  }

  def main(args: Array[String]): Unit = {
    getInput();
  }

}
