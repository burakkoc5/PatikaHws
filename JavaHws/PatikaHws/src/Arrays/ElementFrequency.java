package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public interface ElementFrequency {

    public static boolean isFind(Map<Integer,Integer> arr, int value){
        
            if (arr.containsKey(value)) {
                return true;
            }
        

        return false;
    }

    
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " + Arrays.toString(numbers));
        System.out.println("Tekrar Sayıları");

        Map<Integer,Integer> frequency = new HashMap<>();
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            count = 1;
            for (int j = 0; j < numbers.length; j++) {
                if (i!=j && numbers[i]==numbers[j]) {
                    count++;
                }
                
            }
            if (!isFind(frequency, numbers[i])) {
                frequency.put(numbers[i], count);
            }
        }
        
        for (Map.Entry<Integer,Integer> entry : frequency.entrySet()) {
            System.out.println(+ entry.getKey() +
                             " sayisi " + entry.getValue() + " kere tekrar edildi.");
        }






    }   
}
