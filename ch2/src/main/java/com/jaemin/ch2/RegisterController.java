package com.jaemin.ch2;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {

	@InitBinder
	public void toDate(WebDataBinder binder) {
		ConversionService conversionService = binder.getConversionService();
		/*
		 * SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		 * binder.registerCustomEditor(Date.class, new CustomDateEditor(df, false));
		 */
		binder.registerCustomEditor(String[].class, "hobby", new StringArrayPropertyEditor("#"));
//		binder.setValidator(new UserValidator());
		binder.addValidators(new UserValidator());
		List<Validator> validatorList = binder.getValidators();
		System.out.println("validatorList  = " + validatorList);
	}

	@RequestMapping(value = "/register/add", method = { RequestMethod.GET, RequestMethod.POST })
	public String register() {
		return "registerForm";
	}

//	@RequestMapping(value = "/register/save", method=RequestMethod.POST)
	@PostMapping("/register/save")
	public String save(@Valid User user, BindingResult result, Model model) throws Exception {

		System.out.println("result = " + result);
		System.out.println("user = " + user);
		// 수동검증 - Validator 직접 작성 및 호출
		/*
		 * UserValidator userValidator = new UserValidator();
		 * userValidator.validate(user, result);
		 */
		if (result.hasErrors()) {
			return "registerForm";
		}
		/*
		 * // 1. 유효성 검사 if (!isValid(user)) {
		 * 
		 * String msg = URLEncoder.encode("id를 잘못입력하셨습니다.", "utf-8");
		 * model.addAttribute("msg", msg); return "forward:/register/add"; // return
		 * "redirect:/register/add?msg="+msg; // URL 재작성(rewriting) }
		 */
		// 2. DB에 신규회원 정보를 저장

		return "registerInfo";
	}

	private boolean isValid(User user) {
		// TODO Auto-generated method stub
		return true;
	}

}
