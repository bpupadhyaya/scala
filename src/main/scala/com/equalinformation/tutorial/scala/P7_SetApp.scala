package com.equalinformation.tutorial.scala

import scala.collection.immutable.Set

/**
 * Created by bpupadhyaya on 9/26/15.
 */
object P7_SetApp {
  def main(args: Array[String]): Unit = {
    val citySet = Set("Berkeley, Stanford, Oakland")
    // citySet += "Sunnyvale" // illegal
    println(citySet)

    var univSet = Set("UStanford", "UBerkeley")
    univSet += "UCalTech"

    println(univSet)
  }

}
