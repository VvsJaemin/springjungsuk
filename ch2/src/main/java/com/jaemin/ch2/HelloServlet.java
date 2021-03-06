package com.jaemin.ch2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

	// 서블릿이 초기화 될 때 자동 호출되는 메서드
	// 1. 서블릿의 초기화 작업 담당
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("HelloServlet init() is Called");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1. 입력
		// 2. 처리
		// 3. 출력

		System.out.println("HelloServlet service() is Called");
	}

	@Override
	public void destroy() {
		// 3. 뒷정리 - 서블릿이 메모리에서 제거될때 서블릿 컨테이너에 의해서 자동 호출sss
		System.out.println("HelloServlet destroy() is Called");
	}

}
