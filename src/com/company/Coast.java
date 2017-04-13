package com.company;

public class Coast {

	static int dfs (int[][] matrix, int i, int j) {
		int length = 0;
		if (i < matrix.length && i >= 0 && j < matrix[0].length && j >= 0) {
			if (matrix[i][j] == 1) {
				length++;
			}
			if (matrix[i][j] == 0) {
				matrix[i][j] = 2;
				dfs(matrix, i + 1, j);
				dfs(matrix, i, j + 1);
				dfs(matrix, i - 1, j);
				dfs(matrix, i, j - 1);
			}
		}
		return length;
	}

	public static void main(String[] args) {

		Kattio io = new Kattio(System.in, System.out);
		int n = io.getInt();
		int m = io.getInt();

		int[][] matrix = new int[n+1][m+1];
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				matrix[i][j] = io.getWord().charAt(j-1) - '0';
			}
		}

		io.println(dfs(matrix, 0, 0));
		io.close();
	}
}