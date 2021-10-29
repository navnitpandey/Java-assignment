
public class Person {
	void eat() {
		serve_food();
		handWash();
		
		System.out.println("Persn eats");
		handWash();
	}
	void handWash() {
		System.out.println("wash hand");
	}
	void serve_food() {
		System.out.println("food is served");
	}
	public static void main(String[] args) {
		Person p=new Person();
		Person p1=new Person();
	//	p.eat();
		//p1.handWash();
	}
}
