
public class Man {
String name,clr;
int age;
Man(String n,String c,int a){
	name=n;
	clr=c;
	age=a;
}
	public static void main(String[] args) {
		Man m1=new Man("nvt","white",21);
		Man m2=new Man("gui","black",22);
		System.out.println(m1.name+"  "+m1.clr+"  "+m1.age);
		System.out.println(m2.name+"  "+m2.clr+"  "+m2.age);
		
	}

}
