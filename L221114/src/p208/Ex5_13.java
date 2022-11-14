package p208;

public class Ex5_13 {
	public static void main(String[] args) {
		char[] hex= {'C','A','F','E'};
		
		String[] binary = { "0000", "0001" , "0010" , "0011"
							, "0100", "0101" , "0110","0111"
							,"1000","1001","1010","1011"
							,"1100","1101","1110","1111"};
		
		String result="";
		
		for(int i=0;i<hex.length;i++) {
			if(hex[i]>='0'&&hex[i]<='9') {//'숫자를 표현하는 문자'인지 판단
				result +=binary[hex[i]-'0'];
			}else {//'숫자를 표현하는 문자'가 아닌 경우
				result+=binary[hex[i]-'A'+10];
			}
		}
		
		//'0'은 binary[0]
		//'9'는 binary[9]
		//'A'는 binary[10]
		//16진수는 10부터 알파벳을 쓰니까 일부러 식을 binary[대문자알파벳 넣으면 차례대로 10부터 16으로 됨]으로 작성함
		
		
		System.out.println("hex:"+new String(hex));
		System.out.println("binary:"+result);
		
		
	}
}

//'0'<= <='9'의 범위는 단순히 아스키코드값이 48~57인지가 아니라 해당문자가 숫자문자인지를 판단할 수 있는 식으로도 쓰인다.
//같은 종류 문자끼리는 코드값이 몰려있다.