package zhaokl.servlet.config;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

/**
 * author: zhaokl
 * <p>
 * created at: 08/11/2016 11:19
 * <p>
 * desc: 设置content-type响应头，指定回送数据类型
 */
public class ServletConfigDemo01 extends HttpServlet{


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{


	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		doGet(request, response);

	}
}
