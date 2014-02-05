package io.kiiro.algorithms.dynamicconn;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;

import org.joda.time.Seconds;
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

	@Test
	public void weightTest() {
		System.out.println("Start Date: " + Calendar.getInstance().getTime());
		UnionFind uf = new QuickFind(200000);

		for (int i = 0; i < 100000; i++) {
			uf.union(i, i+1);
		}
		
		System.out.println("Init End: " + Calendar.getInstance().getTime());
		
		for (int i = 0; i < 100000; i++) {
			assertTrue(uf.connected(i, i+1));
		}
		
		System.out.println("Assertion End: " + Calendar.getInstance().getTime());

	}

}
