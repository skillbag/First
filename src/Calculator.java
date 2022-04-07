import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Введите выражение:");
            Scanner scanner = new Scanner(System.in);
            int operand1 = scanner.nextInt();
            char ch = scanner.next().charAt(0);
            int operand2 = scanner.nextInt();


            switch (ch) {
                case '+':                bb(operand1, operand2);
                    break;
                case '-':
                    dd(operand1, operand2);
                    break;
                case '*':
                    cc(operand1, operand2);
                    break;
                case '/':
                    ff(operand1, operand2);
                    break;
            }
        }
    }
         public static void bb ( int operand1, int operand2) {
                 int sum = operand1 + operand2;
            System.out.println("Otvet:" + sum);
    }


         public static void dd ( int operand1, int operand2) {
                 int sum = operand1 - operand2;
            System.out.println("Otvet:" + sum);
    }
         public static void cc ( int operand1, int operand2) {
                 int sum = operand1 * operand2;
            System.out.println("Otvet:" + sum);
    }

         public static void ff ( int operand1, int operand2) {
             if (operand2 == 0) {
                System.out.println("Na noll delit nelza");
             } else {
                 int sum = operand1 / operand2;
                System.out.println("Otvet" + sum);
             }
        }
    }

