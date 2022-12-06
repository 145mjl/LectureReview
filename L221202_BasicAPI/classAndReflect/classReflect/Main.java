package classReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
//클래스 이름,생성자,필드,메서드를 따로 분류해서 보여주는 코드


class TClass{
	private double mSpeed;
	private int mColor;
	
	public TClass() {
		
	}
	public TClass(int a, int b) {
		
	}
	public double getSpeed() {
		return mSpeed;
	}
	public int getColor() {
		return mColor;
	}
	public void setColor(int color) {
		mColor=color;
	}
}


public class Main {
	private static void printParameters(Class<?>[] parameters) {
		//메서드를 클래스 밖으로 빼서 작성해서 컴파일 에러 발생
		//그리고 이러한 문제가 있을 경우 이클립스는 해당 메서드에 컴파일 에러를 띄우기보다는
		//가까운 클래스의 대괄호범위가 잘못되었다는 식으로 컴파일 에러 메세지를 주는 것 같다.
		for(int i=0;i<parameters.length;i++) {
			System.out.print(parameters[i].getName());
			if(i<parameters.length-1) {
				System.out.print(", ");
			}
		}
	}
	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("classReflect.TClass");
			//TClass만 입력하는 등 틀릴 경우 ClassNotFoundException 발생
			
			System.out.println("[Class Name]");
			System.out.println(clazz.getName());
			
			System.out.println("[Constructor Info]");
			Constructor<?>[] constructors = clazz.getDeclaredConstructors();
			for(Constructor<?> constructor : constructors) {
				System.out.print(constructor.getName()+"(");
				Class<?>[] parameters = constructor.getParameterTypes();
				printParameters(parameters);
				System.out.println(")");
			}
			System.out.println();
			
			System.out.println("[Field Info]");
			Field[] fields = clazz.getDeclaredFields();
			for(Field field : fields) {
				System.out.println(field.getType().getSimpleName()+" "+field.getName());
			}
			System.out.println();
			
			System.out.println("[Method Info]");
			Method[] methods = clazz.getDeclaredMethods();
//			Method[] methods = clazz.getMethods();//상속받은 메서드까지 나온다
			for(Method method : methods) {
				System.out.print(method.getName()+"(");
				Class<?>[] parameters = method.getParameterTypes();
				printParameters(parameters);
				System.out.println(")");
			}
			System.out.println();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
//methods 배열 요소가 실행마다 순서가 바뀐다
//java api 문서 : The elements in the returned array are not sorted and are not in any particular order.

//교재외에 https://12bme.tistory.com/129 를 참고하여 warning을 제거하였다