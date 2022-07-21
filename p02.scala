object P02 {

// P02 (*) Find the last but one element of a list.
//     Example:
//     scala> penultimate(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 5

  def main(args: Array[String]): Unit = {
    // main method body
    println(penultimateRecursive(List(1,2,3,4,5,6,7,8,89,99)))
  }

  // method using built-in fn last
  def penultimateBuiltin[A](ls: List[A]): A =
    if (ls.isEmpty) throw new NoSuchElementException
    else ls.init.last

  def penultimateRecursive[A](ls: List[A]): A = ls match {
    case h :: _ :: Nil  => h
    case _ :: tail => penultimateRecursive(tail)
    case _         => throw new NoSuchElementException
  }
}
