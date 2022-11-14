package package1;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 = "Java" ;
		String str2 = "JDK" ;
		String str3 = str1 + str2;
		String str4 = str1 +" "+str2;
		String str5 = "JDK"+3+3.0;
//		"JDK3" → "JDK33.0" → str5에 저장
		String str6 = 3+3.0+"JDK";
//		실수 6.0 → "6.0JDK" → str6에 저장
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
	}
}
