package Animal;
class Animal {
    void show(){
        System.out.println("Hello");
    }
}
class Dog extends Animal{
    void show(){
        System.out.println("Hi");
    }
}
public class Animal2{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.show();
    }
}