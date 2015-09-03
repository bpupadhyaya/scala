package com.equalinformation.tutorial.scala

/**
 * Created by bpupadhyaya on 9/3/15.
 *
 * P1 : Program to demonstrate simple command line arguments passing - some
 * programming practices will be refined later
 */
object P1_CommandLineArgsApp extends App {
  var loopCount = 0;
  while (loopCount < args.length) {
    println(args(loopCount))
    loopCount += 1
  }
}
