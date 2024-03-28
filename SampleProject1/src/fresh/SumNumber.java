package fresh;
import java.util.Scanner;
public class SumNumber {
	public static void main(String args[]) {
		int arr[]= {12,1234,45,67,1};
		int n=arr.length;
		System.out.println("sum="+findSum(arr,n));
	}
	private static int findSum(int[]arr, int n) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return max+min;
	}

}
