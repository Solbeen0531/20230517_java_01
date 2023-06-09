package kh.Lclass.vo;

public class TestVo {
	
	private int boardNum;
	private String boardWriter;
	private String boardTitle;
	private String boardContent;
	private String boardDate;
	
	// 생성자
//	public TestVo() {
//		
//	}
	public TestVo(int num) {
//		boardNum = num+1000;
		boardNum = (int)System.currentTimeMillis() + num;
	}
	
	public TestVo(int a,String writer) {
		this(a);
		// boardNum = a;
		boardWriter = writer;
	}
	
	// all arguments 생성자
	public TestVo(int boardNum, String boardWriter, String boardTitle, String boardContent, String boardDate) {
		this(boardNum,boardWriter);
//		this.boardNum = boardNum;
//		this.boardWriter = boardWriter;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardDate = boardDate;
	}
	
	// getter / setter
		
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter (String boardWriter) {
		this.boardWriter = boardWriter;
	}
	
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle (String boardTitle) {
		this.boardTitle = boardTitle;
	}
	
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent (String boardContent) {
		this.boardContent = boardContent;
	}
	
	public String getBoardDate () {
		return boardDate;
	}
	public void setBoardDate (String boardDate) {
		this.boardDate = boardDate;
	}

	
	// to String
	@Override
	public String toString() {
		return "TestVo [boardNum=" + boardNum + ", boardWriter=" + boardWriter + ", boardTitle=" + boardTitle
				+ ", boardContent=" + boardContent + ", boardDate=" + boardDate + "]";
	}
	
	
	
	
	
	
	
	
	
	
}

