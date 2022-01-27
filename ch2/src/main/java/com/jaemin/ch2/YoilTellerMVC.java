package com.jaemin.ch2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.format.Printer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// ����� �Է� �� ���� �˸�
@Controller
public class YoilTellerMVC {

//	public static void main(String[] args) {
	// TODO Auto-generated method stub
	@RequestMapping("/getYoilMVC")
//		public void main(HttpServletRequest request, HttpServletResponse response) throws IOException {
	public ModelAndView main(int year, int month, int day) throws IOException {
		
		ModelAndView mv = new ModelAndView();

//		if (!isValid(year, month, day)) {
//			return "yoilError";
//		}
		// ���� ���
		char yoil = getYoil(year, month, day);

		// ����� ����� model�� ����
		mv.addObject("year", year);
		mv.addObject("month", month);
		mv.addObject("day", day);
		
		
		// ����� ������ view�� ����.
		mv.setViewName("yoil");
		
		return mv;

	}

	private boolean isValid(int year, int month, int day) {
		return true;
	}

	private char getYoil(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day);

		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		return " �Ͽ�ȭ�������".charAt(dayOfWeek);
	}

}