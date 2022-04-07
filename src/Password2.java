import java.util.Scanner;
public class Password2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vedite imy polzovately");
        String name = sc.nextLine();
        System.out.println("Sozdayte Parol");
        String pw = sc.nextLine();
        if (pw.length() < 8 || pw.length() > 15);
            do {
            System.out.println("Dlina paroly ne correctna");
        pw = sc.nextLine();
            } while (pw.length() < 8 || (pw.length() >15));
        System.out.printf("%s, vash novyi parol: %s", pw, name);
        }
}
