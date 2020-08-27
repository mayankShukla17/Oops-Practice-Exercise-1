package Oops_Practise_Exercise_1;

public class TestShape {
	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.draw();
		circle.erase();
		Square square=new Square();
		square.draw();
		square.erase();
		Triangle triangle=new Triangle();
		triangle.draw();
		triangle.erase();
	}
}
