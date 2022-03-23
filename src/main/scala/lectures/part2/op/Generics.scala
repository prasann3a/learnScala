package lectures.part2.op



object Generics extends App{

  class MyList[+A] {
    def add[B >: A](element: B): MyList[B] = ???
  }
  /*
  A = cat
  B = animal
  if animal is super set of cat, then list becomes superset of animals  => we return the list of animals

   */


  //use type A
  class MyMap[Key, Value]
  val listOfIntegers= new MyList[Int]
  val listOfStrings=new MyList[String]

// generic methods
//object MyList {
//  def empty[A]: MyList[A] = ???
//  }
//  val emptyListOfIntegers = MyList.empty[Int]

  class Animal
  class Cat extends Animal
  class Dog extends Animal
  // yes List[Cat] extends List[]
class CovariantList[+A]
  val animal: Animal =new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  // 2 NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  //3. Hell, no! contravariance
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]
  // variance problem

  //bounded types upper bounded types
  class Cage[A <: Animal](animal: A) //accepts subset of animal
  val cage= new Cage(new Dog)
  class Cage1[A >: Animal](animal: A) // accepts super set of animal

//  class Car
//  val newCage= new Cage(new Car)

  // expand MyList to be generic


}
