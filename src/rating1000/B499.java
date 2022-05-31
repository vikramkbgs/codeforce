package rating1000;

import java.util.Scanner;

public class B499 {
	
	public static class LinkedListNode<T>{
		T fword;
		T sword;
		LinkedListNode<T> next;
		
		public LinkedListNode(T fword, T sword) {
			// TODO Auto-generated constructor stub
			this.fword = fword;
			this.sword = sword;
			next = null;
		}
		
		void create(LinkedListNode<T> head, T fword, T sword)
		{
			LinkedListNode<T> prev = head;
			if(prev == null)
				return;
			while(prev.next != null)
			{
				prev = prev.next;
			}
			
			LinkedListNode<T> temp = new LinkedListNode<>(fword, sword);
			temp.next = null;
			prev.next = temp;
			return;
		}
		
		void printdic(LinkedListNode<T> head)
		{
			LinkedListNode<T> temp = head;
			if(temp == null)
				return;
			while(temp != null)
			{
				System.out.println(temp.fword + "--->"+temp.sword);
				temp  = temp.next;
			}
			return;
		}
		
		void findPrint(LinkedListNode<T>head, T fword)
		{
			LinkedListNode<T> prev = head;
			if(prev == null)
				return;
			
			while( prev != null)
			{
				if((prev.fword).equals(fword))
					{
					System.out.print(prev.sword+" ");
					return;
					}
				prev = prev.next;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int i = 0;
		
		LinkedListNode<String> head = new LinkedListNode<String>("ram", "ram");
		while(i < m)
		{
			String fword, sword;
			fword = s.next();
			sword = s.next();
			
			if(fword.length() > sword.length())
			head.create(head, fword, sword);
			else
			head.create(head, fword, fword);
			
			i++;
		}
		i = 0;
		while(i < n)
		{
			String stword = s.next();
			head.findPrint(head, stword);
			i++;
		}
		s.close();
	}

}
