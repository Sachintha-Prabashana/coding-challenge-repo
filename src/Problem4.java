import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        int [] numbers = {9, 2, 30, 4, 50};
        convertToLargestFormedNumber(numbers);

    }

    public static void convertToLargestFormedNumber(int[] numbers) {
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder largestNumber = new StringBuilder();
        for (String num : strNumbers) {
            largestNumber.append(num);
        }

        System.out.println("Largest formed number: " + largestNumber);
    }
}
