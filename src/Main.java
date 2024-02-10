import clase.Persona;
import clase.TablaPronostico;

public class Main {
    public static void main(String[] args) {
    /*    Persona[] personas = new Persona[3];
        personas[0] = new Persona("juan", 20);
        personas[1] = new Persona("maria", 26);
        personas[2] = new Persona("pedro", 29);
        for (Persona persona: personas){
            System.out.println(persona);
        }*/

      /*  Persona[][] matrix = new Persona[2][2];
        matrix[0][0] = new Persona("Juan", 20);
        matrix[0][1] = new Persona("maria", 26);
        matrix[1][0] = new Persona("pedro", 29);
        matrix[1][1] = new Persona("pedro", 29);
        for (Persona[] fila : matrix) {
            for (Persona persona : fila) {
                System.out.println(persona);
            }
        }*/
        TablaPronostico tabla = new TablaPronostico();
        tabla.calculos();
    }
}