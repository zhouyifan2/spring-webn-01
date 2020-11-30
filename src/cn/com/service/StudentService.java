package cn.com.service;

import java.util.List;

import cn.com.bean.Student;

public interface StudentService {
	public void insertStudent(Student student);
	public List<Student> queryAllStudent();

}
