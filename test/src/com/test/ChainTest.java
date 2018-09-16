package com.test;

public class ChainTest {

	public static void main(String[] args) {
		ChainTest ct = new ChainTest();
		
		try{
			ct.test02();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void test01() throws CustomException{
		throw new CustomException("喝酒别开车");
	}
	
	public void test02(){
		try {
			test01();
		} catch (CustomException e) {
			RuntimeException newExc = new RuntimeException("司机一滴酒，亲人两行泪");
			newExc.initCause(e);
			//initCause对异常来进行包装的,对出现的异常可以追根究底
			throw newExc;
		}
	}

}
