package rating1000;

import java.util.Scanner;

public class B102 {
	
	
	public static long dsum(long num)
	{
		long sum = 0;
		while(num > 0)
		{
			sum += num%10;
			num /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		long num = 0;
		int cnt = 1;
		s.close();
		if(str.length() == 1)
		{
			System.out.println(0);
			return;
		}
		
		for(int i =0; i<str.length(); i++)
			{
			num += str.charAt(i) - '0';
			}
//		System.out.println("num :"+num);
		while(num > 9)
		{
			num = dsum(num);
			cnt++;
		}
		System.out.println(cnt);
	}

}
