package com.app.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/***
 * 求积服务。
 * 
 * @author nobleyd
 */
public interface IServiceC {

	/***
	 * 求积。
	 * 
	 * @param a
	 *            参数1
	 * @param b
	 *            参数2
	 * @return a*b
	 */
	@RequestMapping(value = "/multiply", method = RequestMethod.POST)
	Integer multiply(@RequestParam("a") Integer a, @RequestParam("b") Integer b);

}
