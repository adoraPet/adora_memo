package world.adorapet.memo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {
	
	@ResponseBody
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("/hellojsp")
	public String hellojsp() {
		return "hello";
	}
	

}