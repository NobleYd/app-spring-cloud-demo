package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.service.remote.IServiceB;
import com.app.service.remote.IServiceC;

@Service
public class ServiceA implements IServiceA {

	@Autowired
	IServiceB serviceB;
	@Autowired
	IServiceC serviceC;

	@Override
	public Integer quadraticSum(Integer a, Integer b) {
		return serviceB.sum(serviceC.multiply(a, a), serviceC.multiply(b, b));
	}

}
