package Day14;

import java.io.FileWriter;
import java.io.IOException;

public class Ex03_FileWriter {

	public static void main(String[] args) {
		FileWriter fw = null;
		String str = "텍스트 파일 출력 메시지";
		
		try {
			//파일명 test2.txt로 출력 스트림 객체 생성
			fw = new FileWriter("test2.txt");
			//문자열 str을 index 0 ~ 끝까지 출력
			fw .write(str, 0 , str.length());
			//자원 해제
			fw.close();
			
		} catch (IOException e) {
			System.err.println("입출력시 , 예외가 발생하였습니다.");
			e.printStackTrace();
		}
	}
	
}
