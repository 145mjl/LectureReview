package maxMin;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] ar=new double[6];
		
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextDouble();
		}
		sc.close();
		
//		1.답안 코드
//		최대값을 찾아서 출력하고, 해당값을 배제시킨 이후, 남은 값중에 제일 큰 숫자를 출력하는 것을 반복
//		이해가 안 될 때는 디버깅 하기
//		for(int i=0;i<ar.length;i++) {
//			double max=0;
//			for(int j=0; j<ar.length;j++) {
//				if(max<ar[j]) {
//					max=ar[j];
//				}
//			} //배열중에 가장 큰 값을 max에 저장한다.
//			for(int j=0;j<ar.length;j++) {
//				if(max==ar[j]) {
//					ar[j]=-1;
//				}
//			} //해당 ar[j]에는 -1을 대입한다.(배열의 모든 요소보다 크기가 작은 임의의 최소값) 
//			for(int j=0;j<ar.length;j++) {
//				System.out.print(ar[j]+" ");
//			} //콘솔창 디버깅용
//			System.out.println(max+" ");
//		}
		
//		1-2. 위 코드와 유사하나 임의의 최소값 -1 대신에 배열 내의 최소값을 대입함
		
//		1-3.Double.MIN_VALUE를 이용하기
//		max값에 Double.MIN_VAlUE를 넣는다
//		boolean배열을 하나 더 만들어서 초기화하면 해당 배열은 모두 false값이다.
//		최댓값과 일치하는 인덱스값을 true로 바꾼다
//		다음 반복에서는 max<ar[j] && 불리언배열[j]==false 값만 max에 대입될 수 있게 조건문을 바꾼다.
		
		
//		2.버블소트
		for(int j=0;j<ar.length-1;j++) {
			for(int i=0;i<ar.length-1;i++) {
				if(ar[i]<ar[i+1]) {
					double tmp=ar[i+1];
					ar[i+1]=ar[i];
					ar[i]=tmp;
				}
			}
			//어제 스왑코드를 보고 이해한 점 : 임시 저장값을 만들어서 , 더 큰 값을 왼쪽 인덱스로 보내면 큰 수 순서대로 정렬할 수 있겠다.
			//어제 스왑코드를 보고 이해 못한점 : 왜 for문을 중첩해야하는지
			//그래서 for문 1개만 작성해봄
			
			//여기까지만 작성했을 때 문제 : 
			// 예를 들어 6 5 4 100 102 99를 입력하면
			// 6.0 5.0 100.0 102.0 99.0 4.0 로 정렬한다
			//원하는 결과가 나오지 않음
			//결과가 어떤식으로 틀린 것인지 생각해봄
			//예시의 경우 4.0만 제대로 정렬했고 나머지가 엉망임
			
			//예상 : 이 코드는 처음으로 'ar[i]가 ar[i+1]보다 작은' 경우를 만났을때, 해당 ar[i]에 '한해서' ar[i+1]~ar[ar.length-1]보다 큰지 작은지를 비교해준다.
			//예상이 맞는지 알아내기 위해서 계속 돌림
			//6.0 100.0 102.0 99.0 5.0 4.0 
			//100.0 102.0 99.0 6.0 5.0 4.0 
			//102.0 100.0 99.0 6.0 5.0 4.0
			//맞는 거 같음
		}
		//그러므로 모든 배열값에 대해 이 짓을 해줘야 올바르게 정렬이 된다.
		//따라서 (조건식이 거의 비슷한) for문을 중첩시키는 것이다... 라고 이해했다?
		
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		
	}
}
