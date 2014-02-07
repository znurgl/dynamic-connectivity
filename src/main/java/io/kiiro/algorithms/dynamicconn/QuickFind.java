package io.kiiro.algorithms.dynamicconn;

/**
 * 
 * @author Greg Bakos
 */
public class QuickFind  extends UnionFindBase  implements UnionFind {

	public QuickFind(int N) {
		super(N);
	}

	public void union(int left, int right) {
		// check the two objects are connected
		if (connected(left, right)) {
			return;
		}

		int pid = ids[left];
		for (int i = 0; i < ids.length; i++) {
			if (ids[i] == pid) {
				ids[i] = ids[right];
			}
		}
	}

	public boolean connected(int left, int right) {
		return ids[left] == ids[right];
	}

}
