import java.io.PrintStream;

public class Static {
	
	public int x = 10;
	public String str1 = "Instance String";
	public static int y = 20;
	public static String str2 = "Static String";
	
	public static void staticMethod1() {
		Static s = new Static();
		System.out.println((s.str1));
	}
	
	public static void staticMethod2() {
		Static s = new Static();
		System.out.println("Calling Instance method form Static Method");
		s.instanceMethod1();
	}
	
	public void instanceMethod1() {
		
		System.out.println((str2));
	}
	
	public void instanceMethod2() {
		System.out.println("Calling Static method form Instance Method");
		Static.staticMethod1();
	}

	public static void main(String[] args) {
		Static s = new Static();
		System.out.println(s.x);
		System.out.println(s.str1);
		System.out.println(y);
		System.out.println(str2);
		s.instanceMethod1();
		s.instanceMethod2();
		staticMethod1();
		staticMethod2();
			

	}

}
