
public class Account {
String name;
long acctno;
double bal;
Account(String n,long a,double b){
	name=n;
	acctno=a;
	bal=b;
}
public static void main(String[] args) {
	Account a1=new Account("navnit",77854884l,252.50);
	Account a2=new Account("diwakar",558525555l,20.50);
	System.out.println(a1.name+"  "+a1.acctno+"  "+a1.bal);
	System.out.println(a2.name+"  "+a2.acctno+"  "+a2.bal);
}

}
