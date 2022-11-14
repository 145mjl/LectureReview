package p186;

import java.util.Arrays;

public class Ex5_1 {
	public static void main(String[] args) {
		int[] score=new int[5];
		int k=1;
		
//		1.선언 후 직접 대입
		score[0]=50;
		score[1]=60;
		score[k+1]=70;
		score[3]=80;
		score[4]=90;
		
		int tmp=score[k+2] +score[4];
		
		for(int i=0; i<5; i++) {
			System.out.printf("score[%d]:%d\n",i,score[i]);
		}
		
		System.out.printf("tmp:%d\n",tmp);
//		System.out.printf("score[%d]:%d\n",7,score[7]);//index 범위를 벗어난 값
		
//		1-2.선언한 뒤 for문으로 초기화
		System.out.println();
		int[] score1_2=new int[5];
		for(int i=0;i<5;i++) {
			score1_2[i]=10*(i+5);
			System.out.printf("score1_2[%d]:%d\n",i,score1_2[i]);
		}
		
//		2.선언과 동시에 초기화
		System.out.println();
		int[] score2=new int[] {50,60,70,80,90};
		for(int i=0;i<5;i++) {
			System.out.printf("score2[%d]:%d\n",i,score2[i]);
		}
		
		
		System.out.println();
		System.out.println(score);
		System.out.println(score1_2);
		System.out.println(score2);
		
		System.out.println();
//		배열의 요소를 출력하는 메서드 Arrays.toString(배열이름)
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(score1_2));
		System.out.println(Arrays.toString(score2));
	}
}
