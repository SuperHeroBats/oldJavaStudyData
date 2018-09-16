package com.test;

public class Etest {
	public static void main(String[] args) {
		Etest etest=new Etest(); 
		
		int result = etest.test03();
		
		System.out.println("test03执行了，返回值为"+result);
		
//		int result = etest.test();
//		System.out.println("执行异常处理完毕，返回值是："+result);
//		
//		System.out.println("\t"+"*********************"+"\t");
//		
//		int result02 = etest.test02();
//		System.out.println("test02的finally执行了");
	}
	
	public int test(){
		
		int divider = 10;
		int result = 100;
		
		try{
			while(divider >-1){
				divider--;
				result = result +100/divider;
			}
			return result;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("执行抛出异常了");
			return -1;
		}
	}
	
	public int test02(){
		int divider = 10;
		int result = 100;
		
		try{
			while(divider >-1){
				divider--;
				result = result +100/divider;
			}
			return result;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("执行抛出异常了");
			return result = 999;
		}finally{
			System.out.println("执行finally");
			System.out.println("finally的值为"+result);
		}
	}
	
	public int test03(){
		int divider = 10;
		int result = 100;
		
		try{
			while(divider >-1){
				divider--;
				result = result +100/divider;
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("执行抛出异常了");
		}finally{
			System.out.println("执行finally");
			System.out.println("finally的值为"+result);
		}
		return 1111;
	}
	
}
