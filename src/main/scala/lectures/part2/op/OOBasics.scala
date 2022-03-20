package lectures.part2.op

object OOBasics extends App {

  val person =new Person("John", 26)
  println(person.age)
  println(person )
  person.greet("Daniel")
  person.greet()
}


class Person(name:String, val age:Int){
  val x =2
  println(1+3)

  //method
 def greet(name:String): Unit = println(s"${this.name} says: Hi, $name")

  //overloading
def greet(): Unit = println(s"Hi, I am $name")

  //multiple constructors
  def this(name: String)= this(name, 0)
  def this()=this("John Doe")
}
//body
//class parameters are NOT FIELDS.
/*
Novel and a writer
Writer: first name, surname, year
  - method full name
  Novel: name, year of release, author
   -authorAge
   -is\WrittenBy(author)
   -copy (new year of release) = new instnce of novel

   /*
   counter class
    - receives an int value
    method current count
    -method to increment/ decrement => new counter
    - overload inc/dec to receive an  amount
    */
 */