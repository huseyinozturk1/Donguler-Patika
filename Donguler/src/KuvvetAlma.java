import java.util.Scanner;
public class KuvvetAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Bir Sınır Aralığı Giriniz: ");
        n = input.nextByte();;

            for (int i =1; i<=n; i *=4){
                System.out.println("Girilen Sayıdan az olan 4'ün katları: " + i);
            }
        System.out.println("----------------------");
            for (int j= 1; j<=n; j*=5){

                System.out.println("Girilen Sayıdan az olan 5'in katları: " + j);
            }

    }
}
