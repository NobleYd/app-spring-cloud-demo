package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.IServiceA;

@RestController
public class QudraticController implements IServiceA {

	@Autowired
	IServiceA serviceA;

	@Override
	public Integer quadraticSum(Integer a, Integer b) {
		if (a != null && b != null)
			return serviceA.quadraticSum(a, b);
		else
			return null;
	}

}
