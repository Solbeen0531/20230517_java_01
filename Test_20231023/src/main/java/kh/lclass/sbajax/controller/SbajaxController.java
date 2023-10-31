package kh.lclass.sbajax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kh.lclass.sbajax.model.service.SbajaxService;

@Controller
public class SbajaxController {

	@Autowired
	private SbajaxService sbajaxService;

	// 아이디 중복체크
	@PostMapping("/idCheck")
	@ResponseBody
	public int idCheck(@RequestParam("id") String id) {

		int cnt = sbajaxService.idCheck(id);
		return cnt;

	}
	
	@GetMapping("/index")
	public String home() {
		return "practice/index";
	}
}
