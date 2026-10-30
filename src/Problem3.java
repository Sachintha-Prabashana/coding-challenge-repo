public class Problem3 {
    public static void main(String[] args) {
        int n = 100;
        fibonacciSeries(n);
    }

    public static void fibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print("First " + n + " Fibonacci numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

}
