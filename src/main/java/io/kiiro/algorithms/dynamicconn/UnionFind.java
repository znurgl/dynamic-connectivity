package io.kiiro.algorithms.dynamicconn;

/**
 * 
 * @author Greg Bakos
 */
public interface UnionFind {
	
	/**
     * Merges <tt>left</tt> and <tt>right/tt>
     * @param left integer
     * @param right integer
     * @throws java.lang.IndexOutOfBoundsException unless both 0 <= p < N and 0 <= q < N
     */
	void union(int left, int right);
	
	/**
	 * Are the two params <tt>left</tt> and <tt>right/tt> in the same component?
	 * 
	 * @param left integer
	 * @param right integer
	 * @return <tt>true</tt> if the two sites <tt>left</tt> and <tt>right</tt>
	 *         are in the same component, and <tt>false</tt> otherwise
	 * @throws java.lang.IndexOutOfBoundsException
	 *             unless both 0 <= left < N and 0 <= right < N
	 */
	boolean connected(int left, int right);
	
	/**
	 * Returns the number of components.
	 * 
	 * @return the number of components
	 */
	int count();
}
