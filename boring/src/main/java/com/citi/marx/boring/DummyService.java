package com.citi.marx.boring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyService {
	@Value("${application.name}")
	private String appName;

	@RequestMapping("/appinfo")
    public String getAppInfo(
    		@RequestParam(value="name", defaultValue="dummy") String name) 
	{
        return appName + " - " + name;
    }
}
