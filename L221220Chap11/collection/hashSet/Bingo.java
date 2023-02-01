package hashSet;

import java.util.HashSet;
import java.util.Iterator;
//import java.util.LinkedHashSet;
import java.util.Set;

public class Bingo {
	public static void main(String[] args) {
		Set set=new HashSet();
//		Set set=new LinkedHashSet();
		int[][] board=new int[5][5];
		
		for(int i=0;set.size()<25;i++) {
			set.add((int)(Math.random()*50)+1+"");
		}
		//int 1~50 범위의 난수를 25개 생성
		
		Iterator it=set.iterator();
		//복습 : Iterator는 컬렉션의 각 요소에 접근하는 기능을 가진 인터페이스
		//컬렉션 인터페이스에 정의된 iterator() 메서드는 Iterator클래스의 인스턴스를 반환함
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				board[i][j]=Integer.parseInt((String)it.next());
				//set에 저장된 요소 개수를 알고 있으므로 
				System.out.print((board[i][j]<10?"  ":" ")+board[i][j]);
				//한자리숫자는 공백 2개로
			}
			System.out.println();
		}
	}//main
}
