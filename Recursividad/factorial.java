public class factorial {
    public static int factorialR(int n) {
        if (n == 0) {
            return 1;
        }else {
            return n * factorialR(n-1);
        }
    }
    
    public static void main(String[] args) {
        int num = 10;
        int factorial = factorialR(num);
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
} 