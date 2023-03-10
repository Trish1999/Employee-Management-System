package awtproject.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import awtproject.service.UserService;

/**
 * Servlet implementation class LogIn
 */
@WebServlet("/LogIn")
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L ;  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)  
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
		String username = request.getParameter("username");   
		String pass = request.getParameter("password");
		// check for user validation
		UserService userService = new UserService();
		boolean flag = userService.checkUser(username, pass);
		RequestDispatcher rd = null;
		if(flag) {
			rd = request.getRequestDispatcher("Profile");
			request.getSession().setAttribute("username", username);
		}else {
			rd = request.getRequestDispatcher("login.jsp");
			request.setAttribute("error", "Username or password incorrect");
		}
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}