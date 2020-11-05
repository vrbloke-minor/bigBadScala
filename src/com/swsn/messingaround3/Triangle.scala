package com.swsn.messingaround3

class Triangle(center: (Int,Int), val rotation: Int, size: Int) extends Shape(center,size) {
  override def mkString(term: String): String = f"Triangle of side size $size rotation $rotation at $center$term"
}

object Triangle {
  def apply(center:(Int,Int), rotation:Int, size:Int) = new Triangle(center, rotation, size)
}