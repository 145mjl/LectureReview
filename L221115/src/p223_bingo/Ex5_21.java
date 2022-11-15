package p223_bingo;

import java.util.Scanner;

public class Ex5_21 {
	public static void main(String[] args) {
		final int SIZE=5;
		int x=0,y=0,num=0;
		
		int[][] bingo=new int[SIZE][SIZE];
		Scanner sc=new Scanner(System.in);
		
		//bingo배열을 5x5칸에 1~25를 입력한 모양으로 만든다.
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				bingo[i][j]=i*SIZE+j+1;
			}
		}
		
		//숫자를 섞는다.
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				x=(int)(Math.random()*SIZE);
				y=(int)(Math.random()*SIZE);
				
				int tmp=bingo[i][j];
				bingo[i][j]=bingo[x][y];
				bingo[x][y]=tmp;
			}
		}
		
		
		do {
			for(int i=0;i<SIZE;i++) {
				for(int j=0;j<SIZE;j++) {
					System.out.printf("%2d ",bingo[i][j]);
				}
				System.out.println();//빙고판을 출력
			}
			System.out.println();
			
			System.out.printf("1~%d의 숫자를 입력하세요.(종료:0)>",SIZE*SIZE);
			num=sc.nextInt();
			
			outer:
			for(int i=0;i<SIZE;i++) {
				for(int j=0;j<SIZE;j++) {
					if(bingo[i][j]==num) {
						bingo[i][j]=0;
						break outer;
					}
				}
			}//숫자를 맞추면 해당값은 0으로 바꾼다
		}while(num!=0);
		sc.close();
		
	}
}
