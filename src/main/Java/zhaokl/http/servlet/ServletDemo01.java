package zhaokl.http.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

/**
 * author: zhaokl
 * <p>
 * created at: 08/11/2016 11:19
 * <p>
 * desc: 设置Location响应头, 实现请求重定向
 */
public class ServletDemo01 extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) {

		response.setStatus(302);

		response.setHeader("Location", "/JavaWeb_HttpProtocol/ServletDemo01.jsp");

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		doGet(request, response);

	}
}
