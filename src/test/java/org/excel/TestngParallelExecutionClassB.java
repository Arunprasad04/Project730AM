package org.excel;

import org.testng.annotations.Test;

public class TestngParallelExecutionClassB {
	@Test
	private void tc01() {
		System.out.println("tc01");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc02() {
		System.out.println("tc02");
		System.out.println(Thread.currentThread().getId());

	}
}
