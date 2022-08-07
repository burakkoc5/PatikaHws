import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName,password,newPassword;
        int select;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanici adiniz : ");
        userName = scanner.nextLine();

        System.out.println("Sifreniz :");
        password = scanner.nextLine();

        if (userName.equals("Burak") && password.equals("password") ){
            System.out.println("Basarili giris !");

        }
        else{
            System.out.println("Yanlis sifre girdiniz \n1-Sifre degistir\n2-Çikis yap");
            select=scanner.nextInt();

            if( select == 2){
                System.out.println("Çikis yapildi.");}

            else if (select == 1) {
                System.out.println("Lütfen yeni sifrenizi giriniz :");
                scanner.nextLine();
                newPassword=scanner.nextLine();

                if(newPassword.equals("password")){
                    System.out.println("Yeni sifreniz eskisi ile ayni olamaz");
                }
                else{
                    System.out.println("sifreniz basari ile degistirildi");
                    password = newPassword;

                }

            }
            else{
                System.out.println("Lütfen geçerli bir seçim yapiniz");

            }

        }

        scanner.close();
    }

    
}
