package foundationCoding;

import java.util.Scanner;

public class PowerNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter value of x");
        int x=sc.nextInt();
        System.out.println("enter value of n");
        int n=sc.nextInt();
        long pow=power(x,n);
        System.out.println(pow);
	}
	

static long power(int x, int y)
{
    long temp;
    if (y == 0)
        return 1;
    if(x==0)
    	return 0;
    temp = power(x, y / 2);
    if (y % 2 == 0)
        return temp * temp;
    else
        return x * temp * temp;
}
	
}

