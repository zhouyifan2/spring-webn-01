package cn.com.zhou;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import cn.com.bean.Student;
import cn.com.service.StudentServiceImpl;

public class WelcomeServlet extends HttpServlet {
	/*private ApplicationContext ac;
	@Override
	public void init() throws ServletException {
		ServletContext application = this.getServletContext();
		ApplicationContext b=(ApplicationContext) application.getAttribute("spring");
		if(b==null){
			ac=new ClassPathXmlApplicationContext("applicationContext.xml");
			application.setAttribute("spring", ac);
		}else{
			ac=b;
		}
	}*/
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String score=req.getParameter("score");
		String str=WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
		ApplicationContext ac=(ApplicationContext) this.getServletContext().getAttribute(str);
		StudentServiceImpl service=(StudentServiceImpl) ac.getBean("studentService");
		service.getDao().insertStudent(new Student(name,Integer.valueOf(age),Double.valueOf(score)));
		req.getRequestDispatcher("/success.jsp").forward(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
