package p332;

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

//class Point3D extends Point{
//	int z;
//	
//	Point3D(int x,int y,int z){
//		컴파일러가 자동으로 super();를 추가하는데 Point()는 생성자 중에 없으므로 컴파일 에러
//		this.x=x;
//		this.y=y;
//		this.z=z;
//	}
//	
//	String getLocation() {
//		return "x :"+x+",y :"+y+",z :"+z;
//	}
//}

public class PointTest {
	public static void main(String[] args) {
		
	}
}
