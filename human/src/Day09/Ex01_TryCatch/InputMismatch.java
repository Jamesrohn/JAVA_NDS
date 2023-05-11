package Day09.Ex01_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menuName = "";
		int menuNo = 0;
		
		do {
				System.out.println("1. Java");
				System.out.println("2. Html");
				System.out.println("3. css");
				System.out.println("4. JavaScript");
				System.out.println("0. 종료");
				System.out.println("메뉴 입력:");
				
			// 예외 메세지 :java.util.InputMismatchException
				
			//try - catch 예외처리문 작성
			try {
				menuNo = sc.nextInt();	//예외 발생 가능성 있는 문장			
			}catch (InputMismatchException e) {
				sc.next();
				System.err.print("(0~4) 사이의 정수를 입력해 주세요");
				continue;
			}
			
			//종료 조건
			if (menuNo == 0) break;
			
			switch (menuNo) {
			case 1: menuName = "Java"; break;
			case 2: menuName = "Html"; break;
			case 3: menuName = "Css"; break;
			case 4: menuName = "JavaScript"; break;
			default: menuName = "선택없음";break;
			}
			System.out.println(menuName + "(을/를) 공부합니다.");
		} while (true);
	}
	
}
