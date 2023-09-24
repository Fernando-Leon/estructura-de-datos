import javax.swing.JOptionPane;

public class Solucion1 {

    private boolean esPrimo(int numero, int divisor) {
        if (numero <= 1) { return false; }
        if (divisor <= 1) { return true; }
        if (numero % divisor == 0) { return false; }
        return esPrimo(numero, divisor - 1);
    }

    public int contarPrimos() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor del numero"));
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas ingresar otro número?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (esPrimo(numero, numero - 1)) {
            if (respuesta == JOptionPane.YES_OPTION) { return 1 + contarPrimos(); } 
            else { return 1; }
        } else {
            if (respuesta == JOptionPane.YES_OPTION) { return contarPrimos(); } 
            else { return 0; }
        }
    }
}
