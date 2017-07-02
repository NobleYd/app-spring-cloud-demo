package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.IServiceC;

@RestController
public class MultiplyController implements IServiceC {

	@Autowired
	IServiceC serviceC;

	@Override
	public Integer multiply(Integer a, Integer b) {
		return serviceC.multiply(a, b);
	}

}
