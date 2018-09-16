package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * 备选课程类
 */

public class ListTest {
	/*
	 * 用于存放备选课程的list
	 */
	public List coursesToSelect;
	
	//创建构造方法实例化coursesToSelect
	public ListTest(){
		this.coursesToSelect = new ArrayList();
		//实例化coursesToSelect,List是接口，只能用ArryList
	}
	
	/*
	 * 用于往coursesToSelect中添加备选课程
	 */
	public void testAdd(){
		
		//创建一个课程对象，并通过add方法添加到备选课程List中
		Course cr1 = new Course("1", "数据结构");
		coursesToSelect.add(cr1);
		//也可以这样写，两种写法
		coursesToSelect.add(new Course("1", "数据结构"));
		
		Course temp = (Course) coursesToSelect.get(0);
		System.out.println("添加了课程：\n" + temp.id + ":" + temp.name);
		/*
		 * 需要取出元素进行输出
		 * 但对象存入集合中都会变成object类型
		 * 取出时需要类型转换
		 */
		
		//也可以把数据插在指定位置
		coursesToSelect.add(0,new Course("2", "替换算法"));
		Course temp2 = (Course) coursesToSelect.get(0);
		System.out.println("添加了课程：\n" + temp2.id + ":" + temp2.name);
		
//		该方法会抛出数组下标越界异常，只能插当前元素后面
//		Course cr3 = new Course("3", "test");
//		coursesToSelect.add(4,cr3);
		
		Course[] course = {new Course("3","离散数学"),new Course("4","汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		//通过该方法可以把数组插入list
		
		Course temp3 = (Course) coursesToSelect.get(3);
		Course temp4 = (Course) coursesToSelect.get(4);
		System.out.println("添加了两门课程：\n" + temp3.id + ":" + temp3.name
				+ ";" + temp4.id + ":" + temp4.name);
		
		//方法一样，也可以把数组插在指定位置，不再写后面代码
//		Course[] course2 = {new Course("5","高等数学"),new Course("6","大学英语")};
//		coursesToSelect.addAll(2,Arrays.asList(course));
	}
	
	public void testGet(){
		int size = coursesToSelect.size();
		System.out.println("有以下课程可待选：");
		for(int i = 0 ; i <size ; i++){
			Course cr = (Course) coursesToSelect.get(i);
			System.out.println("课程：" + cr.id + ";" + cr.name);
		}
		
	}
	
	//list的元素是可重复添加，并且有序的
	
	//通过迭代器遍历list
	public void testIterator(){
		Iterator it = coursesToSelect.iterator();
		System.out.println("有以下课程可待选(通过迭代器访问)：");
		while(it.hasNext()){
			Course cr = (Course) it.next();
			System.out.println("课程：" + cr.id + ";" + cr.name);
		}
	}
	
	//通过foreach遍历list，属于迭代器简写版
	public void testForEach(){
		System.out.println("有以下课程可待选(通过ForEach访问)：");
		for(Object oj : coursesToSelect){
			Course cr = (Course) oj;
			System.out.println("课程：" + cr.id + ";" + cr.name);
		}
	}
	
	//课程修改
	public void testModify(){
		coursesToSelect.set(1, new Course("2","C语言"));
	}
	
	//课程删除
	public void testRemove(){
		
		Course cr = (Course) coursesToSelect.get(4);
		System.out.println("我是课程：" + cr.id + ";" + cr.name + "，我即将被删除");
		coursesToSelect.remove(cr);
		
		//也可以这样写，但不知道具体元素，存在误删
//		coursesToSelect.remove(4);
		
		System.out.println("成功删除");
		testForEach();
	}
	
	public void testRemoveAll(){
		System.out.println("即将删除1和2位置上的课程！");
		Course[] courses = {(Course) coursesToSelect.get(1) , (Course) coursesToSelect.get(2)};
		coursesToSelect.removeAll(Arrays.asList(courses));
		System.out.println("成功删除");
		testForEach();
	}
	
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.testAdd();
		lt.testGet();
		lt.testIterator();
		lt.testForEach();
		lt.testModify();
		lt.testForEach();
		lt.testRemove();
		lt.testRemoveAll();
	}
}
