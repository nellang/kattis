package kattis;

import java.util.ArrayList;

public class DFS {

	ArrayList<Node> nodes = new ArrayList<Node>();
	
	class Node {
		int data;
		boolean visited;
		
		Node(int data) {
			this.data = data;
		}
	}
	
	ArrayList<Node> findNeighbors(int adjacency_matrix[][], Node x) {
		int nodeIndex = -1;
		ArrayList<Node> neighbors = new ArrayList<Node>();
		
		for (int i = 0; i < nodes.size(); i++) {
			if (nodes.get(i).equals(x)) {
				nodeIndex = i;
				break;
			}
		}
		
		if (nodeIndex != -1) {
			for (int j = 0; j < adjacency_matrix[nodeIndex].length; j++) {
				if (adjacency_matrix[nodeIndex][j] == 1) {
					neighbors.add(nodes.get(j));
				}
			}
		}
		
		return neighbors;
	}
	
	void dfs (int adjacency_matrix[][], Node node) {
		ArrayList<Node> neighbors = findNeighbors(adjacency_matrix, node);
		for (int i = 0; i < neighbors.size(); i++) {
			Node n = neighbors.get(i);
			if (n != null && !n.visited) {
				n.visited = true;
				dfs(adjacency_matrix, n);
			}
		}
	}
}
