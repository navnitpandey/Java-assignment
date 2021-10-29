
public class Tringle {
	
	int hight=10;
	int base=20;
	double ar;
	double m1() {
	ar=(hight*base)/2;
	return ar;
	}
	
	
	
	public static void main(String[] args) {
		
		Tringle t=new Tringle();
		t.m1();
		System.out.println("area of tringle"+"  "+t.m1());
	}


}
