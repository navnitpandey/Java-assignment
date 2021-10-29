import java.util.Scanner;
public class Patern {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("pls enter a no");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
	//	for(int j=n;j>=i;j--)  //reverse
			//for(int j=1;j<=i;j++)
				for(int j=1;j<=n;j++) // matrix
		{
			System.out.print("* ");
		}
	System.out.println();
}
}
}