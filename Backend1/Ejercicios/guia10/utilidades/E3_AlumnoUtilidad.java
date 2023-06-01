package guia10.utilidades;

import guia10.entidades.E3_Alumno;
import java.util.Comparator;

/*

 */
public class E3_AlumnoUtilidad {

    public static Comparator<E3_Alumno> compararNombreAsc = new Comparator<E3_Alumno>() {
        @Override
        public int compare(E3_Alumno a1, E3_Alumno a2) {
            return a1.getNombre().compareTo(a2.getNombre());
        }
    };

    public static Comparator<E3_Alumno> compararNombreDesc = new Comparator<E3_Alumno>() {
        @Override
        public int compare(E3_Alumno a1, E3_Alumno a2) {
            return a2.getNombre().compareTo(a1.getNombre());
        }
    };
    
    public static Comparator<E3_Alumno> compararPromedioAsc = new Comparator<E3_Alumno>() {
        @Override
        public int compare(E3_Alumno a1, E3_Alumno a2) {
            double sumaA1 = 0;
            double sumaA2 = 0;
            Double promA1, promA2;
            
            for (int i = 0; i < a1.getNotas().size(); i++) {
                sumaA1 += a1.getNotas().get(i);
                sumaA2 += a2.getNotas().get(i);
            }
            
            promA1 = sumaA1 / a1.getNotas().size();
            promA2 = sumaA2 / a2.getNotas().size();
            
            return promA1.compareTo(promA2);
        }
    };
    
    public static Comparator<E3_Alumno> compararPromedioDesc = new Comparator<E3_Alumno>() {
        @Override
        public int compare(E3_Alumno a1, E3_Alumno a2) {
            double sumaA1 = 0;
            double sumaA2 = 0;
            Double promA1, promA2;
            
            for (int i = 0; i < a1.getNotas().size(); i++) {
                sumaA1 += a1.getNotas().get(i);
                sumaA2 += a2.getNotas().get(i);
            }
            
            promA1 = sumaA1 / a1.getNotas().size();
            promA2 = sumaA2 / a2.getNotas().size();
            
            return promA2.compareTo(promA1);
        }
    };

}
