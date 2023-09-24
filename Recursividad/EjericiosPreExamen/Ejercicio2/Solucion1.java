package EjericiosPreExamen.Ejercicio2;

public class Solucion1 {
    private double c1 = 1,  c2 = 1;

    public double Serie(double n) {
        if (n == 0) {
            return 0;
        }else {
            double r = (c1/c2); 
            c1 *= 2;
            c2 *= 3;            
            return r + Serie(n-1);
        }
    }
}
