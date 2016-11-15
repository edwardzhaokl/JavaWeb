package zhaokl.servlet.context;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

/**
 * author: zhaokl
 * <p>
 * created at: 08/11/2016 11:19
 * <p>
 * desc: 设置content-type响应头，指定回送数据类型
 */
public class ServletContextDemo01 extends HttpServlet{

	private ServletConfig servletConfig;

	@Override
	public void init(ServletConfig servletConfig) {
		this.servletConfig = servletConfig;
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		String name = servletConfig.getInitParameter("name");
		response.getWriter().println(name);
		response.getWriter().println("<hr/>");

		Enumeration<String> e = servletConfig.getInitParameterNames();
		while (e.hasMoreElements()) {
			String key = e.nextElement();
			String value = servletConfig.getInitParameter(key);
			response.getWriter().println(key + " = " + value + "<hr/>");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		doGet(request, response);

	}
}
