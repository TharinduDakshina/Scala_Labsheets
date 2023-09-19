package labsheet_01

object Labsheet1 {
  def main(args: Array[String]): Unit = {

    /*1*/
    AreaOfADisk(5);

    /*2*/
    convertTemperature(35);

    /*3*/
    volumeSphere(5);

    /*4*/
    bookstores(60);

    /*5*/
    var x:Int=countTotalRunningTime(2,8)+countTotalRunningTime(3,7)+countTotalRunningTime(2,8);
    println("Total Running time : "+x);

  }



  def AreaOfADisk(r:Int):Unit={
    println("Area of a disk : "+(((22.0/7)*r*r)));
  }

  def convertTemperature(temp:Int):Unit={
    println("Fahrenheit : "+(temp*1.8000+32.00));
  }

  def volumeSphere(r:Int):Unit={
    println("Volume is Sphere : "+(4.0/3)*(22.0/7)*r*r*r);
  }

  def bookstores(copies:Int):Unit={
    var bookPrice: Double = 24.95;
    var temp=(bookPrice*copies+10.5)-(bookPrice*copies*40/100);
    println("Total : "+temp);
  }

  def countTotalRunningTime(distance: Int, speed: Int): Int = {
    return distance * speed;
  }

}
