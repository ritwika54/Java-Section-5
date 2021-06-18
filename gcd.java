public class Test {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 150));
        System.out.println(getGreatestCommonDivisor(50, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(15, 125));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        }

        int greatestDivisor = 0;

        for(int i = 1; i < first || i < second; i++) {

            if(first % i == 0 && second % i == 0) {
                greatestDivisor = i;
            }
        }

        return greatestDivisor;
    }
}
