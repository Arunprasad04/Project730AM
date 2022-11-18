package org.excel;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerClass {
public static void main(String[] args) {
	Result runClasses = JUnitCore.runClasses(JunitSuiteLevel.class);
	List<Failure> failures = runClasses.getFailures();
	for (Failure failure : failures) {
		String string = failure.toString();
		System.out.println(string);
	}
	System.out.println(runClasses.wasSuccessful());
}
}
