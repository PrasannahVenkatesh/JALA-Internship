
public class loops {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			System.out.println("Bright IT Career");
		}
		
		int j = 1;
		while(j<21) {
			System.out.println(j);
			j++;
		}
		
		// Odd or Even Program 
		int x = 25;
		if(x%2==0) {
			System.out.println(x + " is Even Number");
		}
		else {
			System.out.println(x + " is Odd Number");
		}
		
		int a = 5, b = 10, c = 15;
		if(a>b && a>c) {
			System.out.println(a + " is Largest Number");
		}
		else if(b>a && b>c) {
			System.out.println(b + " is Largest Number");
		}
		else {
			System.out.println(c + " is Largest Number");
		}
		
		System.out.println("Even Numbers between 10 and 100");
		int e = 10;
		while(e<101) {
			if(e%2 == 0) {
				System.out.println(e);
			}
			e++;
		}
		
		// 1 to 10 using do while
		int y = 1;
		do {
			System.out.println(y);
			y++;
		}while(y<11);
		
		// Armstrong Number or Not
		int number = 153, total = 0;
		int temp = number,len = (number+"").length();
		while(temp>0) {
			int f1 = 1,f2 = temp%10;
			for(int i=0;i<len;i++) {
			f1 *=(f2);
			}
			total += f1;
			temp/=10;
		}
		if(number == total) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
		
		//Prime Number or Not
		int pnum = 11,flag = 0;
		for(int i=2;i<pnum;i++) {
			if(pnum%i == 0) {
				flag = 1;
			}
		}
		if(flag==0) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}
		
		//Palindrome or not
		String s = "racecar",reverse = "";
		for(int i=1;i<=s.length();i++) {
			reverse+=s.charAt(s.length() - i);
		}
		if(s.equals(reverse)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
		// Using switch
		int num = 24;
		switch(num%2) {
		case 0:
			System.out.println("Even Number");
			break;
		case 1:
			System.out.println("Odd Number");
		}
		
			
		
		

	}

}
