package EjericiosPreExamen.Ejercicio3;

public class Solucion1 {
    
    private double c1 = 1, c2 = 2;

    public double Serie(int n) {
        if(n != 0) {
            double r = (1/c1) - (1/c2);
            c1++;
            c2++;
            return r + Serie(n-1);
        }
        return 0;
    }
}
