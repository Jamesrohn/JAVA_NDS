package Day01;

import java.util.Scanner;

//import : 외부에서 정의된 클래스 파일을 포함하는 키워드
//-import 패지키.ㅣ 클래스명;
//*자동  import  하는 방법
// 1. 클래스명| <--여기에 커서를 두고 ctrl +space
// 2. 다중 import : ctrl +shift + O

/**
 * 반지름을 입력 받아, 원의 넓이를 구하는 프로그램
 * @author User
 *
 */

public class Ex07_Circle {

	public static void main(String[] args) {
		//상수
		// - 프로그램 실행 동안 값을 변경하지 않고 사용할 값
		// * 상수 선언시, 반드시 값을 초기화 해야 한다.
		// * 선언 후에 값을 변경하면 에러가 발생한다.
		// - 키워드 : final
		final double PI = 3.141592;
		//(에러) PI = 3.14; 		- 상수는 값 변경 불가
		Scanner sc = new Scanner(System.in);
		//바로 엔터 : shift + enter
		System.out.print("반지름 : ");
		double radius = sc.nextDouble();
		double area = PI * radius * radius;
		
		System.out.println("원의 넓이 : " + area);
		sc.close();
	}
	
}
