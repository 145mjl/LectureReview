package p220_map;

import java.util.Scanner;

public class Ex5_20 {
	public static void main(String[] args) {
		final int SIZE=10;//SIZE - 대문자 - 상수라는 뜻(관습)
//		final - 이 변수를 상수로 만들겠다.
		int x=0,y=0;
		
		
		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard= {
//				1,2,3,4,5,6,7,8,9
				{0,0,0,0,0,0,1,0,0},//1	
				{1,1,1,1,0,0,1,0,0},//2	
				{0,0,0,0,0,0,1,0,0},//3	
				{0,0,0,0,0,0,1,0,0},//4	
				{0,0,0,0,0,0,0,0,0},//5	
				{1,1,0,1,0,0,0,0,0},//6	
				{0,0,0,1,0,0,0,0,0},//7	
				{0,0,0,1,0,0,0,0,0},//8	
				{0,0,0,0,0,1,1,0,0},//9	
		};
		
		
		for(int i=1;i<SIZE;i++) {
			board[0][i]=board[i][0]=(char)(i+'0');
		}
		//2차원 char 배열에 x,y좌표축을 생성
		//(char)(i+'0')을 하면 char i로 변환된다


		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.printf("좌표를 입력하세요.(종료는 00)>");
			String inp =sc.nextLine();
			
			if(inp.length()==2) {
				x=inp.charAt(0)-'0';//1번째문자를 x값으로
				y=inp.charAt(1)-'0';//2번째문자를 y값으로
				
				if(x==0&&y==0) {
					break;
				}
			}
			
			if(inp.length()!=2 || x<=0 || x>=SIZE || y<=0 || y>=SIZE) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}// 공백2,-2,2공백 등도 inp.length()==2의 조건을 만족한다. -2는 원래 String길이가 2이며, 숫자+공백의 경우 nextLine();의 특성 때문
			
			board[x][y]=shipBoard[x-1][y-1]==1 ? 'O':'X';
			//shipBoard배열에서 1값이면 O 0값이면 X를 출력한다
			//board배열은 0행과 0열이 좌표축이기 때문에 shipBoard와 1씩 차이남
			for(int i=0;i<SIZE;i++) {
				System.out.println(board[i]);
			}
			System.out.println();
			//board[i]라는 1차원배열을 SIZE번 출력하면 board 2차원배열이 됨
		}
		sc.close();
		
		
	}
}
