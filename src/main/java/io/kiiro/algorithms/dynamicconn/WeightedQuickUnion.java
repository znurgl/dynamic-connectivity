package io.kiiro.algorithms.dynamicconn;

/**
 * 
 * @author Greg Bakos
 */
public class WeightedQuickUnion extends UnionFindBase implements UnionFind {

	private int[] numberOfObjects;

	public WeightedQuickUnion(int N) {
		super(N);
		numberOfObjects = new int[N];
		for (int i = 0; i < N; i++) {
			numberOfObjects[i] = 1;
		}
	}

	private int find(int p) {
		while (p != ids[p])
			p = ids[p];
		return p;
	}

	public void union(int left, int right) {
		int rootP = find(left);
		int rootQ = find(right);
		if (rootP == rootQ)
			return;

		if (numberOfObjects[rootP] < numberOfObjects[rootQ]) {
			ids[rootP] = rootQ;
			numberOfObjects[rootQ] += numberOfObjects[rootP];
		} else {
			ids[rootQ] = rootP;
			numberOfObjects[rootP] += numberOfObjects[rootQ];
		}
	}

	public boolean connected(int left, int right) {
		return find(left) == find(right);
	}

}
