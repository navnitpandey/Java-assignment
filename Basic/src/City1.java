
public class City1 {
	int pin;
	String cityName;
	
	City1(int p,String c){
		this.pin=p;
		this.cityName=c;
		}
	public static void main(String[] args) {
		City1 c=new City1(845438,"bettiah");
		System.out.println(c.pin+"  "+c.cityName);
		City1 c1=new City1(560020,"bengaluru");
		System.out.println(c1.pin+"  "+c1.cityName);
	}

}
