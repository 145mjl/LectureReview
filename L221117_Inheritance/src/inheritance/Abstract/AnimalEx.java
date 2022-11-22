package inheritance.Abstract;

public class AnimalEx {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("1. --------------");
		
		Animal animal=null;
//		Animal animal2=new Animal();//추상클래스이므로 불가능
		animal=new Dog();
		animal.sound();
		animal=new Cat();
		animal.sound();
		System.out.println("2. --------------");
		
		animalSound(new Dog());//line 13~14== line19+24~26
		animalSound(new Cat());//line 15~16== line20+24~26
		
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
