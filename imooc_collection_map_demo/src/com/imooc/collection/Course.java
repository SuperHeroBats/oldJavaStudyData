package com.imooc.collection;

/*
 * 课程类
 */

public class Course {
	
	public String id;
	public String name;
	
	public Course (String id,String name){
		this.id = id;
		this.name = name;
	}
	
	public Course(){
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Course))
			return false;
		Course other = (Course) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	//equals模板
	
//	public boolean equals(Object obj){
//		if(this == obj){
//			return true;
//		}
//		if(obj == null)
//			return false;
//		if(!(obj instanceof Course))
//			return false;
//		//以上可以判断出obj为Course类型的对象,并且不为空
//		
//			Course course = (Course) obj;
//			
//			if(this.name == null){
//				
//				if(course.name == null)
//					return true;
//					else
//					return false;
//			}
//			else{
//				if(this.name.equals(course.name))
//					return true;
//					else
//					return false;
//					}
//				}
	
	
	
}
