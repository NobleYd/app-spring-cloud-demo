package com.app.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceB implements IServiceB {

	@Override
	public Integer sum(Integer a, Integer b) {
		if (a != null && b != null)
			return a + b;
		else
			return null;
	}

}
