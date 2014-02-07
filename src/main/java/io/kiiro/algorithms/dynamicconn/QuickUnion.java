package io.kiiro.algorithms.dynamicconn;

/**
 * 
 * @author Greg Bakos
 */
public class QuickUnion extends UnionFindBase implements UnionFind {

	public QuickUnion(int N) {
		super(N);
	}

	public void union(int left, int right) {
		ids[root(left)] = root(right);

	}

	private int root(int item) {
		while (item != ids[item])
			item = ids[item];
		return item;
	}

	public boolean connected(int left, int right) {
		return root(left) == root(right);
	}
}
