package kattis;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int n = io.getInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = io.getInt();
		}
		int[] sortedArray = new int[n];
		for (int i = 0; i < n; i++) {
			sortedArray[i] = array[i];
		}
		Arrays.sort(sortedArray);
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (sortedArray[i] == array[i]) {
				count++;
			}
		}
		io.println(count);
		io.close();
	}

}
