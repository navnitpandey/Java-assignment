import java.util.Scanner;
public class Circle1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter radious");
		Double radious=scan.nextDouble();
		double area =(3.14*(radious*radious));
		System.out.println("Area of circle is : "+area);
	}
}
