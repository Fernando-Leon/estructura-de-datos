package EjericiosPreExamen.Ejercicio4;

public class Solucion1 {
    
    public double SumaCuadrados(int n) {
        if(n == 0) {
            return 0;
        }
        else {
            return Math.pow(n, 2) + SumaCuadrados(n-1);
        }
    }
}
