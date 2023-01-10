import java.util.Scanner;

public class ElmasYapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");

            }

            System.out.println();
        }
        for (int l = 1; l <= n; l++) {
            for (int z = 1; z <=l; z++) {
                System.out.print(" ");
            }
            for (int m = (2 * n) - 1; m >= (2 * l) + 1; m--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
