import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int a = -1;

        do {
            n = sc.nextInt();
            a++;
        } while (n != 0);
        System.out.println(a);
    }
}