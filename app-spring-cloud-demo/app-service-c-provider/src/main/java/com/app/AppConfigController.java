package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class AppConfigController {

	@Value("config-info")
	String configInfo;

	@RequestMapping("/info")
	public String info() {
		return configInfo;
	}

}
