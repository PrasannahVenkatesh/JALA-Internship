
// Same name, Same number of parameters, same data types methods will give error.
public class MethodOverloading {
	
	public void multiply(int x) {
		System.out.println("Same Base and Power: "+ (x*x));
	}
	public void multiply(int x,int y) {
		System.out.println("Base : "+x+" Power : "+y+" = "+(int)(Math.pow(x, y)));
	}
	
	public void multiply(double x,double y) {
		System.out.println("Base : "+x+" Power : "+y+" = "+(Math.pow(x, y)));
	}
	
	public void add(int x,int y) {
		System.out.println("Addition: "+ (x+y));
	}
	
	public void add(double x, double y) {
		System.out.println("Addition: "+ (x+y));
	}
	

}
