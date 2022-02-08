package com.jaemin.ch2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.format.Printer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// 년월일 입력 시 요일 알림
@Controller
public class YoilTellerMVC6 {

	@ExceptionHandler(Exception.class)
	public String catcher(Exception e, BindingResult result) {
		System.out.println("result = " + result);
		
		FieldError error = result.getFieldError();
		System.out.println("code = " + error.getCode());
		System.out.println("field = " + error.getField());
		System.out.println("msg = " + error.getDefaultMessage());
		e.printStackTrace();
		return "yoilError";
	}

	@RequestMapping("/getYoilMVC6") //@ModelAttribute는 생략 가능
	public String main(MyDate date, BindingResult result) throws IOException {
		System.out.println("result = " + result);
		if (!isValid(date)) {
			return "yoilError";
		}
//		// 요일 계산
//		char yoil = getYoil(date);

		// 계산한 결과를 model에 저장
//		model.addAttribute("myDate", date);
//		model.addAttribute("yoil", yoil);

		return "yoil";

	}

	private boolean isValid(MyDate date) {
		return isValid(date.getYear(), date.getMonth(), date.getDay());
	}

	private @ModelAttribute("yoil") char getYoil(MyDate date) {
		return getYoil(date.getYear(), date.getMonth(), date.getDay());
	}

	private boolean isValid(int year, int month, int day) {
		return true;
	}

	private char getYoil(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day);

		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		return " 일월화수목금토".charAt(dayOfWeek);
	}

}