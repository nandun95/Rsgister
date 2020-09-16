package com.register.test.nsc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RegisterDao registerDao = new RegisterDao();
       
   
    public RegisterServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String contactNo = request.getParameter("contactNo");
		
		RegisterBean registerBean = new RegisterBean();
		registerBean.setFirstName(firstName);
		registerBean.setLastName(lastName);
		registerBean.setEmail(email);
		registerBean.setPassword(password);
		registerBean.setContactNo(contactNo);
		
		try {
			registerDao.Ragistration(registerBean);
			
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
			
		}
		response.sendRedirect("succes.jsp");
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	}

}
