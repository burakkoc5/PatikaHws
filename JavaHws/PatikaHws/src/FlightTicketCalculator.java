import java.util.Scanner;

public class FlightTicketCalculator {
    public static void main(String[] args) {
        int distance, age, flightType;
        double normalPrice,ageDiscount=0,flightTypeDiscount=0,discountedPrice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz : ");
        distance = scanner.nextInt();
        
        System.out.println("Yasinizi giriniz : ");
        age = scanner.nextInt();
        
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidis Dönüs ): ");
        flightType = scanner.nextInt();

        if (distance>0 && age>0 && (flightType == 1 || flightType == 2)) {
            normalPrice = distance * 0.10;
            if (age<12) {
                ageDiscount = normalPrice * 0.5;
            }
            else if (age < 24) {
                ageDiscount = normalPrice * 0.1;
            }
            else if (age > 65) {
                ageDiscount = normalPrice * 0.3;
            }
            discountedPrice = normalPrice - ageDiscount;
            if (flightType==2) {
                flightTypeDiscount = discountedPrice * 0.20;
                discountedPrice-=flightTypeDiscount;
                discountedPrice*=2;
            }

            System.out.println("Toplam Tutar = " + discountedPrice + " TL");
        } 
        else {
            System.out.println("Hatali veri girdiniz !");
        }

        scanner.close();
        
    }
}
