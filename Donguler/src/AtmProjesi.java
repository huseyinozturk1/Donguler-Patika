import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName,password;
        int right =3,balance = 1500,select;
        int money;

        while (right > 0){

            System.out.print("Kullanıcı Adınızı Giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi Giriniz: ");
            password = input.nextLine();
            if(userName.equals("patika") && password.equals("dev123") ) {
                System.out.println("Merhaba Kodluyoruz Bankasına Hoş Geldiniz.");
                do {

                    System.out.println("1-Para Yatırma\n2-Para Çekme \n3-Bakiye Sorgulma \n4-Çıkış Yapma");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz:");
                    select = input.nextInt();
                    System.out.println("");



                    switch (select) {

                        case 1:
                            System.out.print("Yatıracağınız Miktarı Giriniz: ");
                            money = input.nextInt();
                            balance += money;
                            System.out.println("Hesabınıza Yatırılan Miktar: " + money);
                            System.out.println("");
                            break;

                        case 2:
                            System.out.print("Çekmek İstediğinizi Miktarı Giriniz: ");
                            money = input.nextInt();
                            if (money <= balance && money > 0) {
                                balance -= money;
                                System.out.print("Hesabınızdan Çekilen Miktar: " + money);
                                System.out.println("");
                            } else {
                                System.out.println("Fazla Miktar Girdiniz. Tekrar Deneyiz!!");
                                System.out.println("");
                            }
                            break;
                        case 3:
                            System.out.print("Bakiyenizdeki Toplam Miktar: " + balance);
                            System.out.println("");
                            break;
                        default:
                            System.out.println("Yanlış Giriş Yaptınız!!");
                            System.out.println("");
                    }
                }
                    while (select != 4) ;
                    System.out.println("Sistemden Çıkış Yapılıyor!! Tekrar Bekleriz.");
                    break;
                }
                    else {
                     right--;
                         System.out.println("Hatalı Giriş Yaptınız Tekrar DEneyiniz:");
                            if (right ==0){
                             System.out.println("Hesabınız Bloke Olmuştur. Banka ile İletişime Geçiniz!!");
                }
                            else {
                                System.out.println("Kalan Hakkınız: " + right);

                }
            }
        }
    }
}
