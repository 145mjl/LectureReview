package p210;

public class Ex5_14 {
	public static void main(String[] args) {
		String str="ABCDE";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			System.out.printf("str.charAt(%d):%c\n",i,ch);
		}
		//문자열의 i번째 문자 출력
		
		char[] chAr=str.toCharArray();
		//char배열을 선언하고 문자열.toCharArray()를 대입
		System.out.println(chAr);
		//출력
		String str2=new String(chAr);
		//char배열을 문자열로
		System.out.println("str2=\""+str2+"\"");
		
	}
}
//error - line 17: String str2=new String[chAr];로 작성
//문자를 문자열로 합치면 문자열1개일뿐이다.
//chAr는 배열길이도 아니고,int도 아니다.