package com.app.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceC implements IServiceC {

	@Override
	public Integer multiply(Integer a, Integer b) {
		if (a != null && b != null)
			return a * b;
		else
			return null;
	}

}
