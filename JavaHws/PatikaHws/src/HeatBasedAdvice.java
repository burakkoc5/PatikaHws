import java.util.Scanner;

public class HeatBasedAdvice {
    public static void main(String[] args) {
        double sicaklik;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hava siakligini giriniz:");
		sicaklik = scanner.nextDouble();
		
		if(sicaklik < 5)
			System.out.println("Kayak veya kartopu savasi yapabilirsiniz");
		else if(sicaklik <= 10)
			System.out.println("Sinemaya gidebilir veya kapali alanlardaki aktivitelere yönelebilirsiniz");
		else if(sicaklik <= 15)
			System.out.println("Ustunuzu iyi giydiginize eminseniz acik hava etkinligi zamani");
		else if(sicaklik <=25)
			System.out.println("Artik ne giydiginiz de onemli degil acik hava zamani");
        else if(sicaklik <=35)
			System.out.println("Bu havada da havuza gidilmez mi sence de ?");
		else
			System.out.println("Bu nasil sicaklik böyle dondum kaldim!");
        scanner.close();
    }
}
