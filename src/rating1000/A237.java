package rating1000;
import java.util.Scanner;
public class A237 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int harr[] = new int[1440];
		
		for (int i = 0; i < n; i++) {
			int h = s.nextInt();
			int m = s.nextInt();
			int hmcnt = h*60 + m;
			harr[hmcnt]++;
		}
		s.close();
		int mx = 0;
		for (int i = 0; i < harr.length; i++) {
			if(harr[i] > mx)
				mx = harr[i];
		}
		System.out.println(mx);
	}
}
