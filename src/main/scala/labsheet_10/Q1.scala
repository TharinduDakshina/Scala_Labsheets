package labsheet_10

object Q1 {
  def main(args: Array[String]): Unit = {
    var cel = List(0, 10, 20, 30)
    calFahrenhite(cel)

  }

  def calFahrenhite(cel: List[Int]) = {
    var far = cel.map(temp => (temp * 9 / 5) + 32)
    println(far);
    println("Average Fahrenheit temperature: " + avg(far))
  }

  def avg(far: List[Int]): Double = {
    far.reduce((x, y) => x + y) / far.length

  }

}
