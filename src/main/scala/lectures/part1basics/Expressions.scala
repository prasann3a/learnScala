package lectures.part1basics

object Expressions extends App{
  val x = 1+2
  println(x )

//  Instructions vsExpressions(VALUE)
  // if expression

  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
//  if is an expression not a condition
  println(aConditionedValue)

  // EVERYTHIING IN SCALA IS AN EXPRESSIN
//  val aWierdValue = (aVariable=3) //unit === void

  val aCodeBlock = {
    val y =2
    val z=y+1
    if (z>2) "hello" else "goodbye"
  }

  //1 difference between "hello world" returns unit
  //true
  // 239
}
