package p204;

public class Ex5_11 {
	public static void main(String[] args) {
		int[] numArr=new int[10];
		int[] counter=new int[10];
		
		//numArr 배열에 난수 10개(0~9)생성하여 대입
		for(int i=0;i<numArr.length;i++) {
			numArr[i]=(int)(Math.random()*10);
			System.out.println(numArr[i]);
		}
		System.out.println();
		
		for(int i=0;i<numArr.length;i++) {
			counter[numArr[i]]++;
		}
		
		for(int i=0;i<counter.length;i++) {
			System.out.printf("%d의 개수 : %d\n",i,counter[i]);
		}
	}
}
