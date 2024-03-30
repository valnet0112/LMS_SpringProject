package kr.or.ddit.staff2.controller;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.ddit.enumpkg.ServiceResult;
import kr.or.ddit.staff2.service.ProfService;
import kr.or.ddit.vo.ProfVO;

@Controller
@RequestMapping("/staff/profInsert.do")
public class ProfInsertController {
	
	@Inject
	ProfService service;
	
	@ModelAttribute("Prof")
	public ProfVO prof() {
		return new ProfVO();
	}

	@GetMapping
	public String doGet() {
		return "staff/profAdd";
	}

	@PostMapping
	public String insertProf(
			@ModelAttribute("member") ProfVO prof
			, BindingResult errors
			, Model model
			){

		String logicalViewName = null;
		if (!errors.hasErrors()) {
			ServiceResult result = service.createProf(prof);
			String message = null;
			switch (result) {
			case OK:
				logicalViewName = "redirect:/"; // Post-Redirect-Get
				break;
			case FAIL:
				logicalViewName = "staff/profAdd";
				break;

			}

			model.addAttribute("message", message);
		} else {
			logicalViewName = "staff/profAdd";
		}

		return logicalViewName;
	}

	}

