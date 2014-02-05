package io.kiiro.algorithms.dynamicconn;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class QuickFindTest {

	@Test
	public void unionTest() {

		// create an object
		UnionFind uf = new QuickFind(15);
		System.out.println(uf);

		// create some unions
		uf.union(1, 3);
		uf.union(3, 4);
		uf.union(6, 8);
		uf.union(10, 12);
		uf.union(12, 14);
		System.out.println(uf);

		// check unions
		assertTrue(uf.connected(1, 3));
		assertTrue(uf.connected(3, 4));
		assertTrue(uf.connected(1, 4));
		assertTrue(uf.connected(6, 8));
		assertTrue(uf.connected(10, 12));
		assertTrue(uf.connected(12, 14));
		assertTrue(uf.connected(10, 14));
	}

}
