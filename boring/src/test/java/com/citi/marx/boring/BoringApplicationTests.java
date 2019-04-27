package com.citi.marx.boring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoringApplicationTests {

	@Autowired
	DummyService dummyService;
	
	@Test
	public void contextLoads() {
		System.out.println(dummyService.getAppInfo("test"));
	}

}
