
package rating1000;
import java.util.Scanner;

public class A450 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			int temp = s.nextInt();
			arr[i] = temp/m;
		}
		s.close();
		int index = 0, mx = 0;
		for (int i = 0; i < arr.length; i++) {
			if(mx <= arr[i])
			{
				mx = arr[i];
				index = i;
			}
		}
		System.out.println(index+1);
	}
}
