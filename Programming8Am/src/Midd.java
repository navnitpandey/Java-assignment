import java.util.Scanner;
public class Midd {
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no");
	int x1=sc.nextInt();
	int x2=sc.nextInt();
	int x3=sc.nextInt();
	 if (x2>x1 && x1>x3 || x3>x1 && x1>x2 )
	{
	System.out.println(x1);
	}
	if(x1>x2 && x2>x3 || x3>x2 && x2>x1)
	{
	System.out.println(x2);
	}
	if(x1>x3 && x3>x2 || x2>x3 && x3>x1)
	{
	System.out.println(x3);
	}
	}
	}


