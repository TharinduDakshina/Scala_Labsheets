package labsheet_3

object ReversString {
  def main(args: Array[String]): Unit = {
    getValue();
  }


  def getValue(): Unit = {
    print("Enter String : ");
    var value= scala.io.StdIn.readLine();
    println("Reverse string : "+reversString(value));
  }

  def reversString(value:String):String= {
    if(value.isEmpty){
      "";
    }else{
      reversString(value.tail)+value.head;
    }
  }

}
