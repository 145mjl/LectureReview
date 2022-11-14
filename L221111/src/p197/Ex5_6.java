package p197;

public class Ex5_6 {
	public static void main(String[] args) {
		int[] score= {79,88,91,33,100,55,95};
		
//		int max=score[0],min=score[0];
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;

		for(int i=0;i<score.length;i++) {
			if(max<score[i]) {
				max=score[i];
			}
			if(min>score[i]) {
				min=score[i];
			}
		}
		
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		
	}
}
