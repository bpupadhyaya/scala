package com.equalinformation.tutorial.scala.test.selenium

import org.scalatest._
import org.scalatest.selenium.HtmlUnit

/**
  * Created by bpupadhyaya on 3/3/16.
  */
class GoogleWordSearchSpec extends FlatSpec with ShouldMatchers with HtmlUnit {

  val host = "http://www.google.com"

  "The google home page" should "have the correct title" in {
    go to (host)
    click on "q"
    textField("q").value = "selenium"
    submit()

    pageTitle should be ("selenium - Google Search")
  }
}

