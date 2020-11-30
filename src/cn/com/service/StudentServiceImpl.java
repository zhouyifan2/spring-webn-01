package cn.com.service;

import java.util.List;

import cn.com.bean.Student;
import cn.com.dao.StudentDao;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao dao;
	

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}
 
	public StudentDao getDao() {
		return dao;
	}

	@Override
	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> queryAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
