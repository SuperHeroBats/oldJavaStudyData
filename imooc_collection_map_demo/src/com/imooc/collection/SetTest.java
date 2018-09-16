package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	
	public List<Course> coursesToSelect;
	
	private Scanner console;
	
	public Student student;
	
	public SetTest(){
		coursesToSelect = new ArrayList<Course>();
		console = new Scanner(System.in);
	}
	
	public void createStudentAndselectCourse(){
		
		student = new Student("1","小明");
		System.out.println("\n欢迎同学：" + student.name + "选课!\n");
		
		Scanner console = new Scanner(System.in);
		for(int i = 0 ; i < 3 ; i++){
			System.out.println("请输入课程ID");
			String courseId = console.next();
			for (Course cr : coursesToSelect) {
				if(cr.id.equals(courseId)){
					student.courses.add(cr);
					
					
				}
			}
		}
	}
	
	public void testSetContains(){
		
		System.out.println("请输入学生已选课程的名称：");
		String name = console.next();
		Course course3 = new Course();
		course3.name = name;
		System.out.println("\n查询课程course3是否存在" + course3.name + "," + student.courses.contains(course3));
		
	}
	
	//教学写的testAdd
	public void testAdd2() {
		
		Course cr1 = new Course("1", "数据结构");
		coursesToSelect.add(cr1);
		Course temp = (Course) coursesToSelect.get(0);

		Course cr2 = new Course("2", "C语言");
		coursesToSelect.add(0, cr2);
		Course temp2 = (Course) coursesToSelect.get(0);

		Course[] course = { new Course("3", "大学英语"), new Course("4", "汇编语言") };
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) coursesToSelect.get(2);
		Course temp4 = (Course) coursesToSelect.get(3);


		Course[] course2 = { new Course("5", "高等数学"), new Course("6", "离散数学") };
		coursesToSelect.addAll(2, Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);

	}
	
	
	
	//我写的testAdd
	public void testAdd(){
		
		//简写版
		coursesToSelect.add(new Course("1", "C语言"));
		coursesToSelect.add(new Course("2", "数据结构"));
		
		//数组版
		Course[] course = {new Course("3","大学英语"),new Course("4","汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		
		//教学版
		Course cr = new Course("5","高等数学");
		coursesToSelect.add(cr);
		Course cr2 = new Course("6","离散数学");
		coursesToSelect.add(cr2);
		
		}
	
	public void testForEach(){
		System.out.println("备选课程列表(通过ForEach访问)");
		for(Course cr : coursesToSelect){
			System.out.println("课程:" + cr.id + "." + cr.name);
		}
	}
	
	public static void main(String[] args) {
		
		SetTest st = new SetTest();
		
		
//		System.out.println("\n***欢迎选课***\n");
//		
		st.testAdd();
//		
		st.testListContains();
		
//		st.testAdd2();
//		
		st.testForEach();
		
//		st.createStudentAndselectCourse();
//		st.testSetContains();
		
//		
//		Student student = new Student("1","小明");
//		System.out.println("\n欢迎同学：" + student.name + "选课!\n");
//		
//		Scanner console = new Scanner(System.in);
//		for(int i = 0 ; i < 3 ; i++){
//			System.out.println("请输入课程ID");
//			String courseId = console.next();
//			for (Course cr : st.coursesToSelect) {
//				if(cr.id.equals(courseId)){
//					student.courses.add(cr);
//					
//					
////					student.courses.add(cr);
//					//Set也可以添加空，不会报错，但实际应用并不广泛
////					student.courses.add(null);
//				}
//			}
//		}
//		
//		
//		
//		
//		st.testForEachForSet(student);
		
	}
	
	public void testForEachForSet(Student student){
		//加载学生选课，打印输出
		System.out.println("共选了" + student.courses.size() + "门课程");
				for (Course cr : student.courses) {
					System.out.println("课程" + cr.id + "." + cr.name);
				}
	}
	
	
	public void testListContains(){
		
		//获取指定位置的课程
		Course course = coursesToSelect.get(0);
		
		//调用contains对比某课程是否存在
		System.out.println("当前课程为：" + coursesToSelect.get(0).name + "\n");
		System.out.println("查询课程是否存在:" + course.name + "," + coursesToSelect.contains(course));
		
		/*
		 * 因为本身就是获取备选课程中的课程，返回肯定是true
		 */
		
		//从键盘上输入课程名称，判断是否存在
		System.err.println("请输入课程名称：");
		String name = console.next();
		Course course3 = new Course();
		course3.name = name;
		System.out.println("\n查询课程course是否存在:" + course3.name + "," + coursesToSelect.contains(course3));
		
		//创建新的course
//		Course course2 = new Course(course.id , course.name);
//		System.out.println("\n查询课程course2是否存在" + course2.name + "," + coursesToSelect.contains(course2));
		
		//通过indexOf方法获取某元素的索引位置
		if(coursesToSelect.contains(course3)){
			System.out.println("当前课程为" + course3.name + "的索引位置为:" + coursesToSelect.indexOf(course3));
		}
		
		/*
		 * course2属于新创对象，不属于coursesToSelect
		 */
		
		/*
		 * containsAll使用方法和removeAll一样
		 * 判断多个元素是否存在
		 */
		
	}
	
}

//当前代码出现过乱码 已修复 注释可能有误差
