package inheritance.polymorphism;

public class Main {
	Tire t1 = new KumhoTire();
	Tire t2 = new HankookTire();
	
	Parrot parrot = new Parrot();
	Animal animal = new Animal();
	Animal animal2 = new Parrot();
}
