package setInterface.TreeSet;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		//new Integer(int값) - warning. Deprecated
		//대신에 다음 문법을 사용
		//add(int값)
		//add(Integer.valueOf("int값"));
			//참고 : wrapper 클래스, java.lang.Integer
		scores.add(Integer.valueOf("87"));
		scores.add(Integer.valueOf("98"));
		scores.add(Integer.valueOf("75"));
		scores.add(Integer.valueOf("95"));
		scores.add(Integer.valueOf("80"));
		
		Integer score = null;
		score = scores.first();
		System.out.println("가장 낮은 점수 : "+score);
		
		score=scores.last();
		System.out.println("가장 높은 점수 : "+score);
		
		score=scores.lower(Integer.valueOf("95"));
		System.out.println("95점 아래 점수 : "+score);
		
		score=scores.higher(Integer.valueOf("95"));
		System.out.println("95점 위의 점수 : "+score);
		
		score=scores.floor(Integer.valueOf("95"));
		System.out.println("95점 이거나 바로 아래 점수(이하) : "+score);
		
		score=scores.ceiling(Integer.valueOf("85"));
		System.out.println("85점 이거나 바로 위의 점수(이상) : "+scores.size()+"\n");
		
		while(!scores.isEmpty()) {
			score=scores.pollFirst();
			System.out.println(score + "(남은 객체 수: "+scores.size()+")");
		}
	}
}
//이진 트리 (binary tree)
//노드값인 value와 왼쪽/오른쪽 자식 노드를 참조하기 위한 두개의 변수로 구성
//반드시 2개씩만 달림
//부모값과 비교해서 낮은 것은 왼쪽 자식 노드
//높은 것은 오른쪽 자식 노드에 저장

//참고 : java.util.Arrays의 sort()는 이진탐색을 사용한다
//이진탐색을 간략히 설명하자면 업앤다운게임