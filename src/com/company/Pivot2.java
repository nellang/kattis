package kattis;

public class Pivot2 {

	static int[] array = new int[100100];
	static int[] leftMax = new int[100100];
	static int[] rightMin = new int[100100];

	static void findRightMin(int n) {
		rightMin[n - 1] = Integer.MAX_VALUE;
		int min = array[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			if (min > array[i + 1]) {
				min = array[i + 1];
			}
			rightMin[i] = min;
		}
	}

	static void findLeftMax(int n) {
		leftMax[0] = Integer.MIN_VALUE;
		int max = array[0];
		for (int i = 1; i < n; i++) {
			if (max < array[i - 1]) {
				max = array[i - 1];
			}
			leftMax[i] = max;
		}
	}

	public static void main(String[] args){
		Kattio io = new Kattio(System.in, System.out);
		int n = io.getInt();
		for (int i = 0; i < n; i++) {
			array[i] = io.getInt();
		}
		int count = 0;
		findLeftMax(n);
		findRightMin(n);
		for (int i = 0; i < n; i++) {
			if (leftMax[i] < array[i] && array[i] < rightMin[i]) {
				count++;
			}
		}
		io.println(count);
		io.close();
	}
}