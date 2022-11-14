package numBaseBall;
//숫자야구
//중복되는 숫자 없어야 함
import java.util.Scanner;
import java.util.Arrays;

public class FirstTry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int strikeCount=0, ballCount=0;
		
		int[] answer=new int[4];

//			중복 거르기
//			일단 0일때는 지나가게 함(answer[0]값은 아무값이나 되어도 상관없고, indexoutofbound를 방지해야함)
//			그 이후에는 이전값과 같으면 부여된 난수값을 0으로 초기화하고, i를 미리 하나 감소시켜서 증감식 거쳐도 문제없게 함
//			문제점발견 : 멀리있는 값끼리 중복될 수 있음
//			한번 쓴 값은 다시 못쓰게하는 코드 필요함
//			소트?에서 멀리있는값을 비교하는방법을 알았음
//			이걸 응용할수있는지고민해보기
//			인덱스 0은 - 비교할 필요 X
//			1은 - 0과 비교 (1번반복) , 2는 - 0,1 , 3은 - 0,1,2

		
		for(int i=0;i<answer.length;i++) {
			answer[i]=((int)(Math.random()*10));
//			난수를입력함
//			0일때 false
//			1일때 1 (0과 1)
//			2일때 2 (0과 2 , 1과 2)
//			i숫자마다 반복횟수가다르다 즉 중첩for문필요
//			0일때 false로 어차피 반복문에 들어오지않으므로 이제 i!=0은 필요없음
//			괄호를 안 쳐주니까 난수에 먼저 int변환이 되어서 0<= <1의 int 즉 모든게 0이 되어서 문제가 발생함
			for(int j=1;j<i+1;j++) {
				if(answer[j-1]==answer[i]) {//answer[i]와 비교해야함
					answer[i]=0;//여기 j들어가면 안됨....
					i--;
					break; //그럴일 없을것같지만 브레이크 안시킬때 i 여러번 감소할까봐 찜찜해서 걍시킴
				}
//				이거문제점 : j vs j+1하니까 초기값0이랑 입력값0이 같게취급되는 문제발생
//				j-1 vs j로 바꾸고 인덱스문제상 j를 1부터 시작하고 조건식도 고쳐주기
//				문제점2 : 소트는 계속 값을 밀어줬기때문에 멀리있는수랑도 비교한건데
//				이건 배열 안 조지려고 해서 그냥 여전히 옆이랑 비교못함
//				예를들어 3일때 (0vs3, 1vs3, 2vs3)해야하는데 (0vs1 1vs2 2vs3)함
//				중첩for문까지는 좋았는데 if문안을 고쳐봐야할듯
			}
		}
		
		System.out.println(Arrays.toString(answer));//콘솔창테스트용
		
//		이제 사용자가 입력할 배열 생성
		int[] inp=new int[4];
		for(int i=0;i<inp.length;i++) {
			System.out.println("0 ~ 9 정수를 입력하세요.(총 4개)");
			inp[i]=sc.nextInt();
			
			if(!(inp[i]>=0 && inp[i]<=9)) {
				System.out.println("범위 밖의 값을 입력했습니다. 다시 입력하세요.");
				inp[i]=0;
				i--;
				continue;
				//continue는 필수적이지 않아보이지만 내가 디버그할때귀찮음
			}
			
			for(int j=1;j<i+1;j++) {
				if(inp[j-1]==inp[i]) {
					inp[i]=0;
					i--;
					System.out.println("중복되는 값은 입력할 수 없습니다. 다시 입력하세요.");
					break; 
				}
			}
		}
		sc.close();
		
		
//		1.스트라이크
//		그냥 비교
		for(int i=0;i<inp.length;i++) {
			if(answer[i]==inp[i]) {
				strikeCount++;
			}
		}
		
		
//		2.볼
//		생각할점 : 진짜 스트라이크카운트를 빼면 볼카운트인가? 뭔가 예외는 없는지?
//		그리고 정렬을 한다고 해서 진짜 원하는 결과가 나오나?
//		예를 들어서 9561
//		9867임
//		그럼 9651 vs 9867임
//		전혀비교안됨
//		오히려 아까 그 중첩for문의 원리가 맞음

//		answer 0과 inp 0123
//		1과 0123 
//		을 반복하면 됨
		for(int i=0;i<answer.length;i++) {
			for(int j=0;j<inp.length;j++) {
				if(answer[i]==inp[j]) {
					ballCount++;
				}
			}
		}
		
		ballCount-=strikeCount;

		if(strikeCount!=0 && ballCount!=0) {
			System.out.printf("%d Strike %d Ball입니다.",strikeCount, ballCount);
		}else if(strikeCount==0 && ballCount!=0){
			System.out.printf("%d Ball입니다.",ballCount);
		}else if(strikeCount!=0 && ballCount==0){
			System.out.printf("%d Strike입니다.",strikeCount);
		} else {	
			System.out.println("아웃입니다.");
		}
//		조건식을 제대로 정하기 : s이 0일때도 있고 b가 0일때도 있고 둘다 값이 있을때도 있고...
//		당연한건데 여기서 시간끌지말기
//		그리고 조건 범위가 좁은것부터 걸러내야하는건 맞는데
//		없으면 없는대로 하셈
//		ball만 있을때와 strike만있을때의 (있지도 않은) 우위를 생각하다가 시간 걸림
//		또한 스트라이크,볼 둘다 0이 아니고 스트라이크가 0이 아님 이라고 작성하면 중복이라서 에러가 남
	}
}
