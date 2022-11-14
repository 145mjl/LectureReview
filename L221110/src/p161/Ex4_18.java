package p161;

public class Ex4_18 {
	public static void main(String[] args) {
		for(int i=2;i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.printf("\n%d x %d = %2d",i,j,i*j);
//				if(j==9)
//					System.out.println("--------------");
//				으로 푼 사람도 있다.
			}
			System.out.println();
			String str="0 x 0 = 00";
			for(int k=0;k<str.length();k++) {
				System.out.print("-");
			}
		}
	}
}
