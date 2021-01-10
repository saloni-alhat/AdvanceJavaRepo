package com.zensar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;

public class HelloController extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("userName");
		String cityName=request.getParameter("cityName");
		System.out.println("Name:"+name);
		System.out.println("City: "+cityName);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		request.setAttribute("name", name);
		request.setAttribute("city", cityName);
		
		try {
		rd.forward(request, response);
		}catch(Exception e) {
			System.out.println("Exception Occured:"+e);
		}
	}
	
}

