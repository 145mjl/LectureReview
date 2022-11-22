package inheritance.Instanceof;

public class InstanceofEx1 {
	public static void main(String[] args) {
		Parent parent1 = new Parent();
		Parent parent2 = new Child();
		
		if(parent1 instanceof Parent) {
			System.out.println("parent1 instanceof Parent=true");
		}else {
			System.out.println("parent1 instanceof Parent=false");
		}
		if(parent2 instanceof Parent) {
			System.out.println("parent2 instanceof Parent=true");
		}else {
			System.out.println("parent2 instanceof Parent=false");
		}
		if(parent1 instanceof Child) {
			System.out.println("parent1 instanceof Child=true");
		}else {
			System.out.println("parent1 instanceof Child=false");
		}
		if(parent2 instanceof Child) {
			System.out.println("parent2 instanceof Child=true");
		}else {
			System.out.println("parent2 instanceof Child=false");
		}
	}
}
