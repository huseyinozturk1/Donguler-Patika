import java.util.Scanner;
public class DortunKati {
    public static void main(String[] args) {
        Scanner deger =new Scanner(System.in);
        int sayi,toplam=0;

        do {
            System.out.print("Bir Sayı Giriniz: ");
            sayi = deger.nextInt();

            if (sayi % 4 ==0){
                toplam+=sayi;
            }
        }while (sayi % 2 !=1);
        System.out.println("4'ün Katı olan sayıların toplamı: " + toplam);
    }
}
