package com.equalinformation.tutorial.scala.test

import com.equalinformation.tutorial.scala.MiscClass

/**
 * Created by bpupadhyaya on 9/27/15.
 */
class MiscSpec extends UnitSpec {
  val miscObj = new MiscClass(4,5)
  val miscObj1 = new MiscClass(4,0)

  "add" should "produce sum of two numbers" in {
    assert(miscObj.add() == 9)
  }

  "subtract" should "produce difference of two numbers" in {
    assert(miscObj.subtract() == -1)
  }

  "multiply" should "produce product of two numbers" in {
    assert(miscObj.multiply() == 20)
  }

  "divide" should "produce quotient of first number divided by second number" in {
    assert(miscObj.divide() == 0)
  }

  it should "throw ArithmeticException if a number is divided by zero" in {
    intercept[ArithmeticException] {
      miscObj1.divide()
    }
  }

}
