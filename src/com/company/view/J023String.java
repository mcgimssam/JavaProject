package com.company.view;
// String Type
public class J023String {

	public static void main(String[] args) {
		// 큰따옴표 작은 따옴표 
		System.out.println("Hello World"); // String =>Chacter들이 모여 있는것 = 문자열 
		System.out.println('H'); // 특수한 Data Type임 Character(한글자를 표현하는것 )=>안씀 = 문자 
		System.out.println("'H'");
		
		// 줄바꿈 
//		System.out.println("Hello 
//				 World"); // 개행하면 에러남 
//	}
		System.out.println("Hello "
				+ "World"); // 줄바꿈은 아니고 그냥 문자열 결함임 
		// new line => 줄바꿈 됨 
		System.out.println("Hello \nWorld");
		// Hello "World"
//		System.out.println("Hello "World""); // 에러발생 "겹침으로 일반 "임을 알려줘야함 
		System.out.println("Hello \"World\""); // escape(회피문자)  \ = 뒤에 오는 문자열은 무시

	}
}
