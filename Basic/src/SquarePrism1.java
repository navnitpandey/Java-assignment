import java.util.Scanner;
public class SquarePrism1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter base : ");
		Double base=scan.nextDouble();
		System.out.println("Enter base : ");
		double base1=scan.nextDouble();
		System.out.println("Enter hight");
		double hight=scan.nextDouble();
		double area=(2*(base1)+4*hight*base);
		System.out.println("Area of SquarePrism : "+area);

	}
	

}
