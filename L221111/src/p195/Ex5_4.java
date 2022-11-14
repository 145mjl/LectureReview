package p195;

public class Ex5_4 {
	public static void main(String[] args) {
		char[] abc= {'A','B','C','D'};
		char[] num= {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println(abc);
		System.out.println(num);
		
		char[] result =new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		
		System.out.println(result);
		
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		System.arraycopy(abc, 0, num, 6, 3);
//		6은 인덱스번호임
		System.out.println(num);
		
	}
}
//오답 사유 : index out of bound
//abc가 result[0]부터 result[abc.length-1]이므로
//num은 result[abc.length]부터다 << 이 부분을 틀림