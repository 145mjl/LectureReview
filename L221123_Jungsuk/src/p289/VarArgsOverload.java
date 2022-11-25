package p289;

public class VarArgsOverload {
	static String concatenate(String delim,String...args) {
		String result = null;
		for(String str:args) {
			result+=str+delim;
		}
		return result;
	}
	
	static String concatenate(String...args) {
		String result=null;
		for(String str:args) {
			result+=str;
		}
		return result;
	}
	
	public static void main(String[] args) {
//		System.out.println(concatenate("0","100","200","300"));
		
//		The method concatenate(String, String[]) is ambiguous for the type VarArgsOverload
//		가변인자를 사용한 메서드는 오버로딩하면 모호함 문제가 발생한다.
	}
}
