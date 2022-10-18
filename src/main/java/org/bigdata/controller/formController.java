package org.bigdata.controller;

import org.bigdata.dto.Form;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class formController {

	@Autowired //스프링이 미리 생성해놓은 객체를 가져다가 자동 연결함
	
	//주소에 formTest입력하면 formTest.jsp를 보여준다
	@GetMapping("formTest")
	public String fomControllerTest() {
		
		return"formTest";
	}
	

//view -> Controller -> @PostMapping의 URL주소 -> DTO객체(Form form)에 담겨짐
	
//form 데이터값을 받아서 Controller 넣기	
	// 1 View(form)화면에서 입력한다	
	// 2 View에서 Controller로 온다 
	//	2-1 post방식으로 @PostMapping("formActions")으로 값이 던져진다
	//  2-2 View에서 보낸 데이터를 받아올려면 파라미터로 DTO에 넣어줘야 한다
	//	2-3 View에서 보낸 데이터는 dto패키지에 있는 From 클래스 타입으로 
	//	    파라미터 form으로 선언된 메소드로 들어간다 
	
	
//DB에 넣기
	//Db는 java 언어를 읽을수 없으므로 JPA를 이용해서 DB가 읽을 수 있도록 변환
	//Entity : java객체를 DB가 이해 할수있게 규격화 된 데이터
	//Repository : Entity는 Repository를 이용해서 DB로 데이터를 전달한다
	
	@PostMapping("formActions")
	public String formAction(Form form) {
		System.out.println(form.toString());
		
		//1. DB에 담기위해선 Dto를 Entity로 변환
		// jpa 사용
		
		//2. Repository에게 Entity를 DB안에 저장하게 함
		
		return"";
	}
}





