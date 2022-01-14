package com.jaemin.ch2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.format.Printer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// ����� �Է� �� ���� �˸�
@Controller
public class YoilTeller {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@RequestMapping("/getYoil")
		public void main(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 1. �Է�
		String year = request.getParameter("year");
		String month= request.getParameter("month");
		String day = request.getParameter("day");
		
		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);
		
		// 2. �۾�
		Calendar cal = Calendar.getInstance();
		cal.set(yyyy, mm-1, dd);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		char yoil = " �Ͽ�ȭ�������".charAt(dayOfWeek);
		
		// 3. ���
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.println(year + "��" + month + "��" + day + "����");
		out.println(yoil + "�����Դϴ�");
	}

}