package com.korea.mvc03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("member")
public class MemberController {

	/*
	 * RequestMapping의 값은 주소(URL)에서 사용된다 실제 폴더 구조를 의미하지 않음
	 */

	// 1. signUpPage.jsp 이동하기 (단순 이동)
	@RequestMapping("signUpPage")
	public String signUpPage() {
		
			// return 에서 실제 폴더와 파일명을 작성한다.

			return "member/signUpPage";	// return "/WEB-INF/views/member/signUpPage.jsp";
		}


}
