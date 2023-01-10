import java.util.Scanner;

public class UsluSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,total=1;
        System.out.print("Üssü Alıncak Sayı: ");
        a = input.nextInt();
        System.out.print("Üs olacak sayı: ");
        b = input.nextInt();
        for (int i = 1; i<=b; i++ ){

           total *= a;
        }
        System.out.println("Cevap: " + total);
    }
}
