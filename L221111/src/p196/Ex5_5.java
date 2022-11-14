package p196;

public class Ex5_5 {
	public static void main(String[] args) {
		int sum=0;
		float average=0f;
		
		int[] score= {100,88,100,100,90};
		
		for(int i=0; i<score.length;i++) {
			sum+=score[i];
		}
		
		average=sum /(float)score.length;
//		14행을 조건문 안에 넣어도 출력은 맞지만
//		반복 매 회마다 average값을 대입하게 되면 횟수가 많아질수록 성능에 영향을 미치게 된다
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+average);
	}
}
