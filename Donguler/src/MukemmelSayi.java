import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);
        int n, total = 0;
        System.out.print("Bir Sayı Giriniz: ");
        n = sayi.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                total += i;

            }
        }
            if ( total == n){
               System.out.println(n + " Bir Mükemmel Sayıdır.");

            }else {
                System.out.println(n+ " Bir Mükemmel Sayı Değildir.");
            }
        }
    }

