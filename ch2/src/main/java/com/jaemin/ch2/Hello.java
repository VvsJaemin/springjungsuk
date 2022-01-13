package com.jaemin.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller// 1. 원격 호출 가능한 프로그램으로 등록
public class Hello {
	int iv = 10; // 인스턴스 변수
	static int cv = 20; //static 변수
	
	// 2. URL과 메서드 연결(맵핑, mapping)
	@RequestMapping("/hello")
	private static void main() { // 인스턴스 메서드 - iv, cv 둘다 사용 가능
		System.out.println("Hello - static");
		System.out.println(cv);
//		System.out.println(iv);
	}
	
	public static void main2() { // static메서드 - cv만 사용 가능
		System.out.println(cv);
//		System.out.println(iv); // 에러
	}
}
