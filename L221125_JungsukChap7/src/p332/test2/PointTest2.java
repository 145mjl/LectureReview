package p332.test2;

class Point{
	int x,y;
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	String getLocation() {
		return "x :"+x+",y :"+y;
	}
}

class Point3D extends Point{
	int z;
	
	Point3D(int x,int y,int z){
		super(x,y); //**Point(x,y)가 아니라 super 키워드를 사용해야 한다.
		this.z=z;
	}
	//새로 선언한 멤버변수는 해당 클래스 내에서 초기화하는 것이 좋은 구조화
	String getLocation() {
		return "x :"+x+",y :"+y+",z :"+z;
	}
}

public class PointTest2 {
	public static void main(String[] args) {
		
	}
}

