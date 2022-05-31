package rating1500;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AA2 {
	
	public class Node{
		String name;
		int sumScore;
		Node next;
		Node(String name, int sumScore)
		{
			this.name = name;
			this.sumScore = sumScore;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		
		String fname = fs.next();
		int score = fs.nextInt();
		Node head = new Node(fname, score);
		Node tail = head;
		
		for(int i = 0; i<n; i++)
		{
			String tempWinner;
			int tempWinnerScore;
			tempWinner = fs.next();
			tempWinnerScore = fs.nextInt();
			
		}
	}
	
	
	
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
