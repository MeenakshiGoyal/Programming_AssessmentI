class Reverse {

  def f(arr:List[Int]):List[Int] = {

    def revList(orig: List[Int], rev: List[Int]): List[Int] = { //orig-> original , rev -> reverse list
      orig match {
        case Nil => rev   // set reverse list to nil
        case actual::reversed => revList(reversed , actual :: rev) // adding element to reverse list from tail of actual
      }
    }
    revList(arr, Nil)
  }
}
object stechies   // Create an object
{
  def main(args:Array[String]) // Main method of program
  {
    val r = new Reverse()
    print(r.f(List[Int](1,2,3) ))
        }
  }

