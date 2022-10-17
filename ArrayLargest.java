package foundationCoding;

import java.util.*;

public class ArrayLargest {

		public void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of array");
			int size=sc.nextInt();
			System.out.println("Enter the array elements");
			Integer[] arr=new Integer[size];
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(printLargest(arr));
			}

		private static String printLargest(Integer[] arr) {
			Arrays.sort(arr, new Comparator<Integer>(){
				public int compare(Integer a, Integer b) {
					String s1=Integer.toString(a);
					String s2=Integer.toString(b);
					return (s1+s2).compareTo(s1+s2);
				}
			});
			String s="";
			for(int i=0;i<arr.length;i++)
			{
				s+=arr[i];
			}
			return s;
		}
}
				
		



