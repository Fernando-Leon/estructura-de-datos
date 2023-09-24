
public class Solucion1 {
    
    private int plus = 0;
    private int count = 0;

    public String SumaNumeroImpares(double start, double end) {
        if(start > end){
            return "La cantidad de numero impares es de: " + plus + "\n Y la cantidad de estos es: " + count;
        }
        if(start%2 != 0){
            plus += start;
            count++;
        }
        return SumaNumeroImpares(start+1, end);
    }
}
