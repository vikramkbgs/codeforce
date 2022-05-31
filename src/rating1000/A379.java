package rating1000;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A379 {
	
	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int a = fs.nextInt();
		int b = fs.nextInt();
		
		int time = 0;
		int c = 0;
		while(a > 0)
		{
			time += a;
			int burn = a+c;
			c = burn%b;
			a = burn/b;
//			System.out.println(time+" "+"a: "+a+" "+"c: "+c);
		}
		System.out.println(time);
	}
	
	
	
	
	
	
	
	
	
/*--------------------------------------------------------------------------*/
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
