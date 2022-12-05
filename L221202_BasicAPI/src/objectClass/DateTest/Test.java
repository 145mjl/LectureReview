package objectClass.DateTest;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj2);
		System.out.println(obj2.toString());
	}
}

//참고
//아직 안 배운 코드가 있지만
//System.out.println()의 parameter로 Object x를 입력하면 x.toString()을 입력한것과 같은결과를 낸다

//public void println(Object x) {
//    String s = String.valueOf(x);
//    if (getClass() == PrintStream.class) {
//        // need to apply String.valueOf again since first invocation
//        // might return null
//        writeln(String.valueOf(s));
//    } else {
//        synchronized (this) {
//            print(s);
//            newLine();
//        }
//    }
//}