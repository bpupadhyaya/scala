package com.equalinformation.tutorial.scala

import scala.io.Source

/**
 * Created by bpupadhyaya on 9/26/15.
 */
object P9_ReadLinesFromAFile {
  def main (args: Array[String]) {
    if(args.length > 0) {
      for(line <- Source.fromFile(args(0)).getLines())
        println(line)
    } else
      Console.err.println("File name not supplied!")
  }

}
