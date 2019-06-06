package com.exam.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exam.demo.mapper.AccountMapper;
import com.exam.demo.entity.Account;


@RestController
@RequestMapping(value = "/api/")
public class UserTestController {
	
	private static final Logger log = LoggerFactory.getLogger(UserTestController.class);
	
	
	@Autowired
	private AccountMapper accountMapper;
	
	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String getTest() {
		log.info("日志打印！！！！！！");
		return "hello world";
	}
	
	//获取用户信息
	@RequestMapping(value = "info", method = RequestMethod.GET)
	public Account getInfo() {
		
		log.info("日志打印");
		log.info("日志打印test");
		
		return accountMapper.getMessById(20);
	}

}
