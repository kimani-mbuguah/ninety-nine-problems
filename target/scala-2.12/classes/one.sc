import scala.collection.mutable.ListBuffer
val myList = List(13,14,15,16,17,18)
myList

//empty list
val listTwo = List[Int]();

//list buffer
var fruits = new ListBuffer[String]()
fruits += "Apple"
fruits += "Banana"
fruits += "Orange"

val names = new ListBuffer[String]()
names += "kim"
names += "james"

//convert listBuffer into a list
names.toList

//test if a list behaves the same way as a ListBuffer
val myOtherList = List[Int]()
//trying to add values into the list throws an error. Receiver is not assignable
//myOtherList += 12

//deleting elements from a list
//a list in immutable. you cannot delete elements from the list
//insted, assign the result of the deletion to a new list
val originalList = List[Int](1,2,3,4,5,6,7,8)
//returns a list that has all elements greater than 2
val newList = originalList.filter(_ > 2)
//return a new list whose elements are less than 5
val newList2 = originalList.filter(_ < 5)
//get a know element from the originalList
val newList3 = originalList.filter(_ == 6)

//to use the same variable to create a new list after filtering, declare the list as a var and reassign it to the result
var myLastList = List[String]("kim","mbuguah","at")
var myFinalList = List[Int](1,2,3,4,5,6,7,8,9)
myFinalList = myFinalList.filter(_ > 5)

/*
* (*) Find the last element of a list
it("should find last element") {
  val last = P01.last(List("a", "b", "c", "d"))
  last should be("d")
}
* */
val last = List[String]("a","b","c","d","e")
//1.use last which returns the last element or throws a NoSuchElementException if the list is empty
last.last
//test error // throws java.util.NoSuchElementException error
//List[Int]().last
//2. if you do not know whether the list is empty use lastOption which returns an option
last.lastOption

//another way out
val a  = List(1,2,3,4,5)
val lastElement = a.reverse.head

//test whether i've grabbed all the concepts
val myTestList = List[String]("kim","africas","talking","galana","kilimani")
myTestList.last

//gets the first element
myTestList.reverse.last

myTestList.lastOption
//get first element using lastOption and reverse
myTestList.reverse.lastOption

val opResult = myTestList.reverse.head

/*define a function that does everything

def last[A](l:List[A]):A = {
  l.last
}*/

//last(List(1,2,3,4,5,6))

//The recursive solution¶
def last[A](l:List[A]):A = l match {
  case h :: Nil => h
  case _ :: tail => last(tail)
  case _ => throw new NoSuchElementException
}

last(List(1,2,3,4,5,6))