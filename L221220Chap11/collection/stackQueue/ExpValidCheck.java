package stackQueue;

import java.util.*;

public class ExpValidCheck {
	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
			System.out.println("Example:java ExpValidCheck \"((2+3)*1)+3\"");
			System.exit(0);
		}
		Stack st=new Stack();
		String expression = args[0];
		
		System.out.println("expression:"+expression);
		
		try {
			for(int i=0;i<expression.length();i++) {
				char ch=expression.charAt(i);
				
				if(ch=='(') {
					st.push(ch+"");
				}else if(ch==')') {
					st.pop();
				}
			}
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			}else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
		}catch(EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.");
		} //try
	}
}
//Run configuration
//Arguments - Program Arguments
//입력한 Arguments는 public static void main(String[] args)의 arg에 들어간다.
//여기에 입력된 수식의 괄호갯수가 짝이 맞는지를 판단해준다
