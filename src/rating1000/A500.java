package rating1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A500 {

	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		int d = fs.nextInt();
		int arr[] = new int[n];
		
		for(int i =1; i<n; i++)
			arr[i] = fs.nextInt();
		
		int h[] = new int[n+1];
		
		
		for(int i =1; i<n; i += arr[i])
		{
			if(i <= n)
				{
					h[arr[i]+i] = 1;
				}
			if(i == d)
			{
				break;
			}
		}
		
		if(h[d] == 1)
			System.out.println("YES");
		else
			System.out.println("NO");
	
	}
	

	
	
	
	
	
	
	
	
/*-------------------------------------------------------------------------*/	
	public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        public FastScanner() {
            try    {
                br = new BufferedReader(new InputStreamReader(System.in));
//              br = new BufferedReader(new FileReader("testdata.out"));
                st = new StringTokenizer("");
            } catch (Exception e){e.printStackTrace();}
        }
        public String next() {
                if (st.hasMoreTokens())    return st.nextToken();
            try {st = new StringTokenizer(br.readLine());}
                catch (Exception e) {e.printStackTrace();}
            return st.nextToken();
        }
        public int nextInt() {return Integer.parseInt(next());}
        public long nextLong() {return Long.parseLong(next());}
        public double nextDouble() {return Double.parseDouble(next());}
 
        public String nextLine() {
                String line = "";
            try {line = br.readLine();}
            catch (Exception e) {e.printStackTrace();}
                return line;
        }
	}
}
