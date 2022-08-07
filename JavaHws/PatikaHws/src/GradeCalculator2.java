import java.util.ArrayList;
import java.util.Scanner;

public class GradeCalculator2 {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik,total=0;
        ArrayList<Integer> grades = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        mat = scanner.nextInt();
        grades.add(mat);
        System.out.println("Fizik notunuz : ");
        fizik = scanner.nextInt();
        grades.add(fizik);
        System.out.println("Turkce notunuz : ");
        turkce = scanner.nextInt();
        grades.add(turkce);
        System.out.println("Kimya notunuz : ");
        kimya = scanner.nextInt();
        grades.add(kimya);
        System.out.println("Muzik notunuz : ");
        muzik = scanner.nextInt();
        grades.add(muzik);

        int count =0;

        for (int i = 0; i < grades.size(); i++) {
            if ((grades.get(i) < 0 || grades.get(i) > 100 )) {
                
            }
            else{
                total+=grades.get(i);
                count++;
            }
        }


        double averageGrade = total/count;

        if (averageGrade<=55) {
            System.out.println("Sinifta kaldiniz. Seneye tekrar gorusmek uzere!");
        } else {
            System.out.println("Tebrikler, sinifi gectiniz !");
        }
        System.out.println("Ortalamaniz: " + averageGrade);
        scanner.close();
        
    }
}
