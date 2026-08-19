import java.util.*;
public class Main {
    private static final String MODULE = "RetryHandler_154d79";
    public static long fibonacci(int n) { if (n <= 1) return n; long a = 0, b = 1; for (int i = 2; i <= n; i++) { long tmp = a + b; a = b; b = tmp; } return b; }
    public static void main(String[] args) { System.out.println("[" + MODULE + "] Computing fibonacci:"); for (int n : new int[]{5, 10, 20, 30, 40}) { System.out.printf("  fib(%d) = %d%n", n, fibonacci(n)); } }
}
