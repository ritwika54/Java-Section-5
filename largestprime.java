public class largestprime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(1000));
        System.out.println(getLargestPrime(25));
        
    }

    public static int getLargestPrime(int number) {
        if(number <= 1) {
            return -1;
        }

        int i;

        for(i = 2; i < number; i++) {
            if(number % i == 0) {
                number /= i;
                i--;
            }
        } return i;
    }
}
