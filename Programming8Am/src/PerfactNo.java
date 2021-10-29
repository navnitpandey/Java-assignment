import java.util.Scanner;
public class PerfactNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
			System.out.println("given no is perfactno");
		else
			System.out.println("given no is not perfact");
	}

}
