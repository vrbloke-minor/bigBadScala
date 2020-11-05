package com.swsn.messingaround3
import scala.math.min

trait HasColor {
  var color: (Int, Int, Int)
  var (red, green, blue) = color

  def setColor(r:Int,g:Int,b:Int): Unit = {
    color = (r,g,b)
    red = r
    green = g
    blue = b
  }
  def increaseRedBy(redPercentage: Float): Unit = { red = min((red + red * redPercentage).toInt, 255) }
  def increaseGreenBy(greenPercentage: Float): Unit = { green = min((green + green * greenPercentage).toInt, 255) }
  def increaseBlueBy(bluePercentage: Float): Unit = { blue = min((blue + blue * bluePercentage).toInt,255) }
  def decreaseRedBy(redPercentage: Float): Unit = { red = min((red - red * redPercentage).toInt,255) }
  def decreaseGreenBy(greenPercentage: Float): Unit = { green = min((green - green * greenPercentage).toInt,255) }
  def decreaseBlueBy(bluePercentage: Float): Unit = { blue = min((blue - blue * bluePercentage).toInt,255) }
}
