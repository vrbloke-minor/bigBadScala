package com.swsn.messingaround3

class Square(center: (Int,Int), size: Int) extends Shape(center, size) {
  override def toString: String = s"Square of size $size at $center"
}

object Square{
  def apply(center:(Int,Int), size:Int) = new Square(center,size)
}