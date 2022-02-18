
public class ExceptionHandeling {

	public static void main(String[] args) throws Exception {
		
		// Divide by zero leads to Arithmetic Exception
		// System.out.println(1/0);
		
		try {
			System.out.println(1/0);
		}
		catch(Exception e) {
			System.out.println("Do not divide by zero");
		}
		/*
		 *  It will throw exception
			Excep e = new Excep();
			e.warning();
		*/
		/*	It will our own message
		 * 	Excep e = new Excep();
			System.out.println(e.warning());
		
		 */
		
		try {
			System.out.println(1/0);
		}
		catch(ArithmeticException ex) {
			System.out.println("Not divide by zero");
		}
		catch(Exception ex) {
			System.out.println("Common Catch block");
		}
		finally {
			System.out.println("Finally block Execute at last");
		}
		
		int[] array = {1,2,3,4,5};
		/*
		 * ArrayIndexOutOfBoundException
		 * System.out.println(array[6]);
		 * 
		 * ClassNotFoundException
		 * Class.forName("oracle.jdbc.driver.OracleDriver");
		 * 
		 * FileNotFoundException 
		 * Accessing file not found
		 * FileReader reader = new FileReader("file.txt");
		 * 
		 * IOException 
		 * reader.read();
		 * 
		 * NullPointerException
		 * String s = null;
		 * System.out.println(s.charAt(0));
		 * 
		 * NumberFormatException
		 * System.out.println(Integer.parseInt("Hi"));
		 * 
		 * SQLException -> It occur when your not able to access database
		 * 
		 * String serverName = "localhost";
		 * String serverPort = "1521";
		 * String sid = "mySchema";
		 * String url = "jdbc:oracle:thin:@" + serverName + ":" + serverPort + ":" + sid;
		 * String username = "username";
		 * String password = "password";
		 * connection = DriverManager.getConnection(url, username, password);
		 * 
		 * 
		 */
		

	}

}
