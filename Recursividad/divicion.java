public class divicion {
    public static void main(String[] args) {
        int dividendo = 15;
        int divisor = 4;

        System.out.println("El resultado de dividir " + dividendo + " / " + divisor + " es: " +  divicionCiclo(dividendo, divisor));
        System.out.println("El resultado de dividir " + dividendo + " / " + divisor + " es: " +  divicionRecursiva(dividendo, divisor));

    }

    private static float divicionCiclo(float dividendo, float divisor) {
        float resultado = 0;

        for (float i = dividendo; i > divisor; i=i-divisor){
            resultado += 1;
        }
        return resultado;
    }
    
    public static float divicionRecursiva(float dividendo, float divisor){
        if(dividendo < divisor){
            return 0;
        }
        else{
            return 1 + divicionRecursiva(dividendo-divisor, divisor);
        }
    }
}
