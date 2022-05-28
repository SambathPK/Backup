package com.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer {

	int count =0;
	int limit =25;
	@Override
	public boolean retry(ITestResult result) {
		if (count< limit) {
			return true;
		}
		return false;
	}

}
