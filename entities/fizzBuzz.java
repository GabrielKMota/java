package entities;

import java.util.Vector;

/* Foi recomendado não criar a main */

public class fizzBuzz {
    public static Vector<String> fizzbuzz(int n){
        Vector<String> result = new Vector<>();
        for (int i = 1; i <= n; i++){
            if (i%15==0){
                result.add("FizzBuzz");
            }else if (i%5==0){
                result.add("Buzz");
            } else if (i%3==0){
                result.add("Fizz");
            }else {
                result.add(i+"");
            }
        }
        return result;
    }
}
