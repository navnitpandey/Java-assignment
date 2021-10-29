
public class Pen {
String clr;
int price;
Pen(String c,int p)
{
	clr=c;
	price=p;
	}
public static void main(String[] args) {
	Pen p1=new Pen("black",500);
	Pen p2=new Pen("red",400);
	System.out.println(p1.clr+"  "+p1.price);
	System.out.println(p2.clr+"  "+p2.price);
	
}

}
