package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	
	public List<Course> courses;
	
	public TestGeneric(){
		this.courses = new ArrayList<Course>();
	}
	//实例化带有泛型的list
	
	public void testAdd(){
		
		courses.add(new Course("1","大学语文"));
		
		//courses.add("泛型集合中，不能添加泛型规定类型及其子类型以外的对象，否则会报错");
		
		courses.add(new Course("2","Java基础"));
	}
	
	public void testForEach(){
		for(Course cr : courses){
			System.out.println(cr.id + ":" + cr.name);
		}
	}
	
	public void testChild(){
		ChildCourse ccr = new ChildCourse();
		ccr.id = "3";
		ccr.name = "子类型的课程";
		courses.add(ccr);
		
//		courses.add(new ChildCourse("",""));
		//不可以这样写，编译器会报错，未定义类型
	}
	
	public void testBasicType(){
		List<Integer> list = new ArrayList<Integer>();
		/*
		 * 泛型集合中不能使用基本数据类型
		 * 但可以通过包装类存入基本数据类型
		 * 例如，用integer存放int
		 * Long存放long
		 * Boolean存放boolean
		 */
		list.add(1); //强转int为Integer类型
		System.out.println("基本类型必须使用包装类作为泛型！" + list.get(0));
	}
	
	
	
	
	public static void main(String[] args) {
		
		TestGeneric  tg = new TestGeneric();
		tg.testAdd();
		tg.testForEach();
		tg.testChild();
		tg.testForEach();
		tg.testBasicType();
	}
	
}
