package classStringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String text="홍길동/이수홍/박연수";
		
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens=st.countTokens();
		for(int i=0;i<countTokens;i++) {
			String token=st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		st=new StringTokenizer(text,"/");
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			System.out.println(token);
		}
	}
}
//주로 아래쪽을 씀