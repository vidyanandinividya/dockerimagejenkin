package fsd.week10.DockerImageJenkin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello to my Docker Webservice";
	}
	@GetMapping("/")
	public String index()
	{
		return "Welcome to my Index page";
	}
	

}
