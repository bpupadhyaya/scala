package com.equalinformation.tutorial.scala.test.selenium

import org.openqa.selenium.WebDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.scalatest.{ShouldMatchers, FlatSpec}

import org.scalatest.selenium.WebBrowser

/**
  * Created by bpupadhyaya on 3/3/16.
  */

class BlogSpec extends FlatSpec with ShouldMatchers with WebBrowser {

  implicit val webDriver: WebDriver = new HtmlUnitDriver

  val host = "http://www.google.com"

  "The google home page" should "have the correct title" in {
    go to (host)
    pageTitle should be ("Google")
  }
}
