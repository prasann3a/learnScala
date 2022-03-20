package lectures.part2.op

object MethodNotations extends App{

  class Person(val name:String,favouriteMovie: String, val age:Int=18){
    def likes(movie: String): Boolean =movie==favouriteMovie
    def +(person: Person):String=s"${this.name} is hanging out with ${person.name}"
    def unary_! : String ={
      s"$name what the heck?!"
    }
  def isAlive: Boolean = true
    def apply(): String = s"Hi namei s $name and I like $favouriteMovie"
    def +(nickname: String): Person= new Person(s"${name} (${nickname})",favouriteMovie)

    def unary_+(person: Person): Person= new Person(name, favouriteMovie, age= age+1)
    def learns(language: String) = s"${name} learns ${language}"
    def learnScala = this learns "Scala"

    def apply(num: Int ): String = s"${name} watched Inception ${num} times"
  }
  val mary = new Person("Mary", "Inception", age= 32)
  println(mary.likes("Inception"))
  println(mary likes "Inception") // infix notation = operator notation
val tom = new Person("Tom", "Fight club")
  println(mary + tom)
  // operators in scala
  // ALL OPERATORS ARE METHODS
  // Akka actors have ! ?
  // prefix notation  --unary operator

  val x= -1  //equiva;emt with 1.unary_
  val y = 1.unary_-

//  println(!mary)
//  println(mary.unary_!)

//unary operator works with -,~,!
  // postfix notation

//  println(mary.isAlive)
//  println(mary isAlive)

  //apply
//  println(mary.apply())
//  println(mary())
  println(mary +"rockstar")
  println(+mary.age)
  println(mary learnScala)
  println(mary(2))


  /*
  1 overload the + operator
  Mary +"the rockstrar"
  2 add an age to Person class
    add a unary operator + operator => new person with the age+1
   3 Add a "learns" method in the person class => "mary learns sclaa"
   Add a learnscala method, calls learns method with  Scala
   use it in postfix notation
   4. add apply the method to  receive number and string
      mary
   */
}



