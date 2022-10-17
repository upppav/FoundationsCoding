package foundationCoding;

import java.util.Scanner;

public class StringPalindrom {

	public static  void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		System.out.println(s.length());
		if(isPalindrom(s))
			System.out.println("true"); 
		else
			System.out.println("false"); 
			
	}

	private static boolean isPalindrom(String s) {
		int n=s.length();
		if(n==0)
			return true;
		else
			return isrec(s,0,n-1);
		
		
		
	}

	private static boolean isrec(String s, int i, int j) {
		if(i==j)
			return true;
		if(s.charAt(i) !=(s.charAt(j)))
				return false;
		if(i<j+1)
		
		return isrec(s,i+1,j-1);
		return true;
	}

}
