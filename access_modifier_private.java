// we can access private method, fields from inside the class.
package access_modifier;

public class access_modifier_private {
	
	private static String str = "Hello";
	
	private static void method() {
		System.out.println("Inside Private Method");
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(str);
		method(); 
		
		access_modifier_default amd = new access_modifier_default();
		amd.default_method();
		
		access_modifier_protected amp = new access_modifier_protected();
		amp.protected_method();

	}

}
