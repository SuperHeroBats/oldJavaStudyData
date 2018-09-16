package com.imooc.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	
	//创建Map对象并且实例化
	public Map<String , Student> students;
	
	public MapTest(){
		this.students = new HashMap<String , Student>();
	}
	
	public void testPut(){
		Scanner console = new Scanner(System.in);
		int i = 0;
		while(i < 3){
			System.out.println("请输入学生ID");
			String ID = console.next();
			
			//查询ID是否被占用
			Student st = students.get(ID);
			if(st == null){
				
				System.out.println("请输入学生名字");
				String name = console.next();
				
				//创建新学生对象，存储学生信息
				Student newStudent = new Student(ID,name);
				//调用put方法存放新学生信息
				students.put(ID, newStudent);
				
				//打印输出添加的学生
				System.out.println("成功添加学生：" + students.get(ID).name);
				i++;
				
			}
			else{
				System.out.println("该ID被占用，请重新输入");
				continue;
			}
		}
	}
	
	//通过KeySet遍历学生信息
	public void testKeySet(){
		
		//ͨ创建KeySet对象
		Set<String> KeySet = students.keySet();
		
		System.out.println("\n成功添加" + students.size() + "个学生");
		
		for (String stuId : KeySet) {
			
			Student st = students.get(stuId);
			
			if(st != null){
				System.out.println("学生：" + st.name);
			}
			
		}
	}
	
	public void testRemove(){
		
		Scanner console = new Scanner(System.in);
		
		//调用while死循环
		while(true){
			
			System.out.println("\n请输入学生ID");
			String ID = console.next();
			Student st = students.get(ID);
			
			if(st == null){
				System.out.println("不存在该学生");
				continue;
			}
			students.remove(ID);
			System.out.println("成功删除学生：" + st.name);
			break;
		}
		
	}
	
	public void testEntrySet(){
		
		//因为Entry本身就是泛型集合，所以需要添加<> 类型与Map一样
		Set<Entry<String , Student>> entrySet = students.entrySet();
		
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("学生ID为：" + entry.getKey() + "姓名：" + entry.getValue().name);
		}
	}
	
	public void testModify(){
		
		System.out.println("请输入要修改学生信息的ID：");
		
		while(true){
			
			Scanner console = new Scanner(System.in);
			String stuID = console.next();
			
			Student student = students.get(stuID);
			
			if(student == null){
				System.out.println("该学生不存在");
				continue;
			}
			
			System.out.println("当前学生为:" + student.name);
			
			System.out.println("请输入要修改的信息：");
			String name = console.next();
			Student newStudent = new Student(stuID,name);
			//创建新newStudent对象存放信息
			
			students.put(stuID, newStudent);
			System.out.println("成功修改，当前学生为：" + newStudent.name + "\n");
			break;
			
		}
		
	}
	
	/*
	 * 测试Map中是否包含key值或者某个value值
	 */
	
	public void testContainsKeyOrValue(){
		
		System.out.println("请输入要查询的学生ID：");
		Scanner console = new Scanner(System.in);
		String id = console.next();
		
		//使用containsKey()方法，判断是否包含某个key值
		System.out.println("你输入的学生ID为：" + id + ",在学生映射表中是否存在:" + students.containsKey(id));
		if(students.containsKey(id)){
			System.out.println("对应的学生为：" + students.get(id).name);
		}
		
		System.out.println("请输入要查询的学生名字：");
		String name = console.next();
		
		//使用containsValue()方法，判断是否包含某个value值
		if(students.containsValue(new Student(null,name)))
			System.out.println("在学生映射表中，确实存在学生：" + name);
		else
				System.out.println("在学生映射表中不存在该学生！");
		
	}
	
	public static void main(String[] args) {
		MapTest mt = new MapTest();
		
		System.out.println("\n***学生注册***\n");
		mt.testPut();
		mt.testKeySet();
		
		mt.testContainsKeyOrValue();
		
//		System.out.println("\n***删除学生***\n");
//		mt.testRemove();
//		mt.testEntrySet();
		
//		System.out.println("\n***修改学生***\n");
//		mt.testModify();
//		mt.testEntrySet();
	}
	
}

//当前代码出现过乱码 已修复 注释可能有误差
