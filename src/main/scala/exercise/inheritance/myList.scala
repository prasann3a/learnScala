package exercise.inheritance

abstract class MyList[+A] {
  /*
  head = first element of the list
  tail = remainder of the list
  isEmpty = is this list empty
  add => new list with this element added
  toString => a string representation of the list
   */
  def head: A
  def tail:MyList[A]
  def isEmpty: Boolean
  def add[B>:A](element:B): MyList[B]
  def printElements: String
  override def toString: String = "["+printElements +"]"

}

object Empty extends MyList[Nothing] {
  def head: Nothing = throw new NoSuchElementException
  def tail:MyList[Nothing] = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add[B>:Nothing](element:B): MyList[B] = new Cons(element, Empty)
  override def printElements: String = ""

}

class Cons[+A](h: A, t: MyList[A]) extends MyList[A]{
  def head: A = h
  def tail: MyList[A] = t
  def isEmpty: Boolean = false
  def add[B>:A](element:B): MyList[B] = new Cons(element, this)

  override def printElements: String =
    if(t.isEmpty) "" + h
    else h +" "+t.printElements



}

object ListTest extends App{
//  val list= new Cons(2,new Cons(3, Empty))
//  println(list.tail.head)
//  println(list.add(4).head)
//  println(list.isEmpty)
//  println(list.toString)
  val listOfIntegers: MyList[Int]= new Cons[Int](1, new Cons(2, new Cons[Int](3, Empty)))
  val listOfStrings: MyList[String] = new Cons("Hello", new Cons[String]("Scala", Empty))
  println(listOfIntegers.toString)
  println(listOfStrings.toString)
}