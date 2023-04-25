package Day06.Ex01_Board;

import java.util.Date;
import java.util.Scanner;

/**
 * 게시판 프로그램
 * - 메뉴판
 * - 게시글 목록
 * - 게시글 읽기
 * - 게시글 쓰기
 * - 게시글 수정
 * - 게시글 삭제
 *
 */
public class Main {

	static int max = 10; 		//게시글 최대 10개 제한
	static Board[] boardList = new Board[max];
	//static int index = 0; 		//현재 게시글 순서번호(0~max-1)
	static Scanner sc = new Scanner(System.in);
	// 메뉴판 (기능)
	public static void menu() {
		System.out.println("############# 게시판 #############");
		System.out.println("1. 게시판 목록");
		System.out.println("2. 게시판 읽기");
		System.out.println("3. 게시판 쓰기");
		System.out.println("4. 게시판 수정");
		System.out.println("5. 게시판 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.println("############# 번호 입력 : ");
	}
	
	// 게시글 목록
	public static void list() {
		System.out.print("#게시글 목록");
		for (Board board : boardList) {
			if (board == null) {
				System.out.println("(게시글 없음)");
			}
			else {
				System.out.println(board);
			}
		}
	}
	
	// 게시글 읽기
	public static void read(int boardNo) {
		System.out.print("# 게시글 읽기");
		Board board = boardList[boardNo-1];
		if(board == null) {
			System.out.println("게시글이 존재하지 않습니다.");
		}
		else {
		System.out.println(board);
		}
	}
	
	// 게시글 쓰기
	public static void write(Board board) {
		//현재 작성한 글 개수가 최대 제한 개수보다 작으면, 글 작성 가능
		int index =	getIndex(); 	//현재 사용 가능한 index
		if (index<max) {
			boardList[index] = board;
			board.setBoardNo(index+1);
			System.out.println("#게시글이 작성되었습니다.");
		}
	
		// 그렇지 않으면, 작성 불가
		else {
			System.out.println("#게시글 목록이 꽉 찼습니다.");
		}
	}
	// 게시글 수정
	public static void update(Board board) {
		int boardNo = board.getBoardNo();
		
		if (boardNo >=1 && boardNo <=max && boardList[boardNo-1]!=null) {
			//new Date() : 현재 날짜/시간 정보로 객체 생성
			String updatedTitle = board.getTitle();
			String updatedWriter = board.getWriter();
			String updatedContent = board.getContent();
			
			boardList[boardNo-1].setTitle(updatedTitle);
			boardList[boardNo-1].setWriter(updatedWriter);
			boardList[boardNo-1].setContent(updatedContent);
			boardList[boardNo-1].setUpdDate(new Date());

			System.out.println("#게시글이 수정되었습니다.");
		}
		else {
			System.out.println("#게시글이 존재하지 않습니다.");
		}
	}
	// 게시글 삭제
	public static void delete(int boardNo) {
		if(boardNo >=1 && boardNo <=max) {
			boardList[boardNo-1]=null;
			System.out.println("#게시글이 삭제되었습니다.");
		}
		else {
			System.out.println("#게시글이 존재하지 않습니다.");
		}
	}
	//게시글 정보 입력
	public static Board input() {
		System.out.print("제목: ");
		String title = sc.nextLine();

		System.out.print("작성자: ");
		String Writer = sc.nextLine();
		
		System.out.print("내용: ");
		String content = sc.nextLine();
		
		Board board = new Board(title,content,Writer);
		return board;
	}	
	
	//등록 가능한 index 구하기
	public static int getIndex() {
		int index = max;
		
		for (int i = 0; i < boardList.length; i++) {
			//비어 있는 게시글의 index
			if(boardList[i]==null) {
				index = i;
				break;
			}
			
		}
		
		return index;
	}
	
		public static void main(String[] args) {
			int menuNo = 0;
			int boardNo= 0;
			
			do {
				//메뉴판 출력
				menu();
				//메뉴번호 입력
				menuNo = sc.nextInt(); //3(엔터)
				sc.nextLine(); //엔터를 입력버퍼에서 제거
				
				switch (menuNo) {
				//게시글 목록
				case 1: list();
						break;
				//게시글 읽기
				case 2: 
					System.out.print("게시글 번호: ");
					boardNo = sc.nextInt();
					sc.nextLine(); //엔터를 입력버퍼에서 제거
					read(boardNo);
					break;
				//게시글 쓰기
				case 3:
						Board board = input();
						write(board);
						break;
				//게시글 수정
				case 4:
					System.out.print("수정할 게시글 번호 : ");
					boardNo = sc.nextInt();
					sc.nextLine(); //엔터를 입력버퍼에서 제거
					Board updatedBoard = input();
					updatedBoard.setBoardNo(boardNo);
					update(updatedBoard);
					break;
					
				case 5:
					System.out.print("삭제할 게시글 번호 : ");
					boardNo = sc.nextInt();
					sc.nextLine();
					delete(boardNo);
					
					
				default:
						break;
				}
				
			}while (menuNo !=0);
			
		}
			
		
	}

