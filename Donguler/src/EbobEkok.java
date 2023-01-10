import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 değerini giriniz: ");
        int n1 = input.nextInt();
        System.out.print("n2 değerini giriniz: ");
        int n2 = input.nextInt();
        int i = 1, ebob = 1;

        if (n1 < n2) {
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.println("Ebob: " + ebob);

        } else {
            while (i <= n2) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.println("Ebob: " + ebob);
    }
        while (i <= (n1 * n2)) {
            if (n1 % i == 0 && n2 % i == 0) {
            }
            break;
        }
        System.out.println("Ekok: " + (n1 * n2) / ebob);

    }
}

