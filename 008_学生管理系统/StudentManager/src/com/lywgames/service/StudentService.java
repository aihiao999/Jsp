package com.lywgames.service;

import java.sql.SQLException;
import java.util.List;

import com.lywgames.domain.PageBean;
import com.lywgames.domain.Student;

/**
 * 这是学生的业务处理规范
 */
public interface StudentService {
	int DEFAULT_PAGE_SIZE = 5; // 默认一页显示多少条记录
	
	/**
	 * 查询所有学生
	 * @return  List<Student>
	 */
	List<Student> findAll();
	
	/**
	 * 添加学生
	 * @param student 需要添加到数据库的学生对象
	 * @throws SQLException
	 */
	int insert(Student student);
	
	/**
	 * 根据id删除学生
	 * @param sid
	 * @throws SQLException
	 */
	int delete(int sid);
	
	/**
	 * 根据id查询单个学生对象
	 * @param sid
	 * @return
	 * @throws SQLException
	 */
	Student findStudentById(int sid);
	
	/**
	 * 更新学生信息
	 * @param student 需要更新的学生数据
	 * @throws SQLException
	 */
	int update(Student student);
	
	/**
	 * 模糊查询, 根据姓名或者根据性别或者两者兼有。 
	 * @param sname
	 * @param sgender
	 * @return 集合
	 * @throws SQLException
	 */
	List<Student> searchStudent(String sname, String sgender);
	
	/**
	 * 查询当页的学生数据
	 * @param currentPage
	 * @return
	 * @throws SQLException
	 */
	PageBean<Student> findStudentByPage(int currentPage);
}
