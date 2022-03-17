package lectures.part1basics

import scala.annotation.tailrec

object  Recursion extends App{
  def factorial(n: Int):Int ={
    if(n<=1) 1
    else {
      println("Computing factorial of "+n+"- I first need factorial of "+(n-1))
      val result= n*factorial(n-1)
      println("Computed factorial of "+n)
      result
    }


  }
  println(factorial(10))

  def anotherFactorial(n: Int):Int={
    def factHelper(x:Int, accumulator: Int):Int ={
      if (x<=1) accumulator
      else factHelper(x-1, x*accumulator)
      factHelper(n,1) // TAIL RECURSION
    }
    anotherFactorial(10)
  }
  @tailrec
  def concanenate(n:Int, str: String, accumulator: String):String={
    if (n<=0) accumulator
    else concanenate(n-1, str, str+ accumulator)
  }
  println(concanenate(n=3,"Hello","" ))


  def fibonacci(n:Int) : Int = {
    @tailrec
    def aFibonacciTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if (i>n) last
      else aFibonacciTailrec(i+1, last + nextToLast, last)

      if(n<=2) 1
      else aFibonacciTailrec(2,1,1)
    }


  def isPrime(n: Int):Boolean ={
    def isPrimeTailRec(t:Int, isStillPrime: Boolean): Boolean= {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)
    }
      isPrimeTailRec(n/2, true)

  }
  println(isPrime(10))
}

