package com.test;

//自定义异常

public class CustomException extends Exception {
	
	public CustomException(){
		//无参构造器
		//自定义异常写好，可再添加更多功能
	}
	
	public CustomException(String message){
		super(message);
	}//含参构造器
}
