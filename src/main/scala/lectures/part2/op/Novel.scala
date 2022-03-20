package lectures.part2.op


object NovelBasics extends App {

  val author = new Writer("Charles", "Dickets", 1812)
  val imposter = new Writer("Charles", "Dickets", 1812)
  val novel=new Novel("Great Expectctations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(imposter))
  val counter =new Counter(0)
  counter.inc.inc.inc.print
  counter.inc(10).print
  class Writer(val fname: String, val lname: String, val year: Int) {
    def fullname(): String = fname + " " + lname
  }
  class Novel(name: String, year: Int, author: Writer) {

  def authorAge = year -author.year
    def isWrittenBy(author: Writer)= author==this.author
    def copy(newYear: Int): Novel = new Novel(name, newYear, author)


  }
  class Counter(val count: Int){
    def inc ={
      println("incrementing")
      new Counter(count+1) } // immutability
    def dec = {
      println("Decrementing")
      new Counter(count-1)
    }

    def inc(n: Int): Counter ={
      if(n<=0) this
      else inc.inc(n-1)
    }
    def dec(n: Int): Counter={
      if(n<=0) this
      else dec.dec(n-1)
    }

    def print:Unit = println(count)
  }
  }

