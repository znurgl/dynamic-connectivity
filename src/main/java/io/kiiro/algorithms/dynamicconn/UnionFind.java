package io.kiiro.algorithms.dynamicconn;

public interface UnionFind {
	void union(int left, int right);
	int find(int item);
	boolean connected(int left, int right);
	int count();
}
