package com.lywgames.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.lywgames.dao.StudentDao;
import com.lywgames.dao.impl.StudentDaoImpl;
import com.lywgames.domain.PageBean;
import com.lywgames.domain.Student;
import com.lywgames.service.StudentService;

/**
 * 这是学生业务实现
 */
public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao = new StudentDaoImpl();
	
	@Override
	public List<Student> findAll(){
		try {
			return studentDao.findAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insert(Student student){
		try {
			return studentDao.insert(student);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public int delete(int sid) {
		try {
			return studentDao.delete(sid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public Student findStudentById(int sid) {
		try {
			return studentDao.findStudentById(sid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(Student student) {
		try {
			return studentDao.update(student);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public List<Student> searchStudent(String sname, String sgender) {
		try {
			return studentDao.searchStudent(sname, sgender);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PageBean<Student> findStudentByPage(int currentPage) {
		PageBean<Student> pageBean = new PageBean<Student>();
		pageBean.setCurrentPage(currentPage);
		pageBean.setPageSize(DEFAULT_PAGE_SIZE);
		try {
			pageBean.setList(studentDao.findStudentByPage(currentPage, DEFAULT_PAGE_SIZE));
			int count = studentDao.findCount();
			pageBean.setTotalSize(count);
			pageBean.setTotalPage(count % DEFAULT_PAGE_SIZE == 0 ? count / DEFAULT_PAGE_SIZE : (count / DEFAULT_PAGE_SIZE) + 1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pageBean;
	}
	
}
