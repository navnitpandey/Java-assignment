package programingstar;
import java.util.*;
public class StarMatrix {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	}

}
