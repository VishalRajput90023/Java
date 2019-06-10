package test;
class Shape{
	int b,c; //not allocated in main memory
	//Polymorphism - method overloading
	//Calculate area of rectangle 
		void area(int length,int breadth) {
			System.out.print("Area of rectangle:");
			System.out.println(length*breadth);
		}
	//Calculate area of square 
		void area(int a) {
			System.out.print("Area of square:");
			System.out.println(a * a);
		}
	//Calculate area of circle 
		void area(double radius) {
			System.out.print("Area of circle:");
			System.out.println(3.14 * radius * radius);
		}
}
public class thinkx {
 static int a = 10;
 final int b = 20;//variable b as constant
	public static void main(String[] args) {
	Shape s = new Shape();
	s.area(3);
	s.area(3.4);
	s.area(3,4);
  }
}
