package p194;

public class Ex5_3 {
	public static void main(String[] args) {
		int[] ar=new int[5];
		
		for(int i=0;i<ar.length;i++) {
			ar[i]=i+1;
		}
		
		System.out.println("[변경전]");
		System.out.println("ar.length:"+ar.length);
		for(int i=0;i<ar.length;i++) {
			System.out.println("ar["+i+"]:"+ar[i]);
		}
		
		int[] tmp= new int[ar.length*2];
		
		for(int i=0;i<ar.length;i++) {
			tmp[i]=ar[i];
		}
		
		ar=tmp;
		
		System.out.println("[변경후]");
		System.out.println("ar.length:"+ar.length);
		for(int i=0;i<ar.length;i++) {
			System.out.println("ar["+i+"]:"+ar[i]);
		}
	}
}
