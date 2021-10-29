
public class Test {
	 int pin;
	Test(int pin){
		//pin=p;
		System.out.println(pin);
		System.out.println(this.pin);
	}
	public static void main(String[] args) {
		System.out.println("main");
		Test t=new Test(560020);
		//System.out.println(t.pin);
	}
	

}
