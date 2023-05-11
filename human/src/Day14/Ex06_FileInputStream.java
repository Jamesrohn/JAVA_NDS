package Day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex06_FileInputStream {

	public static void main(String[] args) {
		byte[] data = new byte[100];
		
		FileInputStream fin;
		try {
			fin = new FileInputStream("test.out");
		
			int i = 0, b;
			while ((b = fin.read()) !=-1) {
				data[i] = (byte) b; //읽어온 바이트 b(int)를 byte 배열에 형변환하여 대입
				i++;
				
			}
			for (byte a : data) {
				System.out.print((char) a);
			}
			System.out.println();
			fin.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

