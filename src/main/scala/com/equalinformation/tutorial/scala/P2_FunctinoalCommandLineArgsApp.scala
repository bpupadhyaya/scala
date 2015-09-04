package com.equalinformation.tutorial.scala

/**
 * Created by bpupadhyaya on 9/3/15.
 * This program does the same thing as P1 and it is concise
 * Note the explicitly written type in the function literal. () required
 */
object P2_FunctinoalCommandLineArgsApp extends App {
  args.foreach((arg : String) => println(arg))
}
