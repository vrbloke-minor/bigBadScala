package com.swsn.messingaround3

abstract class Shape(val center: (Int,Int), val size: Int) {
  def mkString(term: String): String
}
