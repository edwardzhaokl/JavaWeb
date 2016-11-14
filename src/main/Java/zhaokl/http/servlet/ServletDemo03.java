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
public class ServletDemo03 extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		response.setHeader("content-type", "image/jpeg");

		InputStream inputStream = this.getServletContext().getResourceAsStream("/img/JackMa.jpeg");

		byte[] buffer = new byte[1024];
		int length = 0;

		OutputStream outputStream = response.getOutputStream();
		while ((length = inputStream.read(buffer)) > 0 ) {
			outputStream.write(buffer, 0, length);
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		doGet(request, response);

	}
}
