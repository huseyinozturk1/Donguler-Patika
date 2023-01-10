import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,number1 =0, number2 =1;

        System.out.print("Fibonacci Sayısını Giriniz: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print(number1+ " ");
            int total= number1+number2;
            number1=number2;
            number2=total;


        }
    }
}
