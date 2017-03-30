package kattis;

import java.util.ArrayList;

public class CPU2 {
	static ArrayList<Long> explosiveNumbers = new ArrayList<Long>();

	private static boolean checkForm(ArrayList<Long> factors) {
		if (factors.size() < 3) {
			return false;
		}
		else {
			if ((factors.get(1) - factors.get(0)) % (factors.get(0) - 1) != 0 || factors.get(0) * factors.get(0) <= factors.get(1)) {
				return false;
			} else {
				long a = (factors.get(1) - factors.get(0)) / (factors.get(0) - 1);
				long b = factors.get(0) - a;
				for (int i = 0; i < factors.size() - 1; i++) {
					if (factors.get(i + 1) != a * factors.get(i) + b) {
						return false;
					}
				}
			}
		}
		return true;
	}

	private static ArrayList<Long> findFactors(long n) {
		ArrayList<Long> factors = new ArrayList<Long>();
		for (long i = 3; i*i <= n; i += 2) {
			while (n%i == 0) {
				factors.add(i);
				n /= i;
			}
		}
		if (n > 2) {
			factors.add(n);
		}
		return factors;
	}

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in);
		explosiveNumbers.add((long) 6);
		int n = io.getInt();
		for (int i = 0; i < n; i++) {
			long xl = io.getLong();
			long xh = io.getLong();
			int count = 0;
			if (xl <= 6 && 6 <= xh) {
				count++;
			}
			if (xl < 6) {
				xl = 7;
			}
			if (xl%2 == 0) {
				xl++;
			}
			for (long x = xl; x <= xh; x += 2) {
				if (explosiveNumbers.contains(x)) {
					count++;
				} else if (checkForm(findFactors(x))) {
					count++;
					explosiveNumbers.add(x);
				}
			}
			io.println(count);
		}

		io.close();
	}

}