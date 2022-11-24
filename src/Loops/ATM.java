package Loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName,password;

        int select,left = 3,balance = 1500;
        int price;


        while(left>0){
            System.out.print("Kullanıcı adınızı giriniz: ");

            userName = sc.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = sc.nextLine();
            if((userName.equals("12345")) && (password.equals("hzxry"))){
                System.out.println("Giriş başarılı.");
                do{
                System.out.println("Bakiyeyi görüntülemek için 1\n" +
                                  "Para çekmek için 2\n" +
                                  "Para yatırmak için 3\n" +
                                  "Çıkış yapmak için 4'ü tuşlayınız.");

                select = sc.nextInt();

                switch (select){
                    case 1:
                        System.out.println("Bakiyeniz: "+balance);
                        break;
                    case 2:
                        System.out.println("Çekmek istediğiniz miktarı giriniz.");
                        price = sc.nextInt();

                        if(price>balance){
                            System.out.println("Hesabınızda yeterli bakiye bulunmamaktadır.");
                        } else{
                            balance -= price;
                            System.out.println("Kalan bakiye: "+balance);
                        }
                        break;
                    case 3:
                        System.out.println("Yatırmak istediğiniz tutarı giriniz.");
                        price = sc.nextInt();
                           balance += price;
                        System.out.println("İşleminiz tamamlandı.Bakiye: "+balance);
                        break;
                    case 4:
                        System.out.println("Çıkış yapılıyor...");
                        break;
                    default:
                        System.out.println("Hatalı tuşlama. Tekrar deneyiniz.");
                }

                }
                while(select!=4);

                break;

            }
            else{
                left--;
                if(left==0){
                    System.out.println("3 defa yanlış giriş yaptığınız için hesabınız bloke olmuştur.");
                }
                else{
                    System.out.println("Kullanıcı adı veya şifre hatalı.Kalan hak: "+left);
                }
            }
        }

    }
}
