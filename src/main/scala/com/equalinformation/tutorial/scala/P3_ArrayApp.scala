package com.equalinformation.tutorial.scala

/**
 * Created by bpupadhyaya on 9/26/15.
 */
object P3_ArrayApp {
  def main (args: Array[String]) {
    val inputStrings = new Array[String](4)
    inputStrings(0) = "this"
    inputStrings(1) = "is"
    inputStrings(2) = "array"
    inputStrings(3) = "programming"

    for (i <- 0 to inputStrings.length - 1)
      println(inputStrings(i))
  }

}
