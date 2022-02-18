package Interfaces;

/*
 * Note: 
 * 		Interface cannot be created with private, default, protected.
 */

public class School implements Student,Department,Duration{

	@Override
	public String studentName() {
		String name = "MSD";
		return name;
	}
	
	public static void main(String[] args) {
		School s = new School();
		System.out.println(s.studentName());
		
		Student st = new School();
		st.studentName();
		
		Duration d = new School();
		System.out.println(d.interfaceName());
		System.out.println(d.iname);
		
	}

	@Override
	public String departmentSelected(String s) {
		if(s.equals("MSD")) {
			return "Engineering";
		}
		return "Not Selected";
	}

	@Override
	public String interfaceName() {
		return "Student";
	}




}
