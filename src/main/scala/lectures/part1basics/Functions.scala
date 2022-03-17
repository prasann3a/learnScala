package lectures.part1basics

object Functions extends App{
  def aFunction(a: String, b: Int):String  ={
    a + " "+b
  }
  println(aFunction("hello",3))
  def aParameterLessFunction(): Int = 42
  println(aParameterLessFunction())

  // WHEN YOU NEED LOOPS USE RECURSIVE PROGRAM
  def aRepeatedFunction(aString : String, n: Int): String ={
    if(n==1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello",3))

  def aFunctionWithSideEffects(aString : String): Unit = println(aString)

  def aBiggerFunction(n: Int): Int ={
    def aSmallerFunction(a: Int, b: Int)= a+b
    aSmallerFunction(n, n-1)
  }

// A greeting function for kids
  def aGreetingFunction(name:String, age: Int): String ={
    "Hi, my name is "+name+" and I am "+age+" years old"
  }
  println(aGreetingFunction("Prassana", 25))

  def aFactorial(n: Int): Int ={
    if(n==1) n
    else  n* aFactorial(n-1)
  }
  println(aFactorial(5))

  def aFibonacci(n: Int):Int ={
    if(n<=1) 1
    else {
      aFibonacci(n - 1) + aFibonacci(n - 2)
    }
  }
  print(aFibonacci(5))
  def aPrime(n: Int): Boolean ={
    def isPrimeUntil(t: Int):Boolean ={
      if(t<=1) true
      else n%t!=0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }

  print(aPrime(7))
}
// REcursive function can't find the output itself
