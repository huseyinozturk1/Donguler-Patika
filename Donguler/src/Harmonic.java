import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total=0;
        int n;
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

            for (int i=1; i<=n; i++ ){

                total += 1.0/i;

            }
        System.out.print("Harmonic Sonuc: "+ total );

    }
}
