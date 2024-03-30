package kr.or.ddit.staff2.controller;

import java.security.Principal;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.ddit.enumpkg.ServiceResult;
import kr.or.ddit.staff2.service.ProfService;
import kr.or.ddit.vo.ProfVO;

@Controller
@RequestMapping("/staff/profMod.do")
public class ProfChangeController {
	@Inject
	private ProfService service;

	@GetMapping
	public String formUI(Model model, @RequestParam("proNo") String proNo) {
		ProfVO profInfo = service.retrieveProf(proNo);
		model.addAttribute("profInfo", profInfo);
		return "staff/profMod";
	}

	@PostMapping
	public String changeProf(@ModelAttribute("prof") ProfVO prof, BindingResult errors, Principal principal,
			Model model) {

		prof.setProNo(principal.getName());

		String logicalViewName = null;

		if (!errors.hasErrors()) {
			ServiceResult result = service.modifyProf(prof);
			String message = null;
			switch (result) {
			case INVALIDPASSWORD:
				logicalViewName = "staff/profMod";
				message = "인증 실패";
				break;
			case OK:
				logicalViewName = "redirect:/prodList";
				break;

			default:
				logicalViewName = "staff/profMod";
				message = "서버 오류";
				break;
			}

			model.addAttribute("message", message);
		} else {
			logicalViewName = "staff/profMod";
		}

		return logicalViewName;
	}
}
