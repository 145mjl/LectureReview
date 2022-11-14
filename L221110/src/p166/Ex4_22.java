package p166;

public class Ex4_22 {
	public static void main(String[] args) {
		int[] ar= {10,20,30,40,50};
		int sum=0;
		
		for(int i=0;i<ar.length;i+=2) {
			System.out.printf("%d " ,ar[i]);
		}
//		향상된 for문은 저장된 요소를 읽어오는정도로만 사용
//		일반for문은 초기화 조건식 증감식을 조절하여 범위를 다르게 할 수 있음
		System.out.println();
		for(int tmp:ar) {
			System.out.printf("%d ",tmp);
			sum+=tmp;
		}
		System.out.println();
		System.out.println(sum);
	}
}
