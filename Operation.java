import java.util.Scanner;

class Operation {
    int a = 10, b = 2;

    void calculate(int op) {
        switch (op) {
            case 1:
                int sum = a + b;
                System.out.println("Sum = " + sum);
                break;

            case 2:
                int sub = a - b;
                System.out.println("Subtraction = " + sub);
                break;

            case 3:
                int multi = a * b;
                System.out.println("Multiplication = " + multi);
                break;

            case 4:
                int division = a / b;
                System.out.println("Division = " + division);
                break;

            default:
                System.out.println("Invalid operation");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Operation opp = new Operation();

        System.out.println("Enter operation (1:Add, 2:Sub, 3:Mul, 4:Div): ");
        int choice = sc.nextInt();

        opp.calculate(choice);
    }
}