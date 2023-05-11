package Day13.Board.DTO;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor 	//기본 생성자 자동으로 만들어 주는 
@Data
public class Board {

	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private Date updDate;
	
	public Board(String title,String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
}
