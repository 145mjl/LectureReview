package listInterface.Vector;

import java.util.List;
import java.util.Vector;

class Board{
	String subject;
	String content;
	
	public Board(String subject,String content) {
		this.subject=subject;
		this.content=content;
	}
}
public class PrintVector {
	public static void main(String[] args) {
		List<Board> list=new Vector<Board>();
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목2","내용2"));
		list.add(new Board("제목3","내용3"));
		list.add(new Board("제목4","내용4"));
		list.add(new Board("제목5","내용5"));
		
		list.remove(2);
		list.remove(3);
		
		for(int i=0;i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.subject+"\t"+board.content);
		}
	}
}
//ArrayList와 달리 멀티스레드 환경에서 안전하게 객체를 추가,삭제할 수 있다
//Thread Safe