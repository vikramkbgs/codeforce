package rating1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B279 {

	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		int t = fs.nextInt();
		int arr[] = new int[n];
		
		for(int i =0; i<n; i++)
			arr[i] = fs.nextInt();
		
		int mx_c = 0;
		long curr_sum =  0;
		
		int i  = 0, j = 0;
		
		while(i < n && j < n)
		{
			
			if(arr[j]  > t)
			{
				i = ++j;
				curr_sum = 0;
			}
			
			if(j < n && arr[j] + curr_sum <= t)
			{
//				System.out.println("i: "+i+"j: "+j);
				curr_sum += arr[j];
				mx_c = Math.max(mx_c, ((j - i)+1));
//				System.out.println("mx_c: "+mx_c+"curr_sum: "+curr_sum);
				j++;
			}
			else
			{
				if(i < n)
//				System.out.println("i: "+i+"j: "+j);
				{
					curr_sum -= arr[i];
					i++;
				}
				
			}
			
		}		
		System.out.println(mx_c);
	}	
	

	

	
/*-------------------------------------------------------------*/
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
