package guia9.servicios;

import guia9.entidades.E1_Cadena;
import java.util.Scanner;

/*
Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:

1-Método mostrarVocales(): deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    
2-Método invertirFrase(): deberá invertir la frase ingresada y mostrarla por pantalla. 
    Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    
3-Método vecesRepetido(): recibirá un carácter ingresado por el usuario y contabilizar 
    cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    
4-Método compararLongitud(): deberá comparar la longitud de la frase que compone la 
    clase con otra nueva frase ingresada por el usuario.
    
5-Método unirFrases(): deberá unir la frase contenida en la clase Cadena con una 
    nueva frase ingresada por el usuario y mostrar la frase resultante. USAR CONCAT
    
6-Método reemplazar(): deberá reemplazar todas las letras “a” que se encuentren en la frase, 
    por algún otro carácter seleccionado por el usuario y mostrar la frase resultante. USAR REPLACE
    
7-Método contiene(): deberá comprobar si la frase contiene una letra que ingresa el 
    usuario y devuelve verdadero si la contiene y falso si no.
*/
public class E1_CadenaServicio {
    public E1_Cadena crearFrase(Scanner leer){
        E1_Cadena f = new E1_Cadena();
        
        String frase;
        do {
            System.out.printf("Ingresa una frase de max %d longitud %n", f.getLongitud());
            frase = leer.nextLine();
        } while (frase.length() > f.getLongitud());
        f.setFrase(frase);
        
        return f;
    }
    
    public int mostrarVocales(E1_Cadena f){
        int acu = 0;
        for (int i = 0; i < (f.getFrase().length()); i++) {
            char l = f.getFrase().charAt(i);
            if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
                acu++;
            }
        }
        return acu;
    }
//    Método invertirFrase(): deberá invertir la frase ingresada y mostrarla por pantalla. 
//    Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirFrase(E1_Cadena f){
        String c = "";
        for (int i = f.getFrase().length() -1; i >= 0; i--) {
            c += f.getFrase().charAt(i);
        }
        System.out.println("***Frase invertida***\n"+c);
    }
    
//    Método vecesRepetido(): recibirá un carácter ingresado por el usuario y contabilizar 
//    cuántas veces se repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public int vecesRepetido(E1_Cadena f, char c){
        int acu = 0;
        for (int i = 0; i < (f.getFrase().length()); i++) {
            if (c == f.getFrase().charAt(i)) {
                acu++;
            }
        }
        return acu;
    }
    
//    Método compararLongitud(): deberá comparar la longitud de la frase que compone la 
//    clase con otra nueva frase ingresada por el usuario.
    public boolean compararLongitud(E1_Cadena f, String f2){
        return f2.length() == f.getFrase().length();
    }
    
//    Método unirFrases(): deberá unir la frase contenida en la clase Cadena con una 
//    nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(E1_Cadena f, String f2){
        System.out.println("***Frase unida***\n" + f.getFrase() + f2);
    }
    
//    Método reemplazar(): deberá reemplazar todas las letras “a” que se encuentren en la frase, 
//    por algún otro carácter seleccionado por el usuario y mostrar la frase resultante. USAR REPLACE
      public void reemplazar(E1_Cadena f, char c){
          System.out.println("***Frase remplazada***\n" + f.getFrase().replace('a', c));
      }
      
//    Método contiene(): deberá comprobar si la frase contiene una letra que ingresa el 
//    usuario y devuelve verdadero si la contiene y falso si no.
      public boolean contiene(E1_Cadena f, char c){
          return f.getFrase().contains(String.valueOf(c));
      }
}
