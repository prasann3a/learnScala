package lectures.part2.op

object AbstractDataTypes extends App{
  //abstract when we need to have some methods unimplemented, then it is abstract
//  can't be instantiated

  abstract class Animal{
    val creatureType: String
    def eat: Unit
  }
class Dog extends Animal{
  override val creatureType: String = "Canine"
  override def eat: Unit= println("nom nom")
}
// traits
  trait Carnivore{
  def eat(animal : Animal): Unit
}
  trait ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"

    override def eat(animal: Animal): Unit = println(s"I'm croc and I'm eating ${animal.creatureType}")

    override def eat: Unit = println("yumyum")
  }

  val dog =new Dog
  val croc= new Crocodile
  croc.eat(dog)
  croc.eat
  // traits vs abstract classes
  // 1- traits do not have constructor parameters
  // extends only classe but multiple triats can be implemented
  // 3 - trait = behaviour, abstract class= "type of things"
}
