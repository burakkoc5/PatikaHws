import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[] args) {
        int day,month;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Dogum dayunuzu Giriniz:");
        day= scanner.nextInt();
        System.out.println("Dogum monthinizi Giriniz:");
        month= scanner.nextInt();

        if ((day>=21 && day<=31 && month==3) || (day>=1 && day<=20) && month==4){
            System.out.println("Burcunuz Koc");
        }
        else if ((day>=21 && day<=30 && month==4) || (day>=1 && day<=21) && month==5){
            System.out.println("Burcunuz Boga");
        }
        else if ((day>=22 && day<=31 && month==5) || (day>=1 && day<=22) && month==6){
            System.out.println("Burcunuz Ikizler");
        }
        else if ((day>=23 && day<=30 && month==6) || (day>=1 && day<=22) && month==7){
            System.out.println("Burcunuz Yengec");
        }
        else if ((day>=23 && day<=31 && month==7) || (day>=1 && day<=22) && month==8){
            System.out.println("Burcunuz Aslan");
        }
        else if ((day>=23 && day<=31 && month==8) || (day>=1 && day<=22) && month==9){
            System.out.println("Burcunuz Basak");
        }
        else if ((day>=23 && day<=30 && month==9) || (day>=1 && day<=22) && month==10){
            System.out.println("Burcunuz Terazi");
        }
        else if ((day>=23 && day<=31 && month==10) || (day>=1 && day<=22) && month==11){
            System.out.println("Burcunuz Akrep");
        }
        else if ((day>=22 && day<=30 && month==11) || (day>=1 && day<=21) && month==12){
            System.out.println("Burcunuz Ymonth");
        }
        else if ((day>=22 && day<=31 && month==12) || (day>=1 && day<=21) && month==1){
            System.out.println("Burcunuz Oglak");
        }
        else if ((day>=22 && day<=31 && month==1) || (day>=1 && day<=19) && month==2){
            System.out.println("Burcunuz Kova");
        }
        else if ((day>=20 && day<=28 && month==2) || (day>=1 && day<=20) && month==3){
            System.out.println("Burcunuz Balik");
        }

        scanner.close();
    }
}
