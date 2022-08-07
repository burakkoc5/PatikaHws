import java.util.Scanner;

public class ChineseZodiacCalculator {
    public static void main(String[] args) {
        int birthYear;
        String zodiac="";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dogum yilinizi giriniz: ");
        birthYear = scanner.nextInt();
        if (birthYear<0) {
            System.out.println("Gecerli bir tarih giriniz!");
            System.exit(0);
        }
        int mod = birthYear%12;

        switch (mod) {
            case 0:
                zodiac = "Maymun";
                break;
            case 1:
                zodiac = "Horoz";
                break;
            case 2:
                zodiac = "Kopek";
                break;
            case 3:
                zodiac = "Domuz";
                break;
            case 4:
                zodiac = "Fare";
                break;
            case 5:
                zodiac = "Öküz";
                break;
            case 6:
                zodiac = "Kaplan";
                break;
            case 7:
                zodiac = "Tavsan";
                break;
            case 8:
                zodiac = "Ejderha";
                break;
            case 9:
                zodiac = "Yilan";
                break;
            case 10:
                zodiac = "At";
                break;
            case 11:
                zodiac = "Koyun";
                break;
            default:
                break;
        }


        System.out.println("Cin zodyagi burcunuz : " + zodiac);
        scanner.close();
    }
}
