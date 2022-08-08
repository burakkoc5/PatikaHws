import java.util.Scanner;

public class AverageGradeCalculator {

	public static void main(String[] args) {
		int math, phys, chem, tur, hist, music;
		double averageGrade= 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insert your math grade: "); 
		math = scanner.nextInt();
		
		System.out.println("Insert your phys grade: "); 
		phys = scanner.nextInt();
		
		System.out.println("Insert your chem grade: "); 
		chem = scanner.nextInt();
		
		System.out.println("Insert your tur grade: "); 
		tur = scanner.nextInt();

		System.out.println("Insert your hist grade: "); 
		hist = scanner.nextInt();
		
		System.out.println("Insert your music grade: "); 
		music = scanner.nextInt();
		
		averageGrade += math + phys+ chem + tur + hist + music;
		averageGrade = averageGrade/6;
		
		System.out.println("Your average grade : " + averageGrade);
		
		if (averageGrade>60) {
			System.out.println("Passed the class");
		}
		else {
			System.out.println("Failed the class");
		}
		
		scanner.close();
	}

}
