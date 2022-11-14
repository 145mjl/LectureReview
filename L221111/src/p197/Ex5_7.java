package p197;

public class Ex5_7 {
	public static void main(String[] args) {
		int[] ar=new int[10];
		
		for(int i=0;i<ar.length;i++) {
			ar[i]=i;
			System.out.print(ar[i]);
		}
		
		for(int i=0;i<100;i++) {
			int n=(int)(Math.random()*10);
			
			int tmp=ar[n];
			ar[n]=ar[0];
			ar[0]=tmp;
		}
		
		System.out.println();
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]);
		}
	}
}
