package labsheet_05

import scala.io.StdIn

object Q1 {

  def checkPrime(number: Int,i: Int):Boolean = {

    if(i<=2){
       if(number==2){
         return true;
       }
    }
    if(number%i==0){
      return false;
    }
    if(i*i>number){
      return true;
    }

    return checkPrime(number, i+1);
  }

  def getNumber(): Unit = {
    print("Enter number : ");
    var number=StdIn.readInt();
    if (checkPrime(number,2)){
        println("true");
    } else {
      println("false");
    }
  }

  def main(args: Array[String]): Unit = {
    getNumber();
  }
}
