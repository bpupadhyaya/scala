package com.equalinformation.tutorial.scala

/**
 * Created by bpupadhyaya on 9/26/15.
 */
object P4_ListApp {
  def main (args: Array[String]) {
    val numbers = List(1,2)
    val letters = List('a','b','c','d')
    val strings = List("ab","bc","cd","ef")
    val mixed = (1,2,3,'a', "ab")

    println(numbers)
    println(letters)
    println(strings)
    println(mixed)

  }
}
