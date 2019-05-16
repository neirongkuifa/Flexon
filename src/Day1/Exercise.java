package Day1;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        // Exercise 1
        double var1 = 20d;
        double var2 = 80d;
        double var3 = 25 * (var1 + var2);
        System.out.println(var3);

        double var4 = var3 % 40;

        if (var4 <= 20) {
            System.out.println("Total was over the limit");
        }

        // Exercise 2
        char fruit = 'J';

        switch (fruit) {
            case 'A':
                System.out.println("Apple");
                break;
            case 'B':
                System.out.println("Banana");
                break;
            case 'C':
                System.out.println("Cherries");
                break;
            case 'D':
                System.out.println("Dragon Fruit");
                break;
            case 'E':
                System.out.println("Elder Berry");
                break;
            default:
                System.out.println("Not in fruit basket");
        }

        // Exercise 3

        class Calculator {
            public void run() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input your first argument:");
                int arg1 = scanner.nextInt();
                System.out.println("Input your second argument:");
                int arg2 = scanner.nextInt();
                System.out.println("Input the operator:");
                String op = scanner.next();
                int result = 0;
                boolean legal = true;
                switch (op) {
                    case "+":
                        result = addition(arg1, arg2);
                        break;
                    case "-":
                        result = subtraction(arg1, arg2);
                        break;
                    case "*":
                        result = multiplication(arg1, arg2);
                        break;
                    case "/":
                        result = division(arg1, arg2);
                        break;
                    case "%":
                        result = modulus(arg1, arg2);
                        break;
                    default:
                        legal = false;
                        System.out.println("Unsupported Operations");

                }
                if (legal) {
                    System.out.println("Result is: " + result);
                }
            }

            private int addition(int arg1, int arg2)
            {
                return arg1 + arg2;
            }

            private int subtraction(int arg1, int arg2) {
                return arg1 - arg2;
            }

            private int multiplication(int arg1, int arg2) {
                return arg1 * arg2;
            }

            private int division(int arg1, int arg2) {
                return arg1 / arg2;
            }

            private int modulus(int arg1, int arg2) {
                return arg1 % arg2;
            }
        }

        Calculator c = new Calculator();

        c.run();


        // Exercise 4
        for (int i = 0; i < 7; i++) {
            String line = "";
            for (int j = i + 1; j > 0; j--) {
                line += "*";
            }
            System.out.print(line + "\n");
        }

    }
}
