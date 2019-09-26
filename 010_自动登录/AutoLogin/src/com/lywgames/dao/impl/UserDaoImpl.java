package com.lywgames.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.lywgames.bean.UserBean;
import com.lywgames.dao.UserDao;
import com.lywgames.util.JDBCUtil;

public class UserDaoImpl implements UserDao {
	@Override
	public UserBean login(UserBean bean) {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "select * from t_user where username = ? and password = ?";
		try {
			return runner.query(sql, new BeanHandler<UserBean>(UserBean.class), bean.getUsername(), bean.getPassword());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
