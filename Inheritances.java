
public class Inheritances {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		// overridden method
		a.examName();
		a.department();
		a.stream();
		
		// overridden method
		b.examName();
		b.course();
		b.field(); 
		
		// overridden method
		c.examName();
		c.elgibility();
		c.post(); 
		
		

	}

}
