package p392;

interface Repairable{}

class Unit{
	int hitPoint;
	final int MAX_HP;
	Unit(int hp){//생성자에서 입력한 값이 MAX_HP가 된다.
		MAX_HP=hp;
	}
}



class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);//자식클래스가 Unit의 생성자를 호출하게 한다.
	}
}
class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}



class Marine extends GroundUnit{
	Marine(){
		super(40);//MAX_HP를 40으로 고정함
		hitPoint=MAX_HP;//현재 hp를 MAX_HP로 정함
	}
}
class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitPoint=MAX_HP;
	}
	public void repairable(Repairable r) {//Repairable 인터페이스를 구현한 클래스의 인스턴스만을 매개변수로 받는다.
		//수리 - hP가 MAX_HP가 될 때까지 증가시키는 코드를 작성한다
		//조건 : hitPoint!=MAX_HP
		//수행 : hitPoint++;
			//→ 입력될 모든 인스턴스는 Unit의 자손클래스라는 공통점이 있으므로, 반복문의 지역변수에 다형성을 적용하여 코드를 줄인다
			//조건 : Unit타입참조변수.hitPoint!=Unit타입참조변수.MAX_HP
			//수행 : Unit타입참조변수.hitPoint++;
		if(r instanceof Unit) {
			//인터페이스 구현은 Unit의 자손클래스가 아니어도 가능하므로 조건절로 검사한다.(코드에는 그런 경우는 없지만)
			Unit u=(Unit)r;
			//(if조건절에 의해)자동형변환 가능한 인스턴스들이 입력될 것이지만 이 코드만 놓고보면 모르기 때문에 명시한다
			while(u.hitPoint!=u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString()+"의 수리가 끝났습니다.");
			//객체명을 출력한다. 단 해쉬코드?가 출력되지 않기 위해서는 오버라이딩이 필요하다.
		}
	}
}
class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitPoint=MAX_HP;
	}
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable{
	Dropship(){
		super(125);
		hitPoint=MAX_HP;
	}
	public String toString() {
		return "Dropship";
	}
}



public class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repairable(dropship);
		scv.repairable(tank);
//		scv.repairable(scv);//p392.SCV@7de26db8의 수리가 끝났습니다. - toString() 재정의 안해서.
//		scv.repairable(marine);
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			The method repairable(Repairable) in the type SCV is not applicable for the arguments (Marine)
//
//			at p392.RepairableTest.main(RepairableTest.java:75)
	}
}
