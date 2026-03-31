class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void run() {
        System.out.println("Dog is running");
    }
}

class Cat extends Dog {
    void sleep() {
        System.out.println("cat is sleeping");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat();// Here we should create an object for child class only and dog cls becomes the parent cls only.
        
        c.eat();
        c.run();
        c.sleep();
    }
}