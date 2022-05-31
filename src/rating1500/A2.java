package rating1500;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class A2 {
	
	public static class playerScore{
		String name;
		int c_s = 0;
		playerScore next;
		playerScore(String s, int score)
		{
			this.name = s;
			c_s += score;
			next = null;
		}
		boolean find(playerScore head, String str)
		{
			if(head == null)
				return false;
			playerScore temp = head;
			while(temp != null)
			{
				if( str.equals(temp.name))
					return true;
				temp = temp.next;
			}
			return false;
		}
		int getScore(playerScore head, String str)
			{
				if(head == null)
					return 0;
				
				playerScore temp = head;
				
				while(temp != null)
				{
					if(str.equals(temp.name))
						{
						return temp.c_s;
						}
					temp = temp.next;
				}
				return 0;
		   }
		int max(playerScore head)
		{
			int max = -100000000;
			playerScore temp = head;
			while(temp != null)
			{
				if(max > temp.c_s)
				{
					max = temp.c_s;
				}
				temp = temp.next;
			}
			return max;
		}
	}

	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		String currentWinner;
		int currentWinnerScore;
		currentWinner = fs.next();
		currentWinnerScore = fs.nextInt();
		 
		playerScore head = new playerScore(currentWinner, currentWinnerScore);
		playerScore tail = head;
		for(int i = 1; i< n; i++)
		{
			String tempWinner;
			int tempWinnerScore;
			tempWinner = fs.next();
			tempWinnerScore = fs.nextInt();
			
			if(!head.find(head, tempWinner))
			{
				tail.next = new playerScore(tempWinner, tempWinnerScore);
				tail = tail.next;
			}
			else
			{
				tail.next = new playerScore(tempWinner, tempWinnerScore+head.getScore(head, tempWinner));
				tail = tail.next;
			}
			
		}
		int mx = head.max(head);
//		System.out.println(currentWinner);
//		System.out.println(head.name);
//		head.print(head);
//		System.out.println(head.find(head, "andrew"));
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
