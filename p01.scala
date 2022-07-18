object P01 {

// P01 (*) Find the last element of a list.
//     Example:
//     scala> last(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 8

  def main(args: Array[String]): Unit = {
    // main method body
    println(lastRecursive(List(1,2,3,4,5,6,7,8,89,99)))
  }

  // method using built-in fn last
  def lastBuiltin[A](ls: List[A]): A = ls.last

  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }
}

