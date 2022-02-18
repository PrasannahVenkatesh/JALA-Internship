//Refer Main_Th_Su_Const

public class Models extends Car{
	
	public Models() {
		System.out.println("Model Class");
	}
	public Models(String name) {
		System.out.println(super.greeting() + name);
	}
	public void modelName() {
		System.out.println("BMW" + super.startingPrice());
	}

}
