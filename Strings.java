import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {

	public static void main(String[] args) {
		
		// various declaration of string
		String s = "Hello";
		String str = new String("Hi");
		StringBuffer sb = new StringBuffer("hello");
		StringBuilder sbl = new StringBuilder();
		sbl.append(s);
		
		System.out.println("Concatination " + s + str);
		System.out.println("Length: " + s.length());
		System.out.println("SubString "+ s.substring(2));
		System.out.println("Position of e in s "+s.indexOf("e"));
		System.out.println("Comparing: " + s.equals(str));
		System.out.println("Ignore Case " + s.equalsIgnoreCase("heLLo"));
		System.out.println("Starts With: " + s.startsWith("H"));
		System.out.println("Ends With: "+s.endsWith("o"));
		System.out.println("Comapre to" + s.compareTo("hellO"));
		System.out.println("Trim "+s.trim());
		System.out.println("Replace l with p: "+s.replace("l", "p"));
		System.out.println("Upper to Lower: "+s.toLowerCase());
		System.out.println("Number to String: "+ String.valueOf(97));
		
		// Pattern Matching
		Pattern p = Pattern.compile("Java");
		Matcher m = p.matcher("Welcome to Java, Happy Java Coding!!!");
		
		while(m.find()) {
			System.out.println("Pattern found from " + m.start() + " to " + m.end());
		}

	}

}
