package lectures.part2.op

object Objects extends App{
//SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY("static")
  object Person{ // type + its only instance
  val N_EYES =2
def canFly: Boolean = false
  def apply(mother: Person, father: Person): Person = new Person("Bobbie")
}

  class Person(val name: String) {
    // instance-level functionality
  }
  println(Person.N_EYES)
  println(Person.canFly)

  // Scala object = SINGELTON INSTANCE

  val mary = new Person("mary")
  val john = new Person("john")
  println(mary == john)
  println(Person(mary, john))  //looks like a constructor

  //Scala Applications =Scala object with
  // def main(args : unit) --> JVM
}
