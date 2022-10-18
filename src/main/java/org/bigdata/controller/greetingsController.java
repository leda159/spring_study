package org.bigdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*----------------------------------------------
1.@Controller선언 Viiew에서의 요청을 @GetMapping을 통해서 받는다
2.return값으로 보여질 페이지의 이름을 정함
3.@GetMapping을 사용해서 주소창에 입력할 URL을 설정한다.
4.model 받아오기 파라미터에 추가
5.model을 이용해서 변수등록
-----------------------------------------------*/
//컨트롤러라고 선언함
//hi라는 메소드가 greetings를 반환한다.
//리턴타입은 String으로 선언
//@GetMapping()에 접속할 URL 주소를 넣는다
//파라미터로 model을 받아서 변수를 등록한다
//model이라는 객체가 값을 담아서 userName이라는 이름으로 treetings에 리턴한다	
//views폴더안에 있는 greetings.jsp를 찾아서 화면어 보여준다

@Controller  
public class greetingsController {
	
	@GetMapping("/hi-")
	public String hi(Model model) {
		model.addAttribute("userName","고객");
		return"greetings";  
	}
	
	@GetMapping("/bye-")
	public String bye(Model model){
		model.addAttribute("userName","고객");
		return"goodbye";
	}
}







