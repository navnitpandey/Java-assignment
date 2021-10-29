import java.util.Scanner;
public class Rectangle1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Width");
		Double width=scan.nextDouble();
		System.out.println("Enter length");
		Double length=scan.nextDouble();
		double area=width*length;
		System.out.println("Area of rectangle :"+area);
	}

}
