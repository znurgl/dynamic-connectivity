package io.kiiro.algorithms.dynamicconn;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.Test;

/**
 * 
 * @author Greg Bakos
 */
public class UnionFindTest {

	@Test
	public void unionTestBase() {
		int itemsNr = 15;
		int weightTest = 200000;

		// test QuickFind
		unionTest(new QuickFind(itemsNr));
		weightTest(new QuickFind(weightTest));

		// test QuickUnion
		unionTest(new QuickUnion(itemsNr));
		weightTest(new QuickUnion(weightTest));

		// test WeightedQuickUnion
		unionTest(new WeightedQuickUnion(itemsNr));
		weightTest(new WeightedQuickUnion(weightTest));
	}

	private void unionTest(UnionFind uf) {

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

	private void weightTest(UnionFind uf) {
		System.out.println(uf.getClass().getName() + ": Start Date: "
				+ Calendar.getInstance().getTime());

		for (int i = 0; i < 100000; i++) {
			uf.union(i, i + 1);
		}

		System.out.println(uf.getClass().getName() + ": Init End: "
				+ Calendar.getInstance().getTime());

		for (int i = 0; i < 100000; i++) {
			assertTrue(uf.connected(i, i + 1));
		}

		System.out.println(uf.getClass().getName() + ": Assertion End: "
				+ Calendar.getInstance().getTime());

	}

}
