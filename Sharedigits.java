public class Test {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 63));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 23));
    }
public static boolean hasSharedDigit(int firstValue, int secondValue) {
        if (firstValue < 10 || firstValue > 99 || secondValue < 10 || secondValue > 99) {
            return false;
        }
    int firstValueFirstDigit = firstValue % 10;
        int secondValueFirstDigit = secondValue % 10;
        firstValue /= 10;
        secondValue /= 10;
        int firstValueLastDigit = firstValue % 10;
        int secondValueLastDigit = secondValue % 10;
        return firstValueFirstDigit == secondValueLastDigit || firstValueFirstDigit == secondValueFirstDigit
                || firstValueLastDigit == secondValueFirstDigit || firstValueLastDigit == secondValueLastDigit;
    }
}
