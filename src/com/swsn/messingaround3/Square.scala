package com.swsn.messingaround3

class Square(center: (Int,Int), size: Int) extends Shape(center, size) {
  override def mkString(term: String): String = s"Square of size $size at $center$term"
}

object Square{
  def apply(center:(Int,Int), size:Int) = new Square(center,size)
}