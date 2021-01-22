public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        int firstDigit = 0, lastDigit;

        if (number >= 0) {
            lastDigit = number % 10;
            while (number != 0) {
                firstDigit = number;
                number /= 10;
            }
            return (firstDigit + lastDigit);
        } else {
            return -1;
        }
    }

}