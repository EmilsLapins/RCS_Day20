package lv.rigacoding.todo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		long time = System.currentTimeMillis();
		return "Hello! " + time;
	}
	
	
	@RequestMapping("/test")
	public lv.rigacoding.todo.ToDo ToDo() {
		long time = System.currentTimeMillis();
		return new ToDo(time, "Test to do" , true);
	}
	
}