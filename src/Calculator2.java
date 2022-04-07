import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение (например: 3 + 2):");
        int a = sc.nextInt();
        char ch = sc.next().charAt(0);
        int b = sc.nextInt();
        switch (ch) {
            case '+':
                jia(a, b);
                break;
            case '-':
                jian(a, b);
                break;
            case '*':
                cheng(a, b);
                break;
            case '/':
                chu(a, b);
                break;
            default:
                System.out.println("Ошибка ввода");;
                break;
        }
    }

    public static void cheng(int a, int b) {
        int sum = a * b;
        System.out.println("Произведение двух чисел:" + sum);
    }

    public static void jian(int a, int b) {
        int sum = a - b;
        System.out.println("Разница между двумя числами:" + sum);
    }

    public static void chu(int a, int b) {
        if (b==0) {
            System.out.println("Делитель не может быть нулем ~");
        } else {
            int sum = a / b;
            System.out.println("Коэфициент двух чисел:" + sum);
        }
    }

    public static void jia(int a, int b) {
        int sum = a + b;
        System.out.println("Сумма двух чисел:" + sum);
    }
}

