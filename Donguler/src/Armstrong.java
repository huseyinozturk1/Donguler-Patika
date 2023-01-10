import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,toplam=0;

        System.out.print("Bir Sayi Giriniz: ");
        a = input.nextInt();
        while (a != 0){
            toplam += (a % 10);
            a/=10;

        }
        System.out.println("Sayilarin toplamı: "+ toplam);
    }
}
