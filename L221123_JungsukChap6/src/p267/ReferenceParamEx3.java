package p267;

public class ReferenceParamEx3 {
	static void printAr(int[] ar) {//같은 기능의 메서드 Arrays.toString();
		System.out.print("[");
		for(int i:ar) {
			if(i==ar[ar.length-1]) {
				System.out.print(i);
				break;
			}
			System.out.print(i+",");
		}
		System.out.println("]");
	}
	static void sumAr(int[] ar) {
		int sum=0;
		for(int i:ar) {
			sum+=i;
		}
		System.out.println(sum);
	}
	static void sortAr(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length-1;j++) {
				int tmp=0;
				if(ar[j]>ar[j+1]) {
					tmp=ar[j+1];
					ar[j+1]=ar[j];
					ar[j]=tmp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] ar=new int[] {3,2,1,6,5,4};
		ReferenceParamEx3.printAr(ar);
		ReferenceParamEx3.sumAr(ar);
		ReferenceParamEx3.sortAr(ar);
	}
}
