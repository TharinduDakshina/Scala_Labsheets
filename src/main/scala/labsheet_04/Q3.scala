package labsheet_04

import scala.io.StdIn

object Q3 {

  def toUpper(name: String): Unit = {
    println(name.toUpperCase());
  }

  def toLower(name: String): Unit = {
    println(name.toLowerCase());
  }

  def formatNames(names: List[String]): Unit = {

    names.foreach(temp =>toUpper(temp))
    println("----------------------------------------------------")
    names.foreach(temp =>toLower(temp))
  }

  def main(args: Array[String]): Unit = {
    var names=List("Benny","Niroshan","Saman","Kumara");
    formatNames(names)
  }
}
