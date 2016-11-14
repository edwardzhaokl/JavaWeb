package zhaokl.http.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.zip.*;

/**
 * author: zhaokl
 * <p>
 * created at: 08/11/2016 11:19
 * <p>
 * desc: 设置Location响应头, 实现请求重定向
 */
public class ServletDemo02 extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		String data = "abcdefghijklmnopqrstuvwxyz" +
				"abcdefghijklmnopqrstuvwxyz" +
				"abcdefghijklmnopqrstuvwxyz" +
				"abcdefghijklmnopqrstuvwxyz" +
				"abcdefghijklmnopqrstuvwxyz" +
				"abcdefghijklmnopqrstuvwxyz" +
				"abcdefghijklmnopqrstuvwxyz" +
				"abcdefghijklmnopqrstuvwxyz" +
				"abcdefghijklmnopqrstuvwxyz" +
				"abcdefghijklmnopqrstuvwxyz";
		System.out.println("original data size is: " + data.getBytes().length);

		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		GZIPOutputStream gzipOutputStream = new GZIPOutputStream(byteArrayOutputStream);
		gzipOutputStream.write(data.getBytes());
		gzipOutputStream.close();

		// 得到压缩后的数据
		byte[] gzip = byteArrayOutputStream.toByteArray();
		response.setHeader("Content_Encoding", "gzip");
		response.setHeader("content_Length", gzip.length + "");
		response.getOutputStream().write(gzip);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		doGet(request, response);

	}
}
