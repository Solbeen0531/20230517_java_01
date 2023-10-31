package kh.sb.lclass.testcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

	
	@PostMapping("/index")
	public String resumeMgr() {

		return "/view/index";

	}
}
