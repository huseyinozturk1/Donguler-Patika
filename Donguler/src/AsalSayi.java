import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Bir Sayı Giriniz: ");
        n = input.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean asal = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal)
                System.out.print(i + ", ");


        }
    }
}
