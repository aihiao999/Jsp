package com.lywgames.servlet;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lywgames.domain.Student;
import com.lywgames.service.StudentService;
import com.lywgames.service.impl.StudentServiceImpl;

public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
	
		String sname = req.getParameter("sname");
		String gender = req.getParameter("gender");
		String phone = req.getParameter("phone");
		String info = req.getParameter("info");
		long time = System.currentTimeMillis();
		try {
			time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(req.getParameter("birthday")).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Timestamp birthday = new Timestamp(time);
		
		String[] hobbys = req.getParameterValues("hobby");
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < hobbys.length; i++) {
			sb.append(hobbys[i]);
			if(i < hobbys.length - 1) {
				sb.append(",");
			}
		}
		
		StudentService service = new StudentServiceImpl();
		Student student = new Student(sname, gender, phone, sb.toString(), info, birthday);
		int result = service.insert(student);
		if(result == 1) {
			req.getRequestDispatcher("StudentListPageServlet.action?currentPage=1").forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
