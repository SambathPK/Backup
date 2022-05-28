package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {

	@Test(retryAnalyzer = MyRetry.class)
	private void datas() {
		
		Assert.assertEquals("HOLA","Hi");
	}
}
