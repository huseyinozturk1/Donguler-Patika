import java.util.Scanner;
public class TekCift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,bolunen=0;
        double ortalama=0;

        System.out.print("Bir Sayı Giriniz: ");
        sayi = input.nextInt();

        for (int i=0; i<= sayi; i++){
            if((i%3==0) && (i%4==0)){
                System.out.println(i);
                ortalama +=i;
                bolunen++;
            }
        }

        System.out.println("3 ve 4'e Bölünen Sayıların ortalaması: "+ (ortalama/bolunen));
    }
}
