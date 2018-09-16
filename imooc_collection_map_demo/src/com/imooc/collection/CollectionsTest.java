package com.imooc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest {

	/*
	 * 通过Collections.sort()方法，对Integer泛型的list进行排序
	 * 对String泛型及其他类型的list排序
	 */
	
	public void testSort1(){
		
		List<Integer> integerList = new ArrayList<Integer>();
		
		//插入十个100以内的不重复随机整数
		Random random = new Random();
		Integer k;
		for(int i = 0 ; i < 10 ; i++){
			do{
				k = random.nextInt(100);
			}
			while(integerList.contains(k));
			//如果重复了再次执行循环，保证了k值的不重复性
			integerList.add(k);
			System.out.println("成功添加整数：" + k );
		}
		
		System.out.println("\n----------排序前---------");
		
		for (Integer integer : integerList) {
			System.out.print("元素：" + integer + " ");
		}
		
		Collections.sort(integerList);
		
		System.out.println("\n\n----------排序后---------");
		
		for (Integer integer : integerList) {
			System.out.print("元素：" + integer + " ");
		}
		
	}
	
	public void testSort2(){
		/*
		 * 创建String泛型的list进行排序
		 */
		
		List<String> stringList = new ArrayList<String>();
		stringList.add("GitHub");
		stringList.add("Hasee");
		stringList.add("Android");
		
		System.out.println("--------排序前--------");
		for (String string : stringList) {
			System.out.println("元素：" + string);
		}
		
		Collections.sort(stringList);
		
		System.out.println("--------排序后--------");
		for (String string : stringList) {
			System.out.println("元素：" + string);
		}
		
	}
	
	public void testSort3(){
		List<Student> studentList = new ArrayList<Student>();
		Random random = new Random();
		studentList.add(new Student(random.nextInt(1000) + "","Mike"));
		studentList.add(new Student(random.nextInt(1000) + "","Lucy"));
		studentList.add(new Student(random.nextInt(1000) + "","Angela"));
		
		studentList.add(new Student(10000 + "","Jack"));
		
		/*
		 * 这种写法不严谨，可以完善生成3个不重复随机正整数作为学生ID
		 * 可以利用Map的key和value值进行绑定
		 * 待完善
		 */
		System.out.println("--------排序前--------");
		for (Student student : studentList) {
			System.out.println("学生：" + student.id + ":" + student.name);
		}
		
		Collections.sort(studentList); //需要添加Comparable 否则会报错
		
		System.out.println("\n--------排序后--------");
		for (Student student : studentList) {
			System.out.println("学生：" + student.id + ":" + student.name);
		}
		
		/*
		 * 默认字符串类型排序，也就是从零位字符开始排序
		 * 先数字后字母，先大写再小写
		 * 如果学生ID为整型Int或者integer，则会从数字从小到大排序
		 */
		
		
		Collections.sort(studentList, new StudentComparator());
		//实例化对象
		System.out.println("\n--------按照姓名排序后--------");
		for (Student student : studentList) {
			System.out.println("学生：" + student.id + ":" + student.name);
		}
		
	}
	
	public static void main(String[] args) {
		
		CollectionsTest ct = new CollectionsTest();
		
//		ct.testSort1();
//		ct.testSort2();
		ct.testSort3();
		
		/*
		 * Collections.sort()课后练习，再完成
		 */
		
		/*
		 * Comparable为默认比较规则
		 * Comparator为临时比较规则
		 */
		
	}
	
}
