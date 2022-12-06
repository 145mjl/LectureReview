package classStringTokenizer;

public class SplitTest {
	public static void main(String[] args) {
		String text="홍길동&이수홍,박연수,김자바-Simon";
		
		String[] names=text.split("&|,|-");
		//& or , or -
		for(String name : names) {
			System.out.println(name);
		}
	}
}

//StringTokenizer클래스

//메소드
//int - countTokens()
//boolean - hasMoreTokens()
//String - nextToken()
//split()
