package com.swsn.messingaround3

trait HasColor {
  var color: (Int, Int, Int)
  var (red, green, blue) = color

  def setColor(r:Int,g:Int,b:Int): Unit = {
    color = (r,g,b)
    red = r
    green = g
    blue = b
  }
  def increaseRedBy(redPercentage: Float): Unit = { red = (red + red * redPercentage).toInt }
  def increaseGreenBy(greenPercentage: Float): Unit = { green = (green + green * greenPercentage).toInt }
  def increaseBlueBy(bluePercentage: Float): Unit = { blue = (blue + blue * bluePercentage).toInt }
  def decreaseRedBy(redPercentage: Float): Unit = { red = (red - red * redPercentage).toInt }
  def decreaseGreenBy(greenPercentage: Float): Unit = { green = (green - green * greenPercentage).toInt }
  def decreaseBlueBy(bluePercentage: Float): Unit = { blue = (blue - blue * bluePercentage).toInt }
}
