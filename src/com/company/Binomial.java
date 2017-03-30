package kattis;

public class Binomial {

	private static long bionomial(int n, int k) {
		if (k > n/2) {
			k = n - k;
		}
//		long ckn = 1;
//		for (int i = 1, m = n; i <= k; i++, m--) {
//			ckn =  ckn * m/i;
//		}
//		return ckn;
		if (k == 0) {
			return 1;
		}
		return bionomial(n, k - 1) * (n - k + 1)/k;
	}

	public static void main(String[] args) {
		System.out.println(bionomial(10000, 99));
	}

}
