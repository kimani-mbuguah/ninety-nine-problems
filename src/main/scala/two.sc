/*
* P02 (*) Find the last but one element of a list
it("should give second last element when list has more than two elements") {
  val numbers = List(1, 2, 11, 4, 5, 8, 10, 6)
  P02.secondLast(numbers) should be(10)
}
* */

val numbers = List(1,2,3,4,5,6,7,8,9,10)
numbers.init.last
val testOne = numbers.length

//list elements start from index 0 like arrays and arrayBuffers
numbers.lift(testOne  - 2)

//The procedural solution¶
/*
def penultimate[A](l:List[A]):A = {
  if (l.isEmpty) throw new NoSuchElementException

  //the init() method returns all elements except the last
  l.init.last
}

penultimate(List(1,2,3,4,5,6,7,8,9))*/


//The recursive solution¶
def penultimate[A](l:List[A]):A = l match {
  case h :: List(t) => h

  case _ :: tail => penultimate(tail)

  case _ => throw new NoSuchElementException
}

penultimate(List(1,2,3,4,5,6,7,8,9))