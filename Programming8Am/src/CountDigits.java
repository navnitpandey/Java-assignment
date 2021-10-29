import java.util.Scanner;
public class CountDigits {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no");
	int n=sc.nextInt();
	int dc=0;
	do{
		dc++;
		n=n/10;
	} 
	while(n!=0);
		System.out.println("no of digit : "+dc);
	}

}
