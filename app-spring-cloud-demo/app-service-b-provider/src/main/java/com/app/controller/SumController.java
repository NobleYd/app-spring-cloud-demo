package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.IServiceB;

@RestController
public class SumController implements IServiceB {

	@Autowired
	IServiceB serviceB;

	@Override
	public Integer sum(Integer a, Integer b) {
		return serviceB.sum(a, b);
	}

}
