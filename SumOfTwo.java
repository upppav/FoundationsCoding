package foundationCoding;

import java.util.Scanner;

public class SumOfTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		System.out.println("enter thr elements of an array");
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target element");
		int target=sc.nextInt();
		int[] ans=twoSum(arr,target);
		System.out.println(ans);
		}

	private static int[] twoSum(int[] arr, int target) {
	
		int n=arr.length-1;
		int[] result=new int[2];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=(i+1);j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					return result;
				}
				
			}
		}
	return result;
		
		
	}
}
