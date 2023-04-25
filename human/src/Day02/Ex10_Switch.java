package Day02;

import java.util.Scanner;

public class Ex10_Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("채널을 선택하세요 : ");
		int channel = sc.nextInt();
		
		//Switch : ctrl + space
		switch (channel) {
		case 1: System.out.println("넷플릭스");
				break;
		case 2: System.out.println("디즈니플러스");
				break;
		case 3: System.out.println("쿠팡플레이");
				break;
		case 5: System.out.println("모범택시2");
				break;
		case 27: System.out.println("(Mnet)");
				break;
		case 11: System.out.println("나혼자산다");
				break;
		case 28: System.out.println("나는솔로");
				break;
		default:
				System.out.println("유효한 채널번호를 입력해 주세요");
				break;
				
		}
		
		sc.close();
		
		
	}
	
}
