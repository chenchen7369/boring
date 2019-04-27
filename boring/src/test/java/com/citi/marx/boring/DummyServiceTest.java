package com.citi.marx.boring;

import org.junit.Test;

public class DummyServiceTest {

	@Test
	public void test() {
		DummyService dummyService = new DummyService();
		System.out.println(dummyService.getAppInfo("test"));
	}

}
