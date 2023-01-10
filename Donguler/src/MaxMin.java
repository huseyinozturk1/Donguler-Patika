import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,n1;
        int max = 0, min =0;
        System.out.print("Kaç Tane Sayı Gireceksiniz: ");
        n = input.nextInt();

        for (int i=1; i<=n;i++){

            System.out.print(i + ". Sayıyı Giriniz: ");
             n1 = input.nextByte();

             if(n1>max){
                 max =n1;
             }
             if (n1<min){
                 min=n1;
             }
        }
        System.out.println("En Büyük Sayı: " + max);
        System.out.print("En Küçük Sayı: "+ min);
    }
}
