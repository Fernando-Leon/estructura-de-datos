public class multiplicacion {
    
    public static int multiplicacionCiclo(int n1, int n2) {
        int suma = 0;
        for (int i = 0; i < n1; i++) {
            suma += n2;
        }
        return suma;
    }

    public static void main(String[] args) {
        int n1 = 18;
        int n2 = 20;
        System.out.println("La muktiplicacion de: " + n1 + " * " + n2 + " es: " + multiplicacionCiclo(n1, n2));        
        System.out.println("La muktiplicacion de: " + n1 + " * " + n2 + " es: " + multiplicacionRecursiva(n1, n2));

    }

    public static int multiplicacionRecursiva(int n1, int n2) {

        if(n1 == 0){
            return 0;
        }
        else {
            return n2 + multiplicacionRecursiva(n1 - 1, n2);
        }
    }
}
