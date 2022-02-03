package com.jaemin.ch2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

	// ������ �ʱ�ȭ �� �� �ڵ� ȣ��Ǵ� �޼���
	// 1. ������ �ʱ�ȭ �۾� ���
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("HelloServlet init() is Called");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1. �Է�
		// 2. ó��
		// 3. ���

		System.out.println("HelloServlet service() is Called");
	}

	@Override
	public void destroy() {
		// 3. ������  - ������ �޸𸮿��� ���ŵɶ� ���� �����̳ʿ� ���ؼ� �ڵ� ȣ��

		System.out.println("HelloServlet destroy() is Called");
	}

	
}
