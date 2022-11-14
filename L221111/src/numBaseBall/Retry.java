package numBaseBall;

import java.util.Scanner;
import java.util.Arrays;//난수출력용

public class Retry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//난수 저장할 배열
		int[] answer=new int[3];
		
		//난수 배열 초기화
		for(int i=0;i<answer.length;i++) {
			answer[i]=((int)(Math.random()*10));
			//시행착오 : Math.random()*10에 괄호를 쳐주지 않으면
			//(int)Math.random이 먼저 실행되어 어떤 수를 입력해도 0이 됨
			
			//시행착오 : 배운것 중에 어떤 것을 사용할지, 변수
			//규칙성파악하기
			//i 0일때 검사 필요하지 않음
			//i 1일때 0vs1
			//i 2일때 0vs2 1vs2
			//i 3일때 0vs3 1vs3 2vs3
			//answer[i]가 그대로일때 1씩 증가하면서 비교를 반복할 변수가 필요 -> 중첩for문이 필요
			for(int j=1;j<i+1;j++) {
				if(answer[j-1]==answer[i]) {
					i--;//중복값일시 i--하여 다시 입력하게 함
					break; 
				}
			}//시행착오 : 초기값 잘못 정해서 index out of bound
		}
		System.out.println(Arrays.toString(answer));//난수출력용
		
		
		//입력값 배열 초기화
		while(true) {
			//매번 체크&배열 초기화를 해야하기 때문에 무한반복문 안에 넣을것
			int strikeCount=0, ballCount=0;
			int[] inp=new int[3];
			
			for(int i=0;i<inp.length;i++) {
				System.out.println("0 ~ 9 정수를 입력하세요.(총 3개)");
				inp[i]=sc.nextInt();
				//0~9 범위인지 검사
//				if(!(inp[i]>=0 && inp[i]<=9)) {
//					System.out.println("범위 밖의 값을 입력했습니다. 다시 입력하세요.");
//					inp[i]=0;
//					i--;
//					continue;
//					//필수적인지 모르겠지만 디버그할때 귀찮을까봐 추가
//				}
//				//중복값 검사
//				for(int j=1;j<i+1;j++) {
//					if(inp[j-1]==inp[i]) {
//						i--;
//						System.out.println("중복되는 값은 입력할 수 없습니다. 다시 입력하세요.");
//						break; 
//					}
//				}
				
				//이렇게 하면 한꺼번에 숫자3개를 다 입력했을경우 맨위문장이 2번 더 출력돼서 보기싫음
				//그리고 잘못된 번째부터 재입력받는거라 좀그럼
				//엔터를 치든, 한줄에 몰아서 치든 유연하게 반응할수있는게 좋은코드아닐까?
				//그래서 일단 입력을 받고 검사해서 중복이면 돌려보내기로함
			}
			
			
			//1.스트라이크 - for문 이용
			for(int i=0;i<inp.length;i++) {
				if(answer[i]==inp[i]) {
					strikeCount++;
				}
			}
			
			
			//2.볼 - 중첩 for문
			//중복값을 검사한 원리를 이용
			for(int i=0;i<answer.length;i++) {
				for(int j=0;j<inp.length;j++) {
					if(answer[i]==inp[j]) {
						ballCount++;
					}
				}
			}
			ballCount-=strikeCount;
			
			//출력
			if(strikeCount==inp.length) {
				System.out.printf("%d Strike입니다. 숫자야구를 종료합니다.",strikeCount);
				sc.close();
				break;
			}else if(strikeCount!=0 && ballCount!=0) {
				System.out.printf("%d Strike %d Ball입니다.",strikeCount, ballCount);
			}else if(strikeCount==0 && ballCount!=0){
				System.out.printf("%d Ball입니다.",ballCount);
			}else if(strikeCount!=0 && ballCount==0){
				System.out.printf("%d Strike입니다.",strikeCount);
			} else {	
				System.out.print("아웃입니다.");
			}
			System.out.println("다시 시도해보세요.");
			//시행착오 : 3S를 띄워야 탈출한다. 문제를 제대로 읽자.
			//무한반복문을 생성해주고, 스캐너 close를 break문 직전으로 옮겨준다.
		}
		
	}
}
