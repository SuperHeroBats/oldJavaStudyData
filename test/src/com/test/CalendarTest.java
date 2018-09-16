package com.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		Date date = c.getTime();
		System.out.println("利用calendar的getTime获取时间："+date);
		
		int year = c.get(Calendar.YEAR); //获取年
		int month = c.get(Calendar.MONTH) + 1; //获取月份 0代表1月份
 		int day = c.get(Calendar.DAY_OF_MONTH); //获取日期
		int hour = c.get(Calendar.HOUR_OF_DAY); //获取小时
		int minute = c.get(Calendar.MINUTE); //获取分钟
		int second = c.get(Calendar.SECOND); //获取秒
		
		System.out.println("利用calendar获取时间并输出：" + year + "." + month + "." + day + " " + hour + ":" + minute + ":" + second);
	}
}
