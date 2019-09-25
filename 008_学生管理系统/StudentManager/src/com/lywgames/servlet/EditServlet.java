package com.lywgames.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lywgames.domain.Student;
import com.lywgames.service.StudentService;
import com.lywgames.service.impl.StudentServiceImpl;

public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String sid = req.getParameter("sid");
		StudentService service = new StudentServiceImpl();
		Student student = service.findStudentById(Integer.parseInt(sid));
		if(student != null) {
			req.setAttribute("student", student);
			req.getRequestDispatcher("edit.jsp").forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}