package entidades;

import constantes.Constantes;
import java.util.Random;
import java.util.Scanner;

/*

 */
public abstract class Empleado extends Persona {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();

    protected int anioIncorporacion, numDespacho;

    public Empleado() {
    }

    public Empleado(int anioIncorporacion, int numDespacho, String nombre, String apellido, String estadoCivil, int dni) {
        super(nombre, apellido, estadoCivil, dni);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "anioIncorporacion=" + anioIncorporacion + ", numDespacho=" + numDespacho + '}';
    }

    public void crearEmpleadoAuto() {
        super.crearPersonaAuto();

        anioIncorporacion = rand.nextInt(63) + 1961;

        do {
            numDespacho = rand.nextInt(Constantes.CANTIDADESPACHOS) + 1;
        } while (Constantes.NUMDESPACHOS.contains(numDespacho));

        Constantes.NUMDESPACHOS.add(numDespacho);
    }

    //• Reasignación de despacho a un empleado.
    public void reasignacionDespacho() {
        String msg = "*** REASIGNACION DE DESPACHO ***\n"
                + "Opciones disponibles: \n";

        int opc;

        for (int i = 0; i < Constantes.CANTIDADESPACHOS; i++) {
            if (Constantes.NUMDESPACHOS.contains(i + 1)) {
                continue;
            }

            switch (i) {
                case 20:
                case 40:
                case 60:
                case 80:
                case 100:
                    msg += (i + 1) + "\n";
                    break;
                default:
                    msg += (i + 1) + " ";
                    break;
            }

        }

        msg += "\nElija una opcion...";

        do {
            System.out.println(msg);
            opc = leer.nextInt();
        } while (opc < 1 || opc > Constantes.CANTIDADESPACHOS || Constantes.NUMDESPACHOS.contains(opc));

        Constantes.NUMDESPACHOS.remove(Constantes.NUMDESPACHOS.indexOf(numDespacho));
        Constantes.NUMDESPACHOS.add(opc);
        numDespacho = opc;
    }
}
