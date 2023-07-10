package Chapter05.B_Method;

class Triangle {
	double underside;
	double height;
	double diagonal;
	
	double area;
	double circumference;
}

class TriangleMath{
	
	static void setArea(Triangle triangle) {
		double areaValue = triangle.underside * triangle.height * 0.5;
		triangle.area = areaValue;
		
	}
	static void setDiagonal(Triangle triangle) {
		double squareDiagonal = Math.pow(triangle.underside,2)
				+ Math.pow(triangle.height, 2);
		double diagonal = Math.sqrt(squareDiagonal);
		triangle.diagonal = diagonal;
	}
	
	static void setCircumference(Triangle triangle) {
		triangle.circumference = triangle.height + triangle.underside + triangle.diagonal;
	}
	
	static Triangle createTriangle(double underside, double height) {
		Triangle triangle = new Triangle();
		
		triangle.underside = underside;
		triangle.height = height;
		
		setDiagonal(triangle);
		setArea(triangle);
		setCircumference(triangle);
		
		return triangle;
	}	
}
public class Method02 {

	public static void main(String[] args) {
		Triangle triangle1 = new Triangle();
		triangle1.underside = 33;
		triangle1.height = 44;
		triangle1.diagonal =5;
		
		TriangleMath.setArea(triangle1);
		System.out.println(triangle1.area);
		
		
		
		Triangle triangle2 = TriangleMath.createTriangle(55, 5);
		System.out.println(triangle2.area);
		
		
		
		
		

	}

}
