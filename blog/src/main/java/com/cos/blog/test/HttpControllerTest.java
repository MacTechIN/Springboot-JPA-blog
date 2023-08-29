package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//사용자가 요청 -> 응답(HTML 파일) 을 만들려면 @Controller 라고 만듦 


// 어노테이션 @RestController)가 하는일 : 
// 사용자가 요청 -> 응답(Data) 
@RestController
public class HttpControllerTest {
	
	//http://localhost:8080/http/get(Select)
	@GetMapping("/http/get")
	public String getTest(Member m ) { //id=1 & username=sam&password=123&email=sam@nate.com 을 자동으로  Member 클레스에 m 에 넣어 주는 역활을 함. 
		return "get 요청 by user id : " + m.getId()+","+ m.getUserrname() + "," +m.getPassword()+","+m.getEmail(); 
	}
	
	//http://localhost:8080/http/post(Insert)
	@PostMapping("/http/post")
	public String postTest(@RequestBody String text) {
		return "post 요청 : " + text ; 
	}
	
	//http://localhost:8080/http/put(Update)
	@PutMapping("/http/put")
	public String putTest() {
		return "put 요청"; 
	}
	
	//http://localhost:8080/http/delete(Delete)
	@DeleteMapping("http/delete")
	public String deleteTest() {
		return "ㅇelete 요청"; 
	}
	

}
