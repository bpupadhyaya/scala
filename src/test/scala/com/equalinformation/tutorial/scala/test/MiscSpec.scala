package com.equalinformation.tutorial.scala.test

import com.equalinformation.tutorial.scala.MiscClassForUnitTesting

/**
 * Created by bpupadhyaya on 9/27/15.
 */
class MiscSpec extends UnitSpec {
  val miscObj = new MiscClassForUnitTesting(4,5)
  val miscObj1 = new MiscClassForUnitTesting(4,0)

  // 1. add method *****************************
  "add" should "produce sum of two numbers" in {
    assert(miscObj.add() == 9)
  }

  // Or
  assertResult(9) {
    miscObj.add()
  }

  // 2. subtract method *****************************
  "subtract" should "produce difference of two numbers" in {
    assert(miscObj.subtract() == -1)
  }

  // 3. multiply method *****************************
  "multiply" should "produce product of two numbers" in {
    assert(miscObj.multiply() == 20)
  }

  // 4. divide method *****************************
  "divide" should "produce quotient of first number divided by second number" in {
    assert(miscObj.divide() == 0)
  }

  it should "throw ArithmeticException if a number is divided by zero" in {
    intercept[ArithmeticException] {
      miscObj1.divide()
    }
  }

}
