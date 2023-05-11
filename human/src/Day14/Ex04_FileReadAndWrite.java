package Day14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04_FileReadAndWrite {

	public static void main(String[] args) {
		//직접 입력한 문자를 텍스트 파일로 출력하는 프로그램
		//테스트 : 문자열을 입력하고 마지막에 Ctrl + z 단축키 입력(EOF)
		//EOF(End of File) : 파일의 끝을 알려 주는 키워드
		//System.in 객체를 이용하여 키보드로 부터 입력
		//test.txt 텍스트 파일에 입력한 문자열을 출력
		InputStreamReader is = new InputStreamReader(System.in);
		
		FileWriter fw = null;

		int data = 0;
				
		try {
			fw = new FileWriter("test3.txt");
			
			while ((data = is.read()) !=-1) {	//읽고
			fw.write(data);						//쓰고
				
			}
			is.close();
			fw.close();
			
		} catch (IOException e) {
			System.err.println("입출력시 , 예외가 발생하였습니다.");
			e.printStackTrace();
		}
	}
	
}
