package p200;

import java.util.Arrays;

public class Ex5_9 {
	public static void main(String[] args) {
		int[] code= {-4,-1,3,6,1};
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			int tmp=(int)(Math.random()*code.length);//0~4범위(code 인덱스가 0~4) 무작위 정수
			arr[i]=code[tmp];//code배열의 요소중하나가 대입됨
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
