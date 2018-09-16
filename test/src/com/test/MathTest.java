package com.test;

public class MathTest {
	public static void main(String[] args) {
		double a = 12.81;
		int b = (int) a;
		System.out.println("强制转换a为int值:" + b);
		long c = Math.round(a);
		System.out.println("四舍五入a值为：" + c);
		double d = Math.floor(a);
		System.out.println("返回小于参数的最大整数：" + d);
		double e = Math.ceil(a);
		System.out.println("返回大于参数的最小整数" + e);
//		double x = Math.random(); //调用random方法，生成[0,1)之间的随机 浮点数
//		System.out.println("随机数："+ x);
		int y = (int)(Math.random() * 99); //生成[0,99)之间的随机 整数
		System.out.println("生成[0,99)之间的随机整数" + y);
		
		System.out.println("\n**********Math运用***********\n");
		
		int [] nums = new int[10];
		for(int i = 0 ; i <nums.length ; i++){
			int x = (int)(Math.random() * 10);
			nums[i] = x;
		}
		
		//使用foreach循环输出数组元素
		for(int num : nums){
			System.out.print(num + " ");
		}
	}
}
