package inheritance.polymorphism.CarEx;

public class KumhoTire extends Tire {
	public int accumulatedRotation;
	
	KumhoTire(String location,int maxRotation){
		super(location,maxRotation);
	}
	
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"의 KumhoTire의 수명 : "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println(location+"의 KumhoTire 펑크");
			return false;
		}
	}
	
	
}
