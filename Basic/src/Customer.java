import java.util.Scanner;
public class Customer {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=scan.nextLine();
		System.out.println("Enter your age:");
		int age=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter gender");
		String gender=scan.nextLine();
		System.out.println("Hailing from:");
		String city=scan.nextLine();
		
		System.out.println("welcome, "+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("City:"+city);
	}

}
