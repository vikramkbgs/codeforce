package algo;

import java.util.Scanner;

public class kadenAlgo {


	public static void kaden(int arr[])
	{
		int mxsum = 0;
		int currSum  = 0;
		for(int i = 0; i<arr.length; i++)
		{
			currSum += arr[i];
			
			if(mxsum < currSum)
				mxsum = currSum;
			
			if(currSum < 0)
			{
				currSum = 0;
			}
		}
		System.out.println(mxsum);
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++)
			arr[i] = s.nextInt();
		s.close();
		kaden(arr);
	}

}
