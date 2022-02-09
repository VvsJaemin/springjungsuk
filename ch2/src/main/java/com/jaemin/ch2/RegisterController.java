package com.jaemin.ch2;

import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {
	
//	@RequestMapping("/register/add")
//	public String register() {
//		return "registerForm";
//	}
	
//	@RequestMapping(value = "/register/save", method=RequestMethod.POST)
	@PostMapping("/register/save")
	public String save(User user, Model model) throws Exception {
		//1. ��ȿ�� �˻�
		if(!isValid(user)) {
		
			String msg = URLEncoder.encode("id�� �߸��Է��ϼ̽��ϴ�.", "utf-8");
//			model.addAttribute("msg", msg);
//			return "redirect:/register/add";
			return "redirect:/register/add?msg="+msg; // URL ���ۼ�(rewriting)
		}
		//2. DB�� �ű�ȸ�� ������ ����
		

		return "registerInfo";
	}

	private boolean isValid(User user) {
		// TODO Auto-generated method stub
		return true;
	}

}
