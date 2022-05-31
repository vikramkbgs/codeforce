package rating1000;

import java.util.Scanner;

public class M1090 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
//		int m = s.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++)
		{
			int temp = s.nextInt();
			arr[i] = temp;
		}
		s.close();
		if(n == 1)
		{
			System.out.println(1);
			return;
		}
		
		if(n == 2)
		{
			if(arr[0] == arr[1])
				System.out.println(0);
			
		}
		
		int mx = 0;
		int fp = 0;
		int sp = 0;
		int pv = arr[0];
		int cnt = 0;
		boolean flag = true;
		for(int i = 1; i<n; i++)
		{
			sp = i;
			if(pv == arr[i])
			{
				flag = false;
				sp--;
				cnt = sp-fp;
				if(fp == 0)
					cnt++;
				System.out.println("sp : "+sp +" " + "fp: "+fp+" "+"cnt: "+cnt);
				
				fp = sp;
				if(mx <= cnt)
					mx = cnt;
			}
			else
			{
				cnt = sp-fp;
				if(mx <= cnt)
					mx = cnt;
			}
			pv = arr[i];
		}
		if(flag)
			System.out.println(n);
		else
		System.out.println(mx);
	}

}
