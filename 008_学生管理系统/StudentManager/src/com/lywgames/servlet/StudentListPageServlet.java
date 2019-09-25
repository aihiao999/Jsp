package com.lywgames.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lywgames.domain.PageBean;
import com.lywgames.domain.Student;
import com.lywgames.service.StudentService;
import com.lywgames.service.impl.StudentServiceImpl;

public class StudentListPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int currentPage = Integer.valueOf(req.getParameter("currentPage")).intValue() ;
		
		StudentService service = new StudentServiceImpl();
		PageBean<Student> pageBean = service.findStudentByPage(currentPage);
		req.setAttribute("pageBean", pageBean);
		req.getRequestDispatcher("page_list.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}