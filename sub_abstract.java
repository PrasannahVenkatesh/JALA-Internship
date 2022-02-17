package abstract_class;

public class sub_abstract extends abstract_class{

	@Override
	public void greeting() {
		System.out.println("Good morning");
	} 
	
	
	public static void main(String[] args) {
		abstract_class abs = new sub_abstract();
		abs.message();
		
		System.out.println("Child refrence");
		sub_abstract sab = new sub_abstract();
		sab.greeting();
		sab.message();
	}
	
	
	

}
