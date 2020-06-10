package com.particeep.test.akka

/**
  * Question about Akka Stream framework https://doc.akka.io/docs/akka/current/stream/index.html
  *
  * Complete the code (replace the ???)
  */
object BasicStream {

  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem("Actor System")
    implicit val materializer = ActorMaterializer()

    val numbers = 1 to 1000

    val numberSource: Source[Int, NotUsed] = Source.fromIterator(() => numbers.iterator)

    //Only let pass even number through the flow
    val isEvenFlow: Flow[Int, Int, NotUsed] = ???

    //Create a Source of even numbers by combining the number Source with the even Flow
    val evenNumberSource: Source[Int, NotUsed] = ???

    //A Sink that will write its input onto the console
    val consoleSink: Sink[Int, Future[Done]] = ???

    //Connect the Source with the Sink and run it
    ???
  }
}
