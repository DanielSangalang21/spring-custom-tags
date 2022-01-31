package com.example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.model.User;


import java.util.*;

/**
 * Servlet implementation class SomeServlet
 */
@WebServlet("/SomeServlet")
public class SomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SomeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User();
		user = user.validateCredentials(password, userName);
		if (user != null)
		{
			request.setAttribute("accessLevel",user.getAccessLevel().name());
			RequestDispatcher view = request.getRequestDispatcher("CustomTag.jsp");
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			getServletContext().setAttribute("verified", "true");
			view.forward(request, response);
		}
		else
		{
			getServletContext().setAttribute("verified", "false");
			response.sendRedirect("index.jsp");
		}
	}

}
