package Day13.Board.DAO;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import Day13.JDBConnection;
import Day13.Board.DTO.Board;

public class BoardDAO extends JDBConnection {

	//데이터 목록 조회
	public List<Board> selectList() {
		
		LinkedList<Board> boardList = new LinkedList<>();
		
		//SQL
		String sql = " SELECT * "
					+ " FROM board ";
		try {
			
			stmt = con.createStatement();	//쿼리 실행 객체 생성
			rs = stmt.executeQuery(sql);	//쿼리 실행

			//조회 결과를 리스트에 추가
			while (rs.next()) {
				Board board = new Board();
				//결과 데이터 가져오기
				//rs.getXXX("컬럼명") --> 해당컬럼의 데이터를 가져온다.
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getTimestamp("reg_date"));
				board.setUpdDate(rs.getTimestamp("upd_date"));
				
				boardList.add(board);
			}
			
		} catch (SQLException e) {
			System.err.println("게시글 목록 조회시, 예외 발생");
			e.printStackTrace();
		}
		return boardList;
	}
	//데이터 조회
	public Board select(int boardNo) {
		
		Board board = new Board();
		
		//SQL
		String sql = " SELECT * "
					+ " FROM board "
					+ " WHERE board_no = ? ";
		try {
			
			psmt = con.prepareStatement(sql);	//쿼리 실행 객체 생성
			//psmt.setXXX( ?순서번호, 매핑할 값 );
			psmt.setInt(1, boardNo); 			//?(1) <--boardNo(글번호)
			rs = psmt.executeQuery();			//쿼리 실행
			
			//조회 결과 가져오기
			if ( rs.next() ) {
				//결과 데이터 가져오기
				//rs.getXXX("컬럼명") --> 해당컬럼의 데이터를 가져온다.
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getTimestamp("reg_date"));
				board.setUpdDate(rs.getTimestamp("upd_date"));
				
			}
			else {
				System.out.println(boardNo + " 번 게시글이 존재하지 않습니다.");
				board = null;
			}
			
			
		} catch (SQLException e) {
			System.err.println("게시글 조회시, 예외 발생");
			e.printStackTrace();
		}
		return board;
	}
	
	//데이터 등록
	public int insert (Board board) {
		
		int result = 0;
		
		String sql = " INSERT INTO board (title, writer, content)"
				   + " VALUES( ?, ?, ?)";
		
		try {
			psmt = con.prepareStatement(sql);		//쿼리 실행 객체 생성
			psmt.setString(1, board.getTitle()); 	//1번 ? 에 제목을 매핑
			psmt.setString(2, board.getWriter()); 	//2번 ? 에 제목을 매핑
			psmt.setString(3, board.getContent()); 	//3번 ? 에 제목을 매핑
			
			result = psmt.executeUpdate();		//SQL 실행 요청, 적용된 데이터 개수 받아옴
												//게시글 1개 쓰기 성공시, result : 1
												//			  실패시, result : 0
		} catch (Exception e) {
			System.err.println("게시글 등록 시, 예외 발생");
			e.printStackTrace();
			
		}
		
		//등록 성공
		if( result > 0) {
			System.out.println("\"" + board.getTitle() + "\" 게시글이 작성되었습니다.");
		}
		//등록 실패
		else {
			System.out.println("게시글 등록에 실패 하였습니다.");
		}
		
		return result;
		
	}
	//데이터 등록 끝
	public int update(Board board) {
		
		int result = 0;
		
		String sql = " UPDATE board"
				   + " SET title = ? "
				   + "  , writer = ? "
				   + "  , content = ? "
				   + "  , upd_date = now() "
				   + " WHERE board_no = ? "
				   ;
		//- now() : 현재 날짜 / 시간을 반환하는 mysql 함수
				   
		try {
			psmt = con.prepareStatement(sql);		//쿼리 실행 객체 생성
			psmt.setString(1, board.getTitle()); 	//1번 ? 에 제목을 매핑
			psmt.setString(2, board.getWriter()); 	//2번 ? 에 작성자를 매핑
			psmt.setString(3, board.getContent()); 	//3번 ? 에 내용을 매핑
			psmt.setInt(4, board.getBoardNo());		//4번 ? 에 글번호를 매핑
			
			result = psmt.executeUpdate();		//SQL 실행 요청, 적용된 데이터 개수 받아옴
												//게시글 1개 쓰기 성공시, result : 1
												//			  실패시, result : 0
		} catch (Exception e) {
			System.err.println("게시글 수정 시, 예외 발생");
			e.printStackTrace();
			
		}
		
		//수정 성공
		if( result > 0) {
			System.out.println("\"" + board.getTitle() + "\" 게시글이 수정되었습니다.");
		}
		//수정 실패
		else {
			System.out.println("게시글 수정에 실패 하였습니다.");
		}
		
		return result;
		
	}//데이터 수정 끝
	public int delete(int boardNo) {
	
	int result = 0;
	
	String sql = " DELETE FROM board "
			   + " WHERE board_no = ? "
			   ;
	//- now() : 현재 날짜 / 시간을 반환하는 mysql 함수
			   
	try {
		psmt = con.prepareStatement(sql);		//쿼리 실행 객체 생성
		psmt.setInt(1, boardNo);				//1번 ? 에 글번호를 매핑
		
		result = psmt.executeUpdate();		//SQL 실행 요청, 적용된 데이터 개수 받아옴
											//게시글 1개 쓰기 성공시, result : 1
											//			  실패시, result : 0
	} catch (Exception e) {
		System.err.println("게시글 삭제 시, 예외 발생");
		e.printStackTrace();
		
	}
	
	//삭제 성공
	if( result > 0) {
		System.out.println("게시글이 삭제되었습니다.");
	}
	//삭제 실패
	else {
		System.out.println("게시글 삭제에 실패 하였습니다.");
	}
	
	return result;
	
	}//데이터 삭제 끝
}








