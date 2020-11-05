package com.swsn.messingaround3

class ColorTriangle(center: (Int,Int), rotation: Int, size: Int, var color:(Int,Int,Int))
  extends Triangle(center, rotation, size) with HasColor {
  override def mkString(term: String): String = f"Triangle of side size $size rotation $rotation at $center with color r:$red g:$green b: $blue$term"
}

object ColorTriangle {
  def apply(center: (Int, Int), rotation: Int, size: Int, color: (Int, Int, Int)): ColorTriangle = new ColorTriangle(center, rotation, size, color)
}
