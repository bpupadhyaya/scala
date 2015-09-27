package com.equalinformation.tutorial.scala

import scala.collection.immutable.Map

/**
 * Created by bpupadhyaya on 9/26/15.
 */
object P8_MapApp {
  def main(args: Array[String]): Unit = {
    var univRanking = Map[Int, String]()
    univRanking += (1 -> "MIT")
    univRanking += (3 -> "Harvard")

    println(univRanking)
    println(univRanking(3))

  }

}
