package p292;

class Data1{
	int value;
}

class Data2{
	int value;
	
	Data2(int x){
		value=x;
	}
}

public class ConstructrorTest {
	public static void main(String[] args) {
		Data1 d1=new Data1();
//		Data2 d2=new Data2();
	}
}


/* Data2의 생성자 Data2()는 정의되지 않았다 → 자동컴파일러는 '정의된 생성자가 아무것도 없을때' 한정 생성자를 자동추가한다
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
 * The constructor Data2() is undefined
 * 
 * at p292.ConstructrorTest.main(ConstructrorTest.java:18)
 */
