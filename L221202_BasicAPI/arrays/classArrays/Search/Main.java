package classArrays.Search;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] scores= {99,68,36,29,88};
		
		Arrays.sort(scores);
		for(int i=0;i<scores.length;i++) {
			System.out.println("scores["+i+"]="+scores[i]);
		}
		//정렬하지 않고 binarySearch를 쓰면 원하는 결과X
		
		int index=Arrays.binarySearch(scores, 99);
		System.out.println("index : "+index);
	}
}
//Array클래스의 binarySearch메서드에 대하여
//업앤다운 게임 방식으로 탐색한다
//가령 1,3,8,11,15,17,20 데이터 집합에서 데이터 15를 탐색한다면
//순차탐색은 6회지만
//이진 탐색은 다음과 같다
//1,3,8,11,15,17,20 중간값 11 vs 15 -> 15가 더 큼
//15 17 20 의 중간값 17vs15 -> 15가 더 작음
//15->정답

//따라서 Arrays.sort()로 정렬해주지 않으면
//36vs99 -> 더 크므로 36 29 88중에서 찾음->29vs99 -> 
//더 크므로 88중에서 찾음 -> 88이 더 작음 -> 메서드탈출 -> 이상한 결과 나옴