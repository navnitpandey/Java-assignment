import java.util.Scanner;
public class Leap
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("inter a no");
	int x=sc.nextInt();
	if(x%4==0 && x%100!=0 || x%400==0)
	System.out.println("leap year");
	else
	System.out.println("not leap year");
	}
	}


