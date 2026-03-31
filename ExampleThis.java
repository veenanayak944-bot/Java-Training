//Constructor example

public class ExampleThis {
    int rollno;
    String name;
    ExampleThis(){
        rollno=112;
        name="jeevitha";
    }
    public static void main(String[] args) {
        ExampleThis e =new ExampleThis();
        System.out.println("Roll No: " + e.rollno + ", Name: " + e.name);
    }
}
