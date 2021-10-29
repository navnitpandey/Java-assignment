package programingstar;
import java.util.*;
public class StarY {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=1;j++)
			{
				if((i==j||i+j==n+1)&&(i<=n/2+1||j==n/2+1&&i>=n/2+1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
