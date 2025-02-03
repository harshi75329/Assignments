package Assignment2;

abstract class Shape{
	
	abstract void Draw();
	
}
class Circle extends Shape{
	
	void Draw() {
		
		System.out.println("Drawing a Circle");
	}
}
class Rectangle extends Shape{
	
	void Draw() {
		
		System.out.println("Drawing a Rectangle");
	}
}
public class Ques4 {

	public static void main(String[] args) {
		Shape obj[]=new Shape[3];
		
		obj[0] = new Rectangle();
		obj[1] = new Circle();
		obj[2] = new Rectangle();
		
		for(Shape items : obj) {
			
			items.Draw();
		}

	}

}

