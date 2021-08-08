package org.cts.test.login;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class Both {
	public static void main(String[] args) {
		Result res = JUnitCore.runClasses(Java.class, Java1.class);
		int failureCount = res.getFailureCount();
		System.out.println(failureCount);
		int ignoreCount = res.getIgnoreCount();
		System.out.println(ignoreCount);
		List<Failure> failures = res.getFailures();
		for (Failure x : failures) {
			System.out.println(x);
			

		}
	}
}
