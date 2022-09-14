
package kosulluifadeler;
import java.util.Scanner;
public class Userlogin {
    public static void main(String[] args) {
            /* ÖDEV
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,eğer kullanıcı sıfırlamak isterse
        yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler
        aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan
        programı yazınız. */


        Scanner input = new Scanner(System.in);
        String userName = "patikadev";
        String password = "123456";
        byte select;
        String newPassword;

        System.out.println("Lütfen kullanıcı adınızı giriniz.");

        String unameInput = input.nextLine();

        System.out.println("Lütfen şifrenizi giriniz.");

        String passwordInput = input.nextLine();

        if(userName.equals(unameInput) && password.equals(passwordInput)) {
            System.out.println("Giriş başarılı.");
        } else if(!(passwordInput.equals(password)) && userName.equals(unameInput)) {
            System.out.println("Giriş başarısız. Şifrenizi sıfırlamak isterseniz: 1\n Çıkış yapmak isterseniz 2'yi tuşlayınız");
            select = input.nextByte();
            input.nextLine();

            switch(select){
                case 1:
                    System.out.print("Yeni şifrenizi giriniz.");
                    newPassword = input.nextLine();
                        if(newPassword.equals(passwordInput) || newPassword.equals(password)){
                            System.out.println("Şifre oluşturulamadı.");
                        }
                        else{
                            password = newPassword;
                            System.out.println("Şifreniz oluşturuldu.");
                        }
                        break;
                default:
                    System.out.println("Çıkış yapıldı.");

                }
            }
        else{
            System.out.println("Kullanıcı adı ve şifre yanlış.");
        }

        }



    }

