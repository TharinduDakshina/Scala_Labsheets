package labsheet_3

import scala.io.StdIn
object Q2 {
    var inputList: List[String] = List.empty[String];
    var count = 0;

    def main(args: Array[String]) = {
      print("How much elements do you want:")
      count = StdIn.readInt();
      inputMethod(count);

    }

    def inputMethod(count: Int): Unit = {
      var i = 0;
      while (i < count) {
        print("Enter a string:");
        var input = StdIn.readLine();
        inputList = inputList :+ input;
        i += 1;
      }
      for (str <- inputList) {
        val length = str.length
        if (length > 5) {
          println(str);
        }
      }
    }

}
