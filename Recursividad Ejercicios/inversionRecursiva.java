public class inversionRecursiva {
    
    public static void main(String[] args) {
        System.out.println(inversionRecursivaF(10, 12, 2));
    }

    public static double inversionRecursivaF(double inversion, int meses, double porcentaje) {

        if(meses == 0) {
            return inversion;
        }else {
            return inversionRecursivaF(inversion+(inversion * (porcentaje/100)), meses-1, porcentaje);
        }
    }
}
