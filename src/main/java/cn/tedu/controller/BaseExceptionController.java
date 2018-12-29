package cn.tedu.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class BaseExceptionController {
	
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public String ExceptionMsg(Exception e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
		return e.getMessage();
	}
}
