package com.equalinformation.tutorial.scala.pattern_matching

/**
  * Created by bpupadhyaya on 2/27/16.
  */
object InfixAndUnapplyDemo extends App {
  case object +: {
    def unapply[T](arg: List[T]) =
    if(arg.isEmpty) None else Some(arg.head, arg.tail)
  }

  1 +: 5 +: 4 +: 3 +: Nil match {
    case first +: second +: rest  => first + second + rest.length
  }
}
