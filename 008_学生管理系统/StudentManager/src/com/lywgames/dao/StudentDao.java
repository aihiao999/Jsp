package com.lywgames.dao;

import java.sql.SQLException;
import java.util.List;

import com.lywgames.domain.Student;

/**
 * 这是针对学生表的数据访问 
 */
public interface StudentDao {
	/**
	 * 查询所有学生
	 * @return  List<Student>
	 */
	List<Student> findAll() throws SQLException;
	
	/**
	 * 添加学生
	 * @param student 需要添加到数据库的学生对象
	 * @throws SQLException
	 */
	int insert(Student student) throws SQLException;
	
	/**
	 * 根据id删除学生
	 * @param sid
	 * @throws SQLException
	 */
	int delete(int sid) throws SQLException;
	
	/**
	 * 根据id查询单个学生对象
	 * @param sid
	 * @return
	 * @throws SQLException
	 */
	Student findStudentById(int sid) throws SQLException;
	
	/**
	 * 更新学生信息
	 * @param student 需要更新的学生数据
	 * @throws SQLException
	 */
	int update(Student student) throws SQLException;
	
	/**
	 * 模糊查询, 根据姓名或者根据性别或者两者兼有。 
	 * @param sname
	 * @param sgender
	 * @return 集合
	 * @throws SQLException
	 */
	List<Student> searchStudent(String sname, String sgender) throws SQLException;
	
	/**
	 * 查询当页的学生数据
	 * @param currentPage
	 * @param pageSize
	 * @return
	 * @throws SQLException
	 */
	List<Student> findStudentByPage(int currentPage, int pageSize) throws SQLException;
	
	
	/**
	 * 查询总的学生记录数
	 * @return
	 * @throws SQLException
	 */
	int findCount() throws SQLException;
}
