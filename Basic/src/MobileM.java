
public class MobileM {
	String brand,name;
	long modelno;
	double weight;
	
	MobileM(){
		brand="oppo";
		name="realme5Pro";
		modelno=52687416l;
		weight=2.02;
		
	}
	public static void main(String[] args) {
		MobileM m1=new MobileM();
		MobileM m2=new MobileM();
		MobileM m3=new MobileM();
		MobileM m4=new MobileM();
		MobileM m5=new MobileM();
		System.out.println(m1.brand+" "+m1.name+" "+m1.modelno+" "+m1.weight);
	}

}
