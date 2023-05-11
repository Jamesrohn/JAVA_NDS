package Day10.Ex02_Lang;

import java.util.Iterator;

public class StringEx {

	public static void main(String[] args) {
		String str1 = " Human Edu Center ";
		String str2 = " Human Edu Center ";
		
		System.out.println(str1.charAt(2));			//index 에 있는 문자 추출
		System.out.println(str1.concat(str2));		//str1 + str2 문자열 연결
		System.out.println(str1.contains("Edu"));	//문자열 포함 여부 확인 (true/false)
		System.out.println(str1.equals(str2));		//문자열 일치 여부 확인 (true/false)
		System.out.println(str1.equalsIgnoreCase(str2));//대소문자 구분없이 문자열 일치 여부 확인(true/false)
		System.out.println(str1.indexOf("c"));			//해당 문자의 첫 index 반환, 없으면 -1
		System.out.println(str1.lastIndexOf("u"));		//해당 문자의 마지막 index 반환, 없으면 -1
		System.out.println(str1.trim());				//문자열 양쪽 공백 제거
		System.out.println(str1.length());				//문자열의 길이 (글자수)
		System.out.println(str1.substring(7));			//index 앞의 문자열을 자르고, 뒤의 문자열 반환
		System.out.println(str1.substring(7, 17));		//index ~ (index2-1)까지 반환
		System.out.println(str1.replace(" " ,"#"));		//replace("기존문자", "대체문자)
		System.out.println(str1.replaceAll(" " , "*"));	//replace와 같음
		System.out.println(str1.toUpperCase());			//모두 대문자로 변경
		System.out.println(str1.toLowerCase());			//모두 소문자로 변경

		//split( "구분자" )		: (구분자)를 기준으로 문자열을 잘라서 배열로 반환
		String[] sp = str1.split("");
		for (int i = 0; i < sp.length; i++) {
			System.out.println(i + "\t : " + sp[i]);
		}

	}
	
}
