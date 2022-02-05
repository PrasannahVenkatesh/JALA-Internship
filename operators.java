
public class operators {

	public static void main(String[] args) {
		// Operators in JAVA 
		
		// Declaration of Variables 
		int x = 10;
		int y = 2; 
		int z = 10;
		String s = "JAVA";
		// Basics Operations
		System.out.println("Addition: "+(x+y));
		System.out.println("Subtraction: "+(x-y));
		System.out.println("Multiplication: "+(x*y));
		System.out.println("Division: "+(x/y)); 
		
		System.out.println("Post Increment "+(x++)); // x=11 but output 10 
		System.out.println("Pre Increment: "+(++x)); // x=12
		System.out.println("Post Decrement: "+(y--)); // y=1
		System.out.println("Pre Decrement: "+(--y)); // y=0
		
		System.out.println("Equal: "+(s=="JAVA")); 
		System.out.println("Not Equal: "+(s!="JAVA"));
		
		if(x == 12) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		} 
		// Logical Operation 
		if(x==12 && y==0) {
			System.out.println("AND Operation");
		}
		if(x==12 || y==0) {
			System.out.println("OR Operation");
		}
		// y!=0 -> false and not operation result true
		if(!(y!=0)) {
			System.out.println("NOT Operation");
		}
		// Relation Operator
		System.out.println("Greater than Operator: "+(x>10));
		System.out.println("Lesser than Operator: "+(x<10));
		System.out.println("Greater than Equal Operator: "+(x>=12));
		System.out.println("Lesser than Equal Operator: "+(x<=10));
		
		// Program
		if(x>y) {
			System.out.println("x is Greater Number");
		}
		else {
			System.out.println("y is Greater Number");
		}
		
		

	}

}
