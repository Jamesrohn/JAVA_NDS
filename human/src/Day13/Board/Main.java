package Day13.Board;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Day13.Board.DAO.BoardDAO;
import Day13.Board.DTO.Board;

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

	static Board board;							//게시글
	static List<Board> boardList;				//게시글 목록
	static Scanner sc = new Scanner(System.in);	//입력 객체 생성
	static BoardDAO dao = new BoardDAO();		//데이터 접근 객체 생성
	
	// 메뉴판 (기능)
	public static void menu() {
		System.out.println("############# 게시판 #############");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 읽기");
		System.out.println("3. 게시글 쓰기");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("############# 번호 입력 : ");
	}
	
	// 게시글 목록
	public static void list() {
		System.out.print("# 게시글 목록");
		boardList = dao.selectList();
		printAll();
	}


	// 게시글 읽기
		public static void read() {
			System.out.println("# 게시글 읽기");
			
			System.out.print("게시글 번호: ");
			int boardNo = sc.nextInt();
			sc.nextLine(); 
			
			//데이터 조회 요청
			board = dao.select(boardNo);
			
			//조회된 게시글 출력
			print(board);
			
			
		}
		
		// 게시글 쓰기
		public static void write() {
			System.out.println("# 게시글 쓰기");
			
			System.out.println("제목 : ");
			String title = sc.nextLine();

			System.out.println("작성자 : ");
			String writer = sc.nextLine();
			
			System.out.println("내용 : ");
			String content = sc.nextLine();
			
			board = new Board(title, writer, content);
			
			//데이터 추가 요청
			dao.insert(board);
			
			
		}
	// 게시글 수정
		public static void update() {
			System.out.println("# 게시글 수정");
			
			System.out.print("게시글 번호: ");
			int boardNo = sc.nextInt();
			sc.nextLine();
			
			System.out.println("제목 : ");
			String title = sc.nextLine();
	
			System.out.println("작성자 : ");
			String writer = sc.nextLine();
			
			System.out.println("내용 : ");
			String content = sc.nextLine();
			
			board = new Board(title, writer, content);
			board.setBoardNo(boardNo);
			
			//데이터 수정 요청
			dao.update(board);
			
		}
			// 게시글 삭제
		public static void delete() {
			System.out.println("# 게시글 삭제");
				
			System.out.print("게시글 번호: ");
			int boardNo = sc.nextInt();
			sc.nextLine();	
				
			//데이터 삭제 요청	
			dao.delete(boardNo);
		}

		//게시글 목록 전체 줄력 메소드
		private static void printAll() {
			
			if (boardList.isEmpty()) {
				System.out.println("존재하는 게시글이 없습니다.");
				return;
			}
			
			for (Board board : boardList) {
				print(board);
			}
		}
		//게시글 출력 메소드
		private static void print(Board board) {
			
			if (board == null) {
				System.out.println("(게시글 없음)");
				return;
			}

				System.out.println("[게시글 번호 : " + board.getBoardNo()+"]------------------");
				System.out.println("-제목 : " + board.getTitle());
				System.out.println("-작성자 : " + board.getWriter());
				System.out.println("-내용 : " + board.getContent());
				
				String dateFormat = "yyyy/MM/dd hh:mm:ss";
				SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
				Date reg_date = board.getRegDate();
				Date upd_date = board.getUpdDate();
				
				String regDate = sdf.format(reg_date);
				String updDate = sdf.format(upd_date);
				
				System.out.println("-등록일자 : " + regDate);
				System.out.println("-수정일자 : " + updDate);
				System.out.println("--------------------------------");
				
			}
		/**
		 * 게시판 프로그램 시작
		 * @param args
		 */
		
		public static void main(String[] args) {
			int menuNo = 0;			//메뉴번호
			int boardNo= 0;			//게시글 번호
			
			//메뉴판을 반복해서 출력
			do {
				menu();					//메뉴판 출력
				menuNo = sc.nextInt(); 	//메뉴번호 입력
				sc.nextLine(); 			//엔터를 입력버퍼에서 제거
				//프로그램 종료
				if(menuNo == 0) {
					System.out.println("프로그램을 종료합니다...");
					break;
				}
				
				//메뉴 선택
				switch (menuNo) {
				
						case 1: list();			//게시글 목록
								break;
						case 2: read(); 		//게시글 읽기
								break;
						case 3:	write();		//게시글 쓰기
								break;
						case 4: update();		//게시글 쓰기
								break;
						case 5: delete();		//게시글 삭제
								break;
						default:System.out.println("(0~5)사이의 숫자를 입력해 주세요");
								break;
				}
				
			}while (menuNo !=0);
			
		}
			
		
	}

