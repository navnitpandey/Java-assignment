
public class City {
	String cityname;
	int pincode;
	
	City(){
		
		cityname="bengaluru";
		pincode=85245485;
		
	}
	public static void main(String[] args) {
		City c1=new City();
		City c2=new City();
		City c3=new City();
		System.out.println(c1.cityname+""+c1.pincode);
		
	}
	

}
