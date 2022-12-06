package classFormat.MessageFormat;

import java.text.MessageFormat;

public class Main {
	public static void main(String[] args) {
		String id="java";
		String name="홍길동";
		String tel="010-123-4567";
		
		String text="회원 ID: {0} \n회원 이름: {1} \n회원 전화: {2}";
		String result1=MessageFormat.format(text,id,name,tel);
		System.out.println(result1);
		System.out.println();
		
		String sql="insert into member values({0},{1},{2})";
		Object[] arguments={"java","홍길동","010-123-4567"};
		String result2=MessageFormat.format(sql, arguments);
		System.out.println(result2);
		System.out.println();
		
		//test
		String tmp="국가: {0}\n도: {1}\n시/군/구: {2}\n상세주소: {3}\n우편번호: {4}";
		Object[] arr= {"Korea","Gyeonggi","Seongnam","blahblah",12345};
		String result3=MessageFormat.format(tmp, arr);
		System.out.println(result3);
	}
}
//형식이 낯설땐 printf문 생각해보기
