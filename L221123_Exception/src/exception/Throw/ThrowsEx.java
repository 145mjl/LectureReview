package exception.Throw;

public class ThrowsEx {
	public static void main(String[] args) {
		ThrowsEx te = new ThrowsEx();
		try {
			te.exceptionMethod();
		}catch(Exception e) {
			/* 발생한 Exception을 출력 */
			System.out.println(e); //e.toString()
			/* 예외 발생 당시의 호출스택(Call Stack)에 있던 메서드 정보와 예외 메세지 */
			e.printStackTrace();
		}
	}
	
	/* exception을 일부러 발생시키는 메서드 */
	public void exceptionMethod() throws Exception{
		throw new Exception();
	}
	
}
