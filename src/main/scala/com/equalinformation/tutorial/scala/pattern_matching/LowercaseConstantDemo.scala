package com.equalinformation.tutorial.scala.pattern_matching

/**
  * Created by bpupadhyaya on 2/26/16.
  */
object LowercaseConstantDemo extends App {
  val someRandomValue = "test"
  val input = "test"

  input match {
    case `someRandomValue` => println("someRandomValue 'test' matches with input: "+input)
    case _ => println("Does not match input: "+input)
  }
}
