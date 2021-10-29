package programingstar;
import java.util.*;
public class StarPuls {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num plz");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++) {
				//if(i==1||i==n||j==1||j==n||j==n/2+1||i==n/2+1)//plus
					if((i==j||i+j==n+1)&&(i<=n/2+1||i+j<=n/2+1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		 
		
	}

}
