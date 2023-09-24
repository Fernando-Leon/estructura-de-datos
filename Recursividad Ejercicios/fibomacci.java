import java.util.ArrayList;

public class fibomacci {
    
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fibonacciCiclo(n));
        ArrayList<Integer> serie = new ArrayList<>();
        serie.add(1);
        serie.add(1);
        ArrayList<Integer> seriefibonacci = fibonacciRecursivo(n, serie, 0);
        System.out.println(seriefibonacci);
    }

    public static String fibonacciCiclo(int n) {
        ArrayList<Integer> serie = new ArrayList<>();
        serie.add(1);
        serie.add(1);

        for (int i = 0; i < n-2; i++) {
            serie.add(serie.get(i) + serie.get(i+1));
        }

        return serie.toString();
    }

    public static ArrayList<Integer> fibonacciRecursivo(int n, ArrayList<Integer> serie, int index){
        if (serie.size() == n) {
            return serie;
        }
        else {
            serie.add(serie.get(index) + serie.get(index + 1));
            return fibonacciRecursivo(n, serie, index + 1);
        }
    }
}
