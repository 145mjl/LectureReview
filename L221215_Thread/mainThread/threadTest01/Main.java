package threadTest01;

public class Main {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			System.out.println("thread");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}
//쓰레드를 1000ms(1s) 쉬게 한다
