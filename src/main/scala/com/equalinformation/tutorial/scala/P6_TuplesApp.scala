package com.equalinformation.tutorial.scala

/**
 * Created by bpupadhyaya on 9/26/15.
 */
object P6_TuplesApp {
  def main(args: Array[String]): Unit = {
    val cityUnivCountryTuple = ("Stanford","Palo Alto","USA")

    println(cityUnivCountryTuple._1)
    println(cityUnivCountryTuple._2)
    println(cityUnivCountryTuple._3)
  }

}
