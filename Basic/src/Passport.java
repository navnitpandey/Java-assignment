
public class Passport {
	String name;
	long passportno;
	double photosize;
	Passport(){
		name="navnit";
		passportno=789425822L;
		photosize=42.2;
		}
	public static void main(String[] args) {
		Passport p1=new Passport();
		Passport p2=new Passport();
		System.out.println(p1.name+" "+p1.passportno+"  "+p1.photosize);
	}








}
