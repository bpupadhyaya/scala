package com.equalinformation.tutorial.scala

/**
 * Created by bpupadhyaya on 9/26/15.
 */
object P5_ListOperationsApp {
  def main(args: Array[String]): Unit = {
    // Create a new list
    val twoCities = List("Sunnyvale", "Stanford")
    val anotherTwoCities = List("Berkeley", "Oakland")

    // List concatenation
    val fourCities = twoCities ::: anotherTwoCities
    println(fourCities)

    // List prepending
    val threeCities = "San Jose" :: twoCities
    println(threeCities)
    val fourcitiesPrepending1 = anotherTwoCities :: twoCities
    println(fourcitiesPrepending1)
    val fourCitiesPrepending2 = twoCities :: anotherTwoCities
    println(fourCitiesPrepending2)

    // Create a new list
    val newList = "this" :: "is" :: Nil
    println(newList)

    // Count the number of elements having specified length
    println(fourCities.count(s => s.length == 8))

    // Check existence
    println(fourCities.exists(s => s == "Sunnyvale"))

    //Filter
    println(fourCities.filter(s => s.length == 8))

    //Modification
    println(fourCities.map(s => s+" city"))

    //List to string
    println(fourCities.mkString("*"))

    //Order reversal
    println(fourCities, fourCities.reverse)

    //Sorting
    println(fourCities.sorted)

  }

}
