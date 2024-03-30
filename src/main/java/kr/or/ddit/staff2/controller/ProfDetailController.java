package kr.or.ddit.staff2.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.ddit.staff2.service.ProfService;
import kr.or.ddit.vo.ProfVO;

@Controller
@RequestMapping("/staff/profDetail.do")
public class ProfDetailController {

	@Inject
	ProfService service;

	@GetMapping
	public String detail(Model model, @RequestParam("proNo") String proNo) {
		ProfVO profInfo = service.retrieveProf(proNo);
		model.addAttribute("profInfo", profInfo);

		return "staff/profDetail";
	}
}
