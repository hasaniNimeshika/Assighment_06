package MyAnswer
import math.{sqrt, pow}

object Q1 extends App {
  
  val p1 = Point(2,3)
  val p2 = Point(3,3)
  val p3 = p1.move(3,3)
  val p4 = p1.distance(p2)
 
  
  
  println(p1)
  println(p2)
  println("After move a point: "+p3)
  println("After add two given points: "+(p1+p2))
  println("Distance between two given points: "+p4)
  println("After switch the x and y coordinates: "+switch(5,4))
  
   def switch(dx:Int,dy:Int)=(dy,dx)
  
  
}


case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b
  
  def distance(other: Point): Double =
    sqrt(pow(x - other.x, 2) + pow(y - other.y, 2))
  
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dx)
  def +(that:Point)=Point(this.x+that.x,this.y+that.y)
  
 
  
}