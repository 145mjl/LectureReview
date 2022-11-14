package numBaseBall;

import java.util.Arrays;
import java.util.Scanner;

public class Retry3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] answer=new int[3];

		
		int answerCount=0;
		do {
			for(int i=0;i<answer.length;i++) {
				answer[i]=((int)(Math.random()*10));
				for(int j=1;j<i+1;j++) {
					if(answer[j-1]==answer[i]) {
						answerCount++;
					}
				}
			}
		}while(answerCount!=0);
		System.out.println(Arrays.toString(answer));//난수출력용
		
		sc.close();
		
//		while(true) {
//			int strikeCount=0, ballCount=0, inpCount=0;
//			int[] inp=new int[3];
//			System.out.println("0 ~ 9 정수를 입력하세요.(총 3개)");
//			
//			do {
//				inpCount=0;
//				for(int i=0;i<inp.length;i++) {//입력값 배열
//					inp[i]=sc.nextInt();
//				}
//				for(int i=0;i<inp.length;i++) {//중복값 검사,count
//					if(!(inp[i]>=0 && inp[i]<=9)) {
//						inpCount++;
//					}
//					for(int j=1;j<i+1;j++) {
//						if(inp[j-1]==inp[i]) {
//							inpCount++;
//						}
//					}
//				}
//				if(inpCount!=0) {
//					System.out.println("중복되는 숫자 또는 범위를 벗어난 값이 있습니다.");
//				}
//			}while(inpCount!=0);
//			
//			//1.스트라이크 - for문 이용
//			for(int i=0;i<inp.length;i++) {
//				if(answer[i]==inp[i]) {
//					strikeCount++;
//				}
//			}
//			
//			
//			//2.볼 - 중첩 for문
//			for(int i=0;i<answer.length;i++) {
//				for(int j=0;j<inp.length;j++) {
//					if(answer[i]==inp[j]) {
//						ballCount++;
//					}
//				}
//			}
//			ballCount-=strikeCount;
//			
//			//출력
//			if(strikeCount==inp.length) {
//				System.out.printf("%d Strike입니다. 숫자야구를 종료합니다.",strikeCount);
//				sc.close();
//				break;
//			}else if(strikeCount!=0 && ballCount!=0) {
//				System.out.printf("%d Strike %d Ball입니다.",strikeCount, ballCount);
//			}else if(strikeCount==0 && ballCount!=0){
//				System.out.printf("%d Ball입니다.",ballCount);
//			}else if(strikeCount!=0 && ballCount==0){
//				System.out.printf("%d Strike입니다.",strikeCount);
//			} else {	
//				System.out.print("아웃입니다.");
//			}
//			System.out.println("다시 시도해보세요.");
//
//		}
	}
}
