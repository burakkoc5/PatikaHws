import java.util.Scanner;

public class GroceryCheckout {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5;
        double total = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Armut kaç kilo ?  :");
        total += armut*scanner.nextDouble();
        System.out.println("Elma kaç kilo ?  :");
        total += elma*scanner.nextDouble();
        System.out.println("Domates kaç kilo ?  :");
        total += muz*scanner.nextDouble();
        System.out.println("Muz kaç kilo ?  :");
        total += domates*scanner.nextDouble();
        System.out.println("Patlican kaç kilo ?  :");
        total += patlican*scanner.nextDouble();
        //total = total + armut +elma +domates +patlican +muz;
        System.out.println("Toplam tutar : " + total  + " TL");
        scanner.close();
    }
}
