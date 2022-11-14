package p197;

public class Ex5_6_Sort {
	public static void main(String[] args) {
		int[] score= {79,88,91,33,100,55,95};
		
		for(int i=0;i<score.length-1;i++) {
			for(int j=0;j<score.length-1;j++) {
				if(score[j]<score[j+1]) {
					int tmp=score[j+1];
					score[j+1]=score[j];
					score[j]=tmp;
				}
			}
		}
		
		System.out.println("max:"+score[0]);
		System.out.println("min:"+score[score.length-1]);
		
	}
}
//오답사유 : 인덱스 
//i,j 초기값을 0으로 해야함
