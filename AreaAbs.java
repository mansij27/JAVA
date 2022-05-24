// abstract class Shape{  
//   double dim1;
//   double dim2;
//  abstract void calculateArea();  
// }  
// //   Shape(double a, double b){
// //   dim1= a;
// //   dim2= b;
// // }
// abstract class Rectangle extends Shape {
// Rectangle(double a, double b){
//   System.out.println(" Inside Rectangle ");
// }
    
//   }
// abstract  class Triangle extends Shape {
//    Triangle(double a, double b){
//   System.out.println(" Inside Triangle ");
// }
//   }
// class Area extends Shape{  
// void calculateArea() {
//   System.out.println("Area of Shape");
//   return dim1*dim2;
//   } 
// }
 
// public static void main(String args[]){  
//  Shape obj = new Shape(10,5);  
//  obj.calculateArea();
// }  

abstract class Shape {
  private String name;

  public Shape() {
    this.name = "Unknown shape";
  }

  public Shape(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract double getArea();
}

// A Rectangle Class, Which Inherits from the Shape Class

class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    // Set the shape name as "Rectangle"
    super("Rectangle");
    this.width = width;
    this.height = height;
  }

  public Triangle(double base, double height, double hypo) {
    // Set the shape name as "Rectangle"
    super("Triangle");
    this.base = base;
    this.height = height;
    this.hypo= hypo;
  }
  // Provide an implementation for inherited abstract getArea() method
  public double getArea() {
    return width * height;
  }
}

class ShapeUtil {
  public static void printShapeDetails(Shape[] list) {
      double area = list[i].getArea(); // Late binding
      //System.out.println("Name: " + name);
      System.out.println("Area: " + area);
    }
  }

public class AreaAbs {
  public static void main(String[] args) {
    Shape[] shapeList = new Shape[2];
    shapeList[0] = new Rectangle(2.0, 4.0); // Upcasting
    Triangle t= new Triangle(3,4,5);
  }
}