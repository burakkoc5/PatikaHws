public class PrimeNumberFinder {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        
    }

    public static boolean isPrime(int n){

        int divider = 1;
        for (int i = 1; i < n; i++) {
            if (n%i == 0) {
                divider = i;
            }
        }

        if (divider == 1) {
            return true;
        } else {
            return false;
        }
    }
}
