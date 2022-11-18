package org.excel;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitWithTestRunnerClass {

	public static void main(String[] args) {
		Result runClasses = JUnitCore.runClasses(Junit3.class);
		 List<Failure> failures = runClasses.getFailures();
		 for (Failure fail : failures) {
			String string = fail.toString();
			System.out.println(string);
		}
		 System.out.println(runClasses.wasSuccessful());
	}
}
