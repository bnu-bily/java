package com.bily.eleventh;

import java.util.ArrayList;



/**
 * 11.5 ��д �����嵥10-6�ĳ���ʹ��ArrayList����������洢ѧ�������ı�ԭʼ��ĺ�Լ
 * @author Administrator
 *
 */
public class Course {
	private String courseName;
	//private String[] students = new String[100];
	private ArrayList list = new ArrayList();
	private int numberOfStudent;
	
	public Course(String student){
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
		
		System.out.println("Java �ε�ѧ���У�");
		for (int i = 0; i < course.getNumberOfStudent(); i++) {
			System.out.println(course.getStudents().get(i));
		}
	}

}
