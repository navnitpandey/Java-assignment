import java.util.Scanner;
public class LargestOfThreeNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no : ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd no : ");
		int b=sc.nextInt();
		System.out.println("Enter 3rd no : ");
		int c=sc.nextInt();

		if(a>b&&a>c)
		{
			System.out.println(a+"  is largest no");
		}
		else if(b>a&&b>c)
		{
			System.out.println(b+"  is largest no");
		}
		else
		{
			System.out.println(c+"  is largest no");
		}
	}
}
