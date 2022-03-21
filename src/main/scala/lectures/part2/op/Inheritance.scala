package lectures.part2.op

object Inheritance extends App {

  // single class inheritance
  class Animal {
    val creatureType="wild"
    def eat = println("nomnomnom") //private can't be accessed
  }
  class Cat extends Animal{
   def crunch={
     eat
     println("Crunch crunch")
     // protected allows it to eat in the sub-class
   }
  }
  val cat= new Cat
  cat.crunch

  class Person(name: String, age: Int){
    //auxillary constructor
    def this(name: String)= this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  // overriding
  class Dog(override val creatureType: String) extends Animal {
//    override val creatureType= "domestic"  //overriding in the constructor or override from thedomestic can be done

    override def eat={ super.eat
      println("crunch, crunch")}

  }
  val dog = new Dog(creatureType = "K9")
  dog.eat
  println(dog.creatureType)

// type substitution(broad: polymorphism)
  var unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat //most overriden method as possible

  //OVERRIDING vs OVERLOADING
  //super
  // preventing overrides
  // final -- can't override final method
}
