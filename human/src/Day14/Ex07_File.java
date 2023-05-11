package Day14;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex07_File {

	public static void menu() {
		System.out.println("############ 파일관리 ############");
		System.out.println("1. 디렉토리 생성");
		System.out.println("2. 파일 생성");
		System.out.println("3. 디렉토리 파일 목록");
		System.out.println("4. 파일 정보 조회");
		System.out.println("5. 파일 삭제");
		System.out.println("6. 폴더 삭제");
		System.out.println("0. 종료");
		System.out.println("############ 번호 :");
	}
/**
 * 디렉토리를 생성하는 메소드
 * @param args
 */
	public static void makeDirectory (String filePath) {
		File file = new File(filePath);
		//폴터 생성 메소드
		//mkdir() : 생성할 경로의 상위 경로까지 기존 디렉토리가 존재해야 한다.
		//mkdirs() : 생성할 경로의 상위 경로까지 디렉토리를 생성해 준다.
		if (file.mkdir()) {
			System.out.println("디렉토리 생성 성공!");
		}
		else {
			System.out.println("디렉토리 생성 실패!");
		}
		System.out.println("경로 : " + filePath);
	}
	/**
	 * 파일 생성 메소드
	 * @param filePath
	 */
	private static void makeFile(String filePath) {
		File file = new File(filePath);
		
		try {
			if (file.createNewFile()) {
				System.out.println("파일 생성 성공!");
			}
			else {
				System.err.println("파일 생성 실패!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("파일 : " + filePath);
	}
	
	/**
	 * 디렉토리의 파일 목록을 가져오는 메소드
	 * @param args
	 */
	
	public static File[] fileList(String filePath){
		
		System.out.println(filePath);
		System.out.println("----------------------------------------------------------");
		File file = new File(filePath);
		File[] fileList = file.listFiles();	//하위 경로의 있는 파일 목록
		
		for (File subFile : fileList) {
			long update = subFile.lastModified();	//수정일자
			Date date = new Date(update);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String updateDate = sdf.format(date);
			
			System.out.print( subFile.getName() + " \t\t");	//파일명
			System.out.print( subFile.length() + " \t\t");	//파일크기
			System.out.print(updateDate + " \t\t");			//수정일자
			System.out.println();
			
		}
		System.out.println("----------------------------------------------------------");
		
		return fileList;	
	}
	/**
	 * 파일 정보 조회 메소드
	 * @param filePath
	 */
	public static void fileInfo(String filePath) {
		File file = new File(filePath);
		System.out.print("파일 종류 : ");
		if (file.isDirectory()) System.out.println("디렉토리");
		if (file.isFile()) System.out.println("일반 파일");
		
		System.out.println("파일명 : \t\t" +file.getName());
		System.out.println("파일명 : \t" +file.length());
		
			long update = file.lastModified();	//수정일자
			Date date = new Date(update);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String updateDate = sdf.format(date);
			{
					
		}
	}
	
	/**
	 * 파일 삭제 메소드
	 * @param args
	 */
	public static void deleteFile (String filePath) {
		
		File file = new File (filePath);
		
		//파일 존재 여부 확인
		if (file.exists()) {
			//delete() : 파일 삭제 성공(true), 실패 (false)
			//* 하위 경로에 파일이 존재하면 삭제가 되지 않는다.
			if (file.delete()) {
				System.out.println("파일 삭제 성공!");
			}
			else {
				System.out.println("파일 삭제 실패!");
			}
			
		}
		else {
			System.err.println("파일이 존재 하지 않습니다.");
		}
	}
	/**
	 * 폴더를 삭제하는 메소드
	 * @param filePath
	 */	
	public static void deleteDirectory(String filePath) {
		File file = new File(filePath);
		File[] subFiles = file.listFiles();
		
		//하위 경로에 파일이 있으면
		if (subFiles != null) {
			//하위 경로의 파일들을 삭제
			for (File subFile : subFiles) {
				//재귀함수
				deleteDirectory(subFile.getPath());
			}			
		}
		//폴더 삭제
		if (file.delete()) {
			System.out.println("폴더 삭제 성공!");
		}else {
			System.err.println("폴더 삭제 실패!");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int manuNo;
		
		do {
			menu();
			manuNo = sc.nextInt();
			sc.nextLine();
			
			if (manuNo == 0)break ;
			
			System.out.print("파일 경로 : ");
			String filePath = sc.nextLine();
			
			
			switch (manuNo) {
			case 1:
					//디렉토리 생성 - 입력 : 디렉토리 경로
				 makeDirectory(filePath);
				break;
			case 2:
				//디렉토리 생성 - 입력 : 디렉토리 경로
				makeFile(filePath);
			break;	
			case 3:
					//디렉토리 파일목록 - 입력 : 디렉토리 경로
				 fileList(filePath);
				break;
			case 4:
					//파일 정보 조회 - 입력 : 파일 경로
				 fileInfo(filePath);
				break;
			case 5:
				//파일 삭제 - 입력 : 파일 경로
				deleteFile(filePath);
				break;
			case 6:
				//파일 삭제 - 입력 : 파일 경로
				deleteDirectory(filePath);
				break;

			default:
				break;
			}
							
			
		} while (true);
	}

	
}
