package MinefieldProject;

public class Main {
    public static void main(String[] args) {
        //MineSweeper mineSweeper = new MineSweeper(2, 2);
        //mineSweeper.run();
        int a = 5; 
        int b = 9; 
        int c = 0; 
        if (a > b) { 
          c = a; 
          a = b; 
          b = c; 
        } 
        System.out.println(b + "," + a); 
    }
}
