
public class Rectangle {
	void area(double width,double length) {
		System.out.println("Area : "+width*length);
	}
	
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.area(10, 10);
	}

}
