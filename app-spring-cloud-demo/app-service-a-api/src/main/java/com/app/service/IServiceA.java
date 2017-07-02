package com.app.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/***
 * 求平方和服务。QuadraticSum。
 * 
 * @author nobleyd
 */
public interface IServiceA {

	/***
	 * 求平方和。
	 * 
	 * @param a
	 *            参数1
	 * @param b
	 *            参数2
	 * @return a*a + b*b
	 */
	@RequestMapping(value = "/quadratic_sum", method = RequestMethod.POST)
	Integer quadraticSum(@RequestParam("a") Integer a, @RequestParam("b") Integer b);

}
