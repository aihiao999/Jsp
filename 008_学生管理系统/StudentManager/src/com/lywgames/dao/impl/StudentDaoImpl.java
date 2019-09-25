package com.lywgames.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.lywgames.dao.StudentDao;
import com.lywgames.domain.Student;
import com.lywgames.util.JDBCUtil;

/**
 * 这是StudentDao的实现。 针对前面定义的规范, 做出具体的实现。
 */
public class StudentDaoImpl implements StudentDao {
	/**
	 * 查询所有学生
	 */
	@Override
	public List<Student> findAll() throws SQLException {
		QueryRunner queryRunner = new QueryRunner();
		return queryRunner.query(JDBCUtil.getConn(), "select * from t_student", new BeanListHandler<Student>(Student.class));
	}
	
	/**
	 * 添加学生
	 */
	@Override
	public int insert(Student student) throws SQLException {
		QueryRunner queryRunner = new QueryRunner();
		return queryRunner.update(JDBCUtil.getConn(), "insert into t_student values (null, ?, ?, ?, ?, ?, ?)", student.getSname(), 
				student.getGender(), student.getPhone(), student.getHobby(), student.getInfo(), student.getBirthday());
	}
	
	/**
	 * 根据id删除学生
	 */
	@Override
	public int delete(int sid) throws SQLException {
		QueryRunner queryRunner = new QueryRunner();
		return queryRunner.update(JDBCUtil.getConn(), "delete from t_student where sid = ?", sid);
	}
	
	/**
	 * 根据id查询单个学生对象
	 */
	@Override
	public Student findStudentById(int sid) throws SQLException {
		QueryRunner queryRunner = new QueryRunner();
		return queryRunner.query(JDBCUtil.getConn(), "select * from t_student where sid = ?", new BeanHandler<Student>(Student.class), sid);
	}

	/**
	 * 更新学生信息
	 */
	@Override
	public int update(Student student) throws SQLException {
		QueryRunner queryRunner = new QueryRunner();
		return queryRunner.update(JDBCUtil.getConn(), "update t_student set sname = ?, gender = ?, phone = ?, hobby = ?, info = ?,  birthday = ? where sid = ?", 
				student.getSname(), student.getGender(), student.getPhone(), student.getHobby(), student.getInfo(), student.getBirthday(), student.getSid());
	}
	
	/**
	 * 模糊查询, 根据姓名或者根据性别或者两者兼有。 
	 */
	@Override
	public List<Student> searchStudent(String sname, String sgender) throws SQLException {
		/**
		 * 1. sname有值, sgender为null或者""
		 * select * from t_student where sname like ?
		 * 2. sgender有值, sname为null或者""
		 * select * from t_student where sgender = ?
		 * 3. sname有值, sgender也有值
		 * select * from t_student where sname = ? and sgender = ?
		 */
		
		String sql = "select * from t_student";
		List<String> params = new ArrayList<String>();
		if(sname != null && sname.length() > 0 && (sgender == null || sgender.length() <= 0)) {
			sql = sql + " where sname like ?";
			params.add("%" + sname + "%");
		}
		if(sgender != null && sgender.length() > 0 && (sname == null || sname.length() <= 0)) {
			sql = sql + " where gender = ?";
			params.add(sgender);
		}
		if(sname != null && sname.length() > 0 && sgender != null && sgender.length() > 0) {
			sql = sql + " where sname like ? and gender = ?";
			params.add("%" + sname + "%");
			params.add(sgender);
		}
		
		QueryRunner queryRunner = new QueryRunner();
		return queryRunner.query(JDBCUtil.getConn(), sql, new BeanListHandler<Student>(Student.class), params.toArray());
	}

	/**
	 * 查询当页的学生数据
	 */
	@Override
	public List<Student> findStudentByPage(int currentPage, int pageSize) throws SQLException {
		// 假设pageSize是5
		// 第一页: [5, 0], 0 = (1 - 1) * 5
		// 第二页: [5, 5], 5 = (2 - 1) * 5
		// 第三页: [5, 10], 10 = (3 - 1) * 5
		String sql = "select * from t_student limit ? offset ?";
		QueryRunner queryRunner = new QueryRunner();
		return queryRunner.query(JDBCUtil.getConn(), sql, new BeanListHandler<Student>(Student.class), pageSize, (currentPage - 1) * pageSize);
	}

	/**
	 * 查询总的学生记录数
	 */
	@Override
	public int findCount() throws SQLException {
		QueryRunner queryRunner = new QueryRunner();
		return ((Long)queryRunner.query(JDBCUtil.getConn(), "select count(*) from t_student", new ScalarHandler())).intValue();
	}

}
