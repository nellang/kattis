package com.company;

import java.util.HashSet;

public class ListGame {

	public static void main(String[] args) {
		
		Kattio io = new Kattio(System.in, System.out);
		long x = io.getLong();
		long number = x;
		HashSet<Long> factors = new HashSet<Long>();
		for (long i = 2; i*i <= number; i++) {
			if (x%i == 0) {
				x /= i;
				factors.add(i);
				for (long j = 2*i; j <= x; j += i) {
					if (x%j == 0) {
						x /= j;
						factors.add(j);
					}
				}
			}
		}
		io.println(factors.size());
		io.close();
	}
}