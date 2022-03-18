package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App{
  @tailrec
  def trFact(n:Int, acc: Int):Int={
    if(n<=1) acc
    else trFact(n-1, n*acc)
  }
  val fact10= trFact(10,1)

  def savePicture(format: String, width: Int, height: Int):Unit =println("saving picture")
  savePicture("jpg", 800, 600)

}
