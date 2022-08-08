import java.util.Scanner;

public class AtmApp {
    public static void main(String[] args) {
        String userName, password;
        Scanner scanner = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanici Adiniz :");
            userName = scanner.nextLine();
            System.out.print("Parolaniz : ");
            password = scanner.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz!");
                do {
                    System.out.println("1-Para yatirma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çikis Yap");
                    System.out.print("Lütfen yapmak istediğiniz islemi seçiniz : ");
                    select = scanner.nextInt();
                    int price;

                    switch (select) {
                        case 1:
                            System.out.print("Para miktari : ");
                            price = scanner.nextInt();
                            balance += price; 
                            break;
                        case 2:
                            System.out.print("Para miktari : ");
                            price = scanner.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.print("Para miktari : ");
                            price = scanner.nextInt();
                            balance += price; 
                            break;
                    
                        default:
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüsmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur lütfen banka ile iletisime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkiniz : " + right);
                }
            }
        }
        scanner.close();
    }
}
