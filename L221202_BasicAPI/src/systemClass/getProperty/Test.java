package systemClass.getProperty;

import java.util.Properties;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		String osName=System.getProperty("os.name");
		String userName=System.getProperty("userName");
		String userHome=System.getProperty("userHome");
		
		System.out.println("운영체제 이름 : "+osName);
		System.out.println("사용자 이름 : "+userName);
		System.out.println("사용자 홈디렉토리 : "+userHome);
		
		System.out.println("-------------------------------");
		System.out.println(" [ key ] value");
		System.out.println("-------------------------------");
		
		Properties props = System.getProperties();
		Set keys =props.keySet();
		for(Object objKey : keys) {
			String key =(String)objKey;
			String value=System.getProperty(key);
			System.out.println("[ "+key+" ] "+value);
		}
	}
}
//디버그
//props객체는 배열이며
//각 요소마다 key(문자열),value(문자열)를 저장한다
//이것을 향상된 for문으로 출력하는 듯하다