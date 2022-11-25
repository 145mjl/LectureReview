package p271;

class Test{
	int n=0;
	String sumStr(char[] c) {
		if(n==c.length) {
			return "";
		}
		String result=c[n++]+"";
		return result+sumStr(c);//abcde
//		return sumStr(c)+result;//edcba
	}
}

public class RecursiveTest {
	public static void main(String[] args) {
		Test t=new Test();
		char[] c=new char[] {'a','b','c','d','e'};
		System.out.println(t.sumStr(c));
	}
}
