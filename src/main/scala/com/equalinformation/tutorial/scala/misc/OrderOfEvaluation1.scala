package com.equalinformation.tutorial.scala.misc

/**
  * Created by bpupadhyaya on 11/27/16.
  * Due to : Essential Scala
  */
object OrderOfEvaluation1 extends App {

  def a = {
    println("a")
    1
  }

  val b = {
    println("b")
    a + 2
  }

  def c = {
    println("c")
    b + "c"
  }

  println(OrderOfEvaluation1.c + OrderOfEvaluation1.b + OrderOfEvaluation1.a)
}
