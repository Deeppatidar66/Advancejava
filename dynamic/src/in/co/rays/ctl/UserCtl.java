package in.co.rays.ctl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet("/UserCtl")
public class UserCtl extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//     resp.setContentType("text/html");
		
		
resp.sendRedirect("UserRegistration.jsp");
	}
	@Override
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String op=req.getParameter("operation");
		
		if (op.equals("signUp")) {
		
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String loginId = req.getParameter("loginId");
		String password = req.getParameter("password");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");

		
		

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			UserBean bean = new UserBean();
			bean.setFirstName(firstName);
			bean.setLastName(lastName);
			bean.setLoginId(loginId);
			bean.setPassword(password);
			try {
				bean.setDob(sdf.parse(dob));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			bean.setAddress(address);

			UserModel model = new UserModel();
			try {
				bean = model.findByLogin(loginId);
				if (bean!=null) {
					req.setAttribute("msg", "user alredy exist...!!!");
					
				} else {
					
					model.add(bean);
					req.setAttribute("msg", "user registration succesfully");

				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(firstName);
			System.out.println(lastName);
			System.out.println(loginId);
			System.out.println(password);
			System.out.println(dob);
			System.out.println(address);
			
			req.setAttribute("msg","registration complet...!!!");
			
			RequestDispatcher rb = req.getRequestDispatcher("UserRegistration.jsp");
			
			rb.forward(req, resp);

			resp.sendRedirect("UserRegistration.jsp");
		}
		
		if(op.equals("Reset")) {
			resp.sendRedirect("UserRegistration.jsp");
		}
	}
	

}
