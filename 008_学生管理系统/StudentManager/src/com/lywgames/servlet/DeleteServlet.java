package com.lywgames.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lywgames.service.StudentService;
import com.lywgames.service.impl.StudentServiceImpl;

public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String sid = req.getParameter("sid");
		StudentService service = new StudentServiceImpl();
		int result = service.delete(Integer.parseInt(sid));
		if(result == 1) {
			req.getRequestDispatcher("StudentListServlet.action").forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}