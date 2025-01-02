package example_of_inheritance;

public class Animal {
    protected void eat(){
        System.out.println("eat");
    }

    protected void sleep(){
        System.out.println("sleep");
    }

}

class Dog extends Animal {
    public void makeSound(){
        System.out.println("dog makes sound");
    }

    @Override
    protected void sleep() {
        System.out.println("dog sleep");
    }
}

class test {
    public static void main(String[] args) {
        System.out.println("Example of inheritance\n");
        System.out.println("Animal Class:");
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        System.out.println("\nDog Class:");
        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();
        dog.eat();
    }
}


