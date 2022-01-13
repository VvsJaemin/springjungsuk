package com.jaemin.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller// 1. ���� ȣ�� ������ ���α׷����� ���
public class Hello {
	int iv = 10; // �ν��Ͻ� ����
	static int cv = 20; //static ����
	
	// 2. URL�� �޼��� ����(����, mapping)
	@RequestMapping("/hello")
	private static void main() { // �ν��Ͻ� �޼��� - iv, cv �Ѵ� ��� ����
		System.out.println("Hello - static");
		System.out.println(cv);
//		System.out.println(iv);
	}
	
	public static void main2() { // static�޼��� - cv�� ��� ����
		System.out.println(cv);
//		System.out.println(iv); // ����
	}
}
