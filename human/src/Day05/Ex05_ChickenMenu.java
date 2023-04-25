package Day05;

import java.util.Scanner;

/*
    ######## 메뉴판 ########
    1. BBQ		- 황금 올리브 반반 치킨
    2. 교촌		- 허니 콤보 치킨
    3. 멕시카나	- 후라이드 치킨
    4. 굽네치킨	- 고추바사삭 치킨
    5. 지코바		- 숯불 양념 치킨
    0. 종료
    ######## 입력 :
    
    메뉴번호에 따라 메뉴 변수에 해당메뉴를 저장해 주고,
    "(해당메뉴)이 주문되었습니다." 라고 출력 하시오.
    0을 입력하기 전까지 반복하고,
    0을 입력하면 반복을 종료합니다.
    종료시, "?개의 주문을 완료합니다." 라고 출력하시오
    
 */

public class Ex05_ChickenMenu {

	//메소드 : 코드의 모음
	// - 메소드 정의
	// 접근지정자 (static) 반환 타입 메소드명(매개변수1, 매개변수2){실행문; }
	//* void - 반환할 값이 없음을 알려 주는 키워드
	//메뉴판 출력
	public static void printMenu() {
		//들여쓰기 : tab
		//내어 쓰기 : shift + tab
		//코드 정리 : ctrl + shift + tab
		System.out.println("######## 메뉴판 ########");
		System.out.println("1. BBQ		- 황금 올리브 반반 치킨");
		System.out.println("2. 교촌		- 허니 콤보 치킨");
		System.out.println("3. 멕시카나	- 후라이드 치킨");
		System.out.println("4. 굽네치킨	- 고추바사삭 치킨");
		System.out.println("5. 지코바		- 숯불 양념 치킨");
		System.out.println("0. 종료");
		System.out.print("######## 입력 :");	
	}
	//메뉴선택
	 public static String selectMenu(int menuNo) {
		 String menuName = "";
		 
		switch (menuNo) {
		case 1: menuName = "황금 올리브 반반 치킨";
				break;
		case 2: menuName = "허니 콤보 치킨";				
				break;
		case 3: menuName = "후라이드 치킨";				
				break;
		case 4: menuName = "고추바사삭 치킨";				
				break;
		case 5: menuName = "숯불 양념 치킨";				
				break;
		default:menuName = "(선택안함)";
				break;
		}	 
		 return menuName;
	 }

	public static void main(String[] args) {
		//변수 선언
		int menuNo = 0;			//메뉴번호
		String menuName = ""; 	//메뉴이름
		int count = 0;			//주문개수
		
		Scanner sc = new Scanner(System.in);
		
		do {
			// - 메소드 호출
			// 메소드 명 (인자1, 인자2);
			// 메뉴판 출력
			printMenu();
			
			//메뉴번호 입력
			menuNo = sc.nextInt();

			//종료 조건
			if(menuNo == 0) break;
			
			//메뉴 선택
			menuName = selectMenu(menuNo);
			
			// 유효성 검사
			// - 메뉴 번호는 0번 ~ 5번까지만 가능
			if (menuNo >= 0 && menuNo <=5) {
				System.out.println(menuName + "이 주문 되었습니다.\n");
				count++;
			}
			else {
				System.out.println("0~5번 사이의 정수를 입력해 주세요.");
			}
			
			
		} while (true);
		
		System.out.println(count + "개의 주문을 완료하였습니다.");
		
		sc.close();
		
	}
	
}
