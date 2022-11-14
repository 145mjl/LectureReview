package package1;
public class BreakExample {
	public static void main(String[] args) {
		int i=1;
		
		while(true) {
			System.out.println(i);
			
			if(i==6) {
				break;
			}
			//break; 한줄만 있으므로 코드블럭 생략가능
			i+=1;
		}
	}
}
