public class IsPalindrom {
    
    
    public static boolean isPalindrom(int number){
        int temp = number;
        int reverse = 0;
        int lastNumber;

        while(temp != 0){
            //System.out.println("Sayi : " + temp);
            lastNumber = temp%10;
            //System.out.println("SOn basamak : " + lastNumber);
            reverse = (reverse*10) + lastNumber;
            temp/=10;
        }

        if(number==reverse){
            return true;
        }
        return false;

    }
    
    
    
    public static void main(String[] args) {
        if(isPalindrom(2476)){
            System.out.println("Sayı polindrom");
        }
        else{
            System.out.println("Sayı polindrom değil" );
        }
    } 



}
