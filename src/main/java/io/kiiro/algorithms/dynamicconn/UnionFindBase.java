package io.kiiro.algorithms.dynamicconn;

/**
 * 
 * @author Greg Bakos
 */
abstract class UnionFindBase {
	
	protected int[] ids;

	/**
	 * Create a data-structure with starter components from 0 to N-1.
	 * 
	 * @throws java.lang.IllegalArgumentException
	 *             if N < 0
	 * @param N
	 *            the number of objects
	 */
	public UnionFindBase(int N) {
		ids = new int[N];
		for (int i = 0; i < N; i++) {
			ids[i] = i;
		}
	}
	
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
