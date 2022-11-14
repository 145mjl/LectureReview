package p211;

public class Ex5_15 {
	public static void main(String[] args) {
		String source="SOSHELP";
		String[] morse = {".-","-...","-.-.","-..","."
						,"..-.","--.","....","..",".---"
						,"-.-",".-..","--","-.","---"
						,".--.","--.-",".-.","...","-"
						,"..--","...-",".--","-..-","-.--"
						,"--.."};
		
		String result="";
		
		for(int i=0;i<source.length();i++) {
			result+=morse[source.charAt(i)-'A'];
//			result+=morse[source.charAt(i)-'A']+" ";//공백포함
		}
		System.out.println("source:"+source);
		System.out.println("morse:"+result);
		
	}
}
//모스부호값 -> morse[알파벳대문자-'A']
//result는 문자열값의 합이므로 모스부호가 쭉 이어서 나온다
