package org.bigdata.dto;


public class Form {

	//두개의 데이터를 던졌으니 두개의 필드가 있어야함
	
	private String title;
	private String content;
	
	//생성자 추가
	public Form(String title, String content) {
		this.title = title;
		this.content = content;
	}

	//데이터가 잘 받아졌는지 확인하기 위해 toString()메소드 작성
	@Override
	public String toString() {
		return "Form [title=" + title + ", content=" + content + "]";
	}
	
	
}
