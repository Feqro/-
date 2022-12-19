package com.example.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	//by 박은영
	//정규표현식: 영어/숫자만 입력 가능
	public String regexEngNum(String input) {
		Pattern p = Pattern.compile("^[a-zA-Z0-9]*$");

		Matcher m = p.matcher(input);
		
		//m.find(): 매치된 값이 있으면 true를, 없으면 false를 반환한다.
		//m.group(): 매치된 값을 반환한다.
		if(m.find() == true) {
			return input;
		}
		return null;
	}
	
	//by 박은영
	//정규표현식: 한글/영문만 입력 가능
	public String regexKorEng(String input) {
		
		Pattern p = Pattern.compile("^[a-zA-Z가-힣]*$");
		

		Matcher m = p.matcher(input);
		
		if(m.find() == true) {
			return input;
		}
		return null;
		
	}
	
	//by 박은영
	//정규표현식: 'admin' 또는 'ADMIN' 아이디로 회원가입 제한
	public String regexAdmin(String input) {
		
		Pattern p = Pattern.compile("^(?!)(admin)*$");
		Matcher m = p.matcher(input);
		
		if(m.find() == false) {
			return input;
		}
		
		return null;
	}
	
	//by 박은영
	//정규표현식: 전화번호 형식
	public String regexNum(String input) {
		
		Pattern p = Pattern.compile("^[0-9]*$");
		Matcher m = p.matcher(input);
		
		if(m.find() == true) {
			return input;
		}
		
		return null;
	}

	//by 박은영
	//정규표현식: 비밀번호 형식(영문,숫자,특수문자를 포함한 8-16자)
	public String regexPw(String input) {
		
		Pattern p = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,16}$");
		Matcher m = p.matcher(input);
		
		if(m.find() == true) {
			return input;
		}
		
		return null;
	}
	
	//by 박은영
	//정규표현식: 이메일 형식
	public String regexEmail(String input) {
		
		Pattern p = Pattern.compile("^[a-zA-Z0-9]{2,}@[a-zA-Z]{2,}\\.[a-zA-Z]{2,}$");
		Matcher m = p.matcher(input);
		
		if(m.find() == true) {
			return input;
		}
		
		return null;
	}


}
