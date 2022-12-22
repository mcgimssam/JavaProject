package com.company.view;
// 자료형 정리 클래스 
// 데이터 타입마다 연산할수 있는 연산이 다르기때문에 데이터 타입을 공부해야 한다 
// 자바는 여러가지 데이터 타입이 존재| 아래 2개가 핵심중 하나 
public class J021Datatype {

	public static void main(String[] args) {
		// 숫자형 Numbyer
		System.out.println(6);
		// 문자형 String
		System.out.println("six");
		// String 6 => ""안에 쓰면 문자열 =>쓰는 이유는 데이터 타입마다 연산할수 있는 연산이 다르기때
		System.out.println("6");
		// 연산 예시 
		System.out.println(6 + 6); //12 => 사칙연산 
		System.out.println("6" + 6); //66 => 문자열 결합 
//		System.out.println("6" * "6"); // Error 발생 | 문자열은 *연산이 안됨 
		
		System.out.println("1111".length()); // 문자열 길이 연산 
//		System.out.println(1111.length());  // Error 발생 | 숫자형은 길이 연산이 안됨 
	}

}
