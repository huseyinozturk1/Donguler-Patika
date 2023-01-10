import java.util.Scanner;
public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,total=1,r,total1=1,k,c,total2=1;
        System.out.print("Kobinasyon SAyısını Giriniz: ");
        n = input.nextByte();
        System.out.print("Kaçlı Kobinasyonunu İstiyorsunuz: ");
        r= input.nextInt();
        k = n-r;
        for (int i =1 ; i<=n; i++){
            total = total*i;

        }
        for (int j=1; j<= r;j++){
            total1= total1*j;
        }
        for (int s=1; s<=k;s++){
            total2=total2*s;
        }
        c = total/(total1*total2);
        System.out.print("Kombinasyon Sonucunuz: " + c);

    }
}
