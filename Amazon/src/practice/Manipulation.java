package practice;

 class Manipulate {
	public void add() {
		System.out.println("First Method");
	}
 }
	 class addnum extends Manipulate {
		 
		public void add() {
			System.out.println("Second Method");
		}
	 }
	 public class Manipulation{
	 
	public static void main(String[] args) {
		Manipulate addition=new addnum();
		addition.add();
	}

}



//class Animal {
//    public void makeSound() {
//        System.out.println("Some sound");
//    }
//}
//
//class Dog extends Animal {
//    @Override
//    public void makeSound() {
//        System.out.println("Woof!");
//    }
//}
//
//class Cat extends Animal {
//    @Override
//    public void makeSound() {
//        System.out.println("Meow!");
//    }
//}
//public class PolymorphismExample {
//    public static void main(String[] args) {
//        Animal dog = new Dog();
//        Animal cat = new Cat();
//
//        dog.makeSound(); // Output will be "Woof!"
//        cat.makeSound(); // Output will be "Meow!"
//    }
//}