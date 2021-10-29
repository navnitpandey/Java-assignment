import java.util.Scanner;
public class Divisor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a int");
		int n=sc.nextInt();
		int count=0;
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
			{
				sum=sum+i;
			}
			//	count++;
			
			
		}
		System.out.println(count);
		System.out.println(sum);
	}

}
