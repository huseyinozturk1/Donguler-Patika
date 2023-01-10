import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Bir Sayı Giriniz: ");
        n = input.nextInt();

        for (int l = 0; l <= n; l++) {
            for (int z = 1; z <= l; z++) {
                System.out.print(" ");
            }
            for (int m = (2 * n) - 1; m >= (2 * l) + 1; m--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
