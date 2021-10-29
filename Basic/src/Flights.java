
public class Flights {
	String from,To;
	int date;
	Flights(){
	}
	Flights(int d){
		this.date=d;
	}
	Flights(String f,String t){
		this.from=f;
		this.To=t;
		//this.deperture=d;
		//this.roundTrip=r;
	}
	public static void main(String[] args) {
		Flights f=new Flights();
		Flights f1=new Flights(02);
		Flights f2=new Flights("Bengaluru","Bhopal");
		System.out.println(f.date);
		System.out.println(f1.date);
		System.out.println(f2.from+"  "+f2.To);
		
		//Flights f=new Flights("Delhi","Bengaluru","02-Aug-21","5-Aug-21");
		//System.out.println("FROM : "+f.from+"  "+"TO : "+f.To+"  "+"DEPERTURE : "+f.deperture+"ROUNDTRIP : "+f.roundTrip);
	}

}
