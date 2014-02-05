package io.kiiro.algorithms.dynamicconn;

/**
 * 
 * @author Greg Bakos
 */
public class QuickFind implements UnionFind {

	private int[] ids;

	/**
	 * Create a data-structure with starter components from 0 to N-1.
	 * 
	 * @throws java.lang.IllegalArgumentException
	 *             if N < 0
	 * @param N
	 *            the number of objects
	 */
	public QuickFind(int N) {
		ids = new int[N];
		for (int i = 0; i < N; i++) {
			ids[i] = i;
		}
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

	public int find(int item) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Are the two params <tt>left</tt> and <tt>right/tt> in the same component?
	 * 
	 * @param left
	 *            integer
	 * @param right
	 *            integer
	 * @return <tt>true</tt> if the two sites <tt>left</tt> and <tt>right</tt>
	 *         are in the same component, and <tt>false</tt> otherwise
	 * @throws java.lang.IndexOutOfBoundsException
	 *             unless both 0 <= left < N and 0 <= right < N
	 */
	public boolean connected(int left, int right) {
		return ids[left] == ids[right];
	}

	/**
	 * Returns the number of components.
	 * 
	 * @return the number of components
	 */
	public int count() {
		return ids.length;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int item : ids) {
			sb.append(item + ", ");
		}

		return sb.toString();
	}

}
