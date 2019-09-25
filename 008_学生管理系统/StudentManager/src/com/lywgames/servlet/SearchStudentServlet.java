package com.lywgames.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lywgames.domain.Student;
import com.lywgames.service.StudentService;
import com.lywgames.service.impl.StudentServiceImpl;

public class SearchStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
	
		String sname = req.getParameter("sname");
		String gender = req.getParameter("gender");
		
		StudentService service = new StudentServiceImpl();
		List<Student> studentList = service.searchStudent(sname, gender);
		if(studentList != null) {
			req.setAttribute("studentList", studentList);
		}
		req.getRequestDispatcher("list.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}