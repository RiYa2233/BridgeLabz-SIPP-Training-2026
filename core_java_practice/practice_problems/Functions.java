package practice_problems;

public class Functions {

    int instanceVar = 100;

    boolean isPrime(int n) {
        for(int i = 2; i < n; i++)
            if(n % 2 == 0) return false;
        return n > 1;
    }


}
