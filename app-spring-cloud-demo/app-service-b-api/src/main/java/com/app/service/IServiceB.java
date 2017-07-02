package com.app.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/***
 * 求和服务。
 * 
 * @author nobleyd
 */
public interface IServiceB {

	/***
	 * 求和。
	 * 
	 * @param a
	 *            参数1
	 * @param b
	 *            参数2
	 * @return a+b
	 */
	@RequestMapping(value = "/sum", method = RequestMethod.POST)
	Integer sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b);

}
