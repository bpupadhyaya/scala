package com.equalinformation.tutorial.scala.pattern_matching

/**
  * Created by bpupadhyaya on 2/27/16.
  */
object PartialFunctionDemo extends App {
  val myFunc: PartialFunction[Char, Int] = {
    case '+' => 1
    case '-' => -1
  }

  println(myFunc('-'))

}
