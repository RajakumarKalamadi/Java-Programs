package OOPS;

public class Triangle {
	
	double a = 3;
	double b = 4;
	double c = 5;
	
	public Triangle() {
		double s = (a+b+c)/2;
		System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}
	
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
	}
}
