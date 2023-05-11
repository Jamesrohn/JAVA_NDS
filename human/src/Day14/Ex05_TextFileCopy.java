package Day14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05_TextFileCopy {

	public static void main(String[] args) {
		//test.txt 파일을 test4.txt 파일로 복사
		FileReader fr = null;
		FileWriter fw = null;
		
		int data = 0;
		
		try {
			fr = new FileReader("test.txt");
			fw = new FileWriter("test4.txt");
			
			while ((data = fr.read())!=-1) {
				fw.write(data);				
			}
			System.out.println("test.txt -> test4.txt 파일을 복사하였습니다.");
			fr.close();
			fw.close();
						
		} catch (FileNotFoundException e) {
			System.err.println("파일이 존재 하지 않습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("입출력시, 예외가 발생하였습니다.");
			e.printStackTrace();
		}
		
	}
	
}
