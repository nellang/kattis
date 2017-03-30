package kattis;

import java.util.HashSet;

public class EqualSumsEasy {
	
	static HashSet<Integer> s = new HashSet<Integer>(20);

	public static void main(String[] args){
		Kattio io = new Kattio(System.in);
		int t = io.getInt();
		for (int i = 0; i < t; i++) {
			int n = io.getInt();
			for (int j = 0; j < n; j++) {
				s.add(io.getInt());
			}
			System.out.println("Case #" + i);
			
		}
		
		io.close();
	}
}
