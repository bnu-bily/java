package com.bily.eleventh;

import java.util.ArrayList;



/**
 * 11.5 改写 程序清单10-6的程序，使用ArrayList来代替数组存储学生，不改变原始类的合约
 * @author Administrator
 *
 */
public class Course {
	private String courseName;
	//private String[] students = new String[100];
	private ArrayList list = new ArrayList();
	private int numberOfStudent;
	
	public Course(String courseName){
		this.courseName = courseName;
	}
	
	public void addStudent(String student){
		//students[numberOfStudent] = student;
		//numberOfStudent++;
		list.add(student);
	}
	
	/*public String[] getStudents(){
		return students;
	}*/
	
	public ArrayList getStudents(){
		return list;
	}
	
	public int getNumberOfStudent(){
		//return numberOfStudent;
		return list.size();
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public void dropStudent(String student){
		list.remove(student);
	}
	
	public static void main(String[] args) {
		Course course = new Course("Java");
		course.addStudent("zhangsan");
		course.addStudent("lisi");
		
		System.out.println("Java 课的学生有：");
		for (int i = 0; i < course.getNumberOfStudent(); i++) {
			System.out.println(course.getStudents().get(i));
		}
	}

}
