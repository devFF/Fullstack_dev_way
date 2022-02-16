public class Dog{
	// Create class and variables
	// Class name = java-file name!
	// Each java-file must contains only one class!
	
	String name; // variable for instances of this class
	int age; // variable for instances of this class
	
	static int count = 0;  // Create counter. 
	// Static variable can be used in any method. It means, that this variable is common for all methods.
	
	//Let's create constructor for the Dog class
	// Constructor is template (шаблон) for objects of the class
	// Constructor name = class name = java-file name!
	public Dog(String name, int age) {
		// Here i require 2 args
		this.name = name;
		this.age = age;
		count++;
		System.out.println("You created dog under the number " + count + " by contructor, named " + this.name + ", his age is " + this.age);
	}
	
	public Dog() {
		// Here i don't require args
		count++; // add 1 to counter
		System.out.println("Unknown dog under the number " + count + " created");
	}
	
	public static void main(String[] args) {
		Dog tima = new Dog(); // Create an instance (экземпляр) of the class without constructor
		tima.name = "Tima";
		System.out.println("You set dog name. Name is " + tima.name);
		tima.age = 9;
		System.out.println("You set dog age. Age is " + tima.age);
		
		
		System.out.println("You created " + count + " dogs");
		
		Dog igor = new Dog();
		igor.name = "Igor";
		System.out.println("You set dog name. Name is " + igor.name);
		igor.age = 24;
		System.out.println("You set dog age. Age is " + igor.age);

		System.out.println("You created " + count + " dogs");
	
		// Try to use constructor
		Dog miniWolf = new Dog("MiniWolf", 11);
		
	}
}
