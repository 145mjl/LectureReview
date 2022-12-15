package threadClassInstantiate;

class BeepTask implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				
			}
		}
	}
}

public class ThreadExample {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("똥");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
}

//메인스레드와 작업스레드가 동시에 실행중인 예제
