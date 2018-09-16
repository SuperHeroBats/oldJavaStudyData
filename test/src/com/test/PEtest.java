package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PEtest {
	public static void main(String[] args) throws ParseException {
		String day = "2018.04.23 11:22:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		
		Date date = sdf.parse(day);
		System.out.println(date);
		
	}
}
