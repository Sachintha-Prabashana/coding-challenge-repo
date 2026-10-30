public class Problem1 {
    public static void main(String[] args) {
        int[] numbers = {10, 2, 30, 4, 50};
        System.out.println("Sum using for loop: " + calculateSumUsingForloop(numbers));
        System.out.println("Sum using while loop: " + calculateSumUsingWhileLoop(numbers));
        System.out.println("Sum using recursion: " + calculateSumUsingRecursion(numbers));
    }

    public static int calculateSumUsingForloop(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int calculateSumUsingWhileLoop(int[] numbers) {
        int sum = 0;
        int i = 0;
        while (i < numbers.length) {
            sum += numbers[i];
            i++;
        }
        return sum;
    }

    public static int calculateSumUsingRecursion(int[] numbers) {
        int sum = calculateSumRecursiveHelper(numbers, 0);
        return sum;
    }

    private static int calculateSumRecursiveHelper(int[] numbers, int index) {
        if (index >= numbers.length) {
            return 0;
        }
        return numbers[index] + calculateSumRecursiveHelper(numbers, index + 1);
    }
}

