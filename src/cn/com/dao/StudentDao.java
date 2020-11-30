package cn.com.dao;

import java.util.List;

import cn.com.bean.Student;

public interface StudentDao {
	public void insertStudent(Student student);
	public List<Student> queryAllStudent();

}
