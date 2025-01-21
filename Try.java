import java.util.Scanner;
import java.util.HashSet;

public class Main {
    
    public static boolean[] sieveOfEratosthenes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        for (int i = 0; i <= limit; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = isPrime[1] = false;
        
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input
        int n = sc.nextInt();
        long[] x = new long[n];
        
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
        }
        
        // Step 1: Find primes up to sqrt(10^12) = 10^6
        int limit = 1000000;
        boolean[] isPrime = sieveOfEratosthenes(limit);
        
        // Step 2: Precompute T-primes
        HashSet<Long> tPrimes = new HashSet<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                long tPrime = (long) i * i;
                tPrimes.add(tPrime);
            }
        }
        
        // Step 3: For each x, check if it is a T-prime
        for (long num : x) {
            if (tPrimes.contains(num)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}