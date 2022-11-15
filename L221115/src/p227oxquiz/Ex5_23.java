package p227oxquiz;

import java.util.Scanner;

public class Ex5_23 {
	public static void main(String[] args) {
		String[][] words= {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			System.out.printf("Q%d. %s의 뜻은?",i+1,words[i][0]);
			
			String tmp=sc.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.\n\n");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.\n\n",words[i][1]);
			}
		}
		sc.close();
		
	}
}
//tmp.eqauls(words[i][1]) --> tmp와 words[i][1]이 같은 인스턴스를 가리키면 true
//만약에 영어로 답변하는 경우에는 equalsIgnoreCase()를 사용할수도 있다