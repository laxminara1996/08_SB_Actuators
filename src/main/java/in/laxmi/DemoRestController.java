package in.laxmi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	@GetMapping("/")
	public String getMsg() {
		return "welcome Rest Api's";
	}
}
