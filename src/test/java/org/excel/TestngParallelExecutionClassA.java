package org.excel;

import org.testng.annotations.Test;

public class TestngParallelExecutionClassA {
	@Test
	private void tc03() {
		System.out.println("tc03");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc04() {
		System.out.println("tc04");
		System.out.println(Thread.currentThread().getId());

	}
}
