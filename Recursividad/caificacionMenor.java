import javax.swing.JOptionPane;

public class caificacionMenor {
    
    public static void main(String[] args) {
        System.out.println(calificacionMenor(1000));
    }

    public static double calificacionMenor(double menor){
        double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificación"));

        if (calificacion < menor) {
            menor = calificacion;
        }

        int ask = JOptionPane.showConfirmDialog(null, "¿Deseas ingresar una nueva calificación?");

        if(ask == 0){
            return calificacionMenor(menor);
        }else {
            return menor;
        }
    }
}
