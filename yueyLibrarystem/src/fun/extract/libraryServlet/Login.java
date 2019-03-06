package fun.extract.libraryServlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.faces.context.ResponseWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.mysql.fabric.Response;
import com.sun.xml.internal.fastinfoset.sax.Properties;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

import fun.extract.libraryDao.UserDaoImpl;
import fun.extract.libraryService.UserService;

public class Login extends HttpServlet {
//	@Autowired
//	private UserDAO userDAO;
	
	@Autowired
	private UserService userServiceImpl;
	private static final long serialVersionUID = 1L;


	/**
	 * Constructor of the object.
	 */
	public Login() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int user_id = Integer.parseInt(request.getParameter("username").trim());
		String user_password = request.getParameter("password");
        System.out.println(user_id+"\n"+user_password);
//        PrintWriter out = response.getWriter();
//        out.println();
//        userDAO.checkUserBF(user_id, user_password);
        
//        userDAO.checkUserBF(1613240105, "123456");
//        userServiceImpl.checkUserBF(1613240105, "123456");
//        Boolean BF =
//        		userDAO.checkUserBF(user_id, user_password);   
//        System.out.println(userDAO);
//        System.out.println(BF);
//        response.setContentType("text/html");
	}


	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
//	private UserDAO userDAO;      
    public void init() throws ServletException {  
//        ServletContext servletContext = this.getServletContext();  
//        
//        ApplicationContext ac = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
//  		ac.getBean("userDAO"); 
	}

}