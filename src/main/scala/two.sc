/*
* P02 (*) Find the last but one element of a list
it("should give second last element when list has more than two elements") {
  val numbers = List(1, 2, 11, 4, 5, 8, 10, 6)
  P02.secondLast(numbers) should be(10)
}
* */

val numbers = List(1,2,3,4,5,6,7,8,9,10)
val testOne = numbers.length

//list elements start from index 0 like arrays and arrayBuffers
numbers.lift(testOne  - 2)