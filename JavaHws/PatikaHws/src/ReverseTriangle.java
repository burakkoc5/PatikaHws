import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        int rowNumber;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Basamak sayisini giriniz: ");
        rowNumber = scanner.nextInt();

        int maxStarCount = 1+((rowNumber-1)*2);
        int rowSpaceCount = 0 ; //rowNumber-1;


        while (maxStarCount>=1) {
            for (int i = 0; i < rowSpaceCount; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < maxStarCount; i++) {
                System.out.print("*");
            }
            for (int i = 0; i < rowSpaceCount; i++) {
                System.out.print(" ");
            }
            System.out.println();

            maxStarCount-=2;
            rowSpaceCount++;

        }
        
        scanner.close();
    }
}
