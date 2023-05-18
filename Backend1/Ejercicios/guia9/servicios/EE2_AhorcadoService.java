package guia9.servicios;

import guia9.entidades.EE2_Ahorcado;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.InsetsUIResource;

/*
Definir los siguientes métodos en AhorcadoService:
    
1-Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
    Con la palabra del usuario, pone la longitud de la palabra, como la longitud 
    del vector. Después ingresa la palabra en el vector, letra por letra, quedando 
    cada letra de la palabra en un índice del vector. Y también, guarda la cantidad 
    de jugadas máximas y el valor que ingresó el usuario.
    
2-Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
    Nota: buscar como se usa el vector.length.
    
3-Método buscar(letra):  este método recibe una letra dada por el usuario y busca si 
    la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    
4-Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre 
    cuantas letras han sido encontradas y cuántas le faltan. Este método además deberá 
    devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez 
    que se busque una letra que no esté, se le restará uno a sus oportunidades.
    
5-Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
    
6-Método juego(): el método juego se encargará de llamar todos los métodos previamente 
    mencionados e informará cuando el usuario descubra toda la palabra o se quede sin 
    intentos. Este método se llamará en el main.
 */
public class EE2_AhorcadoService {

    public EE2_Ahorcado crearJuego(JPasswordField pwd, Scanner leer) {
        EE2_Ahorcado a = new EE2_Ahorcado();
        UIManager.put("OptionPane.background", new Color(32, 139, 223));//color del borde de la ventana
        UIManager.put("Panel.background", new Color(32, 139, 223));//color del fondo de la ventana
        UIManager.put("OptionPane.minimumSize", new Dimension(500, 500));//tamaño minimo de la ventana

        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 40);//fuente general.
        UIManager.put("OptionPane.messageFont", font);//fuente a los mensajes.
        UIManager.put("OptionPane.buttonFont", font);//fuente a los botones.
        
        UIManager.put("TextField.font", new FontUIResource(new Font("SansSerif",Font.BOLD,30)));//aumentar tamaño input.
        UIManager.put("TextField.margin",  new InsetsUIResource(0,0,0,-100));

        do {
            pwd.setFont(font);//aumentar tamaño input.
            JOptionPane.showConfirmDialog(null, pwd, "Palabra a buscar:", JOptionPane.CLOSED_OPTION);
            a.setPalabraABuscar(pwd.getPassword());
        } while (pwd.getPassword().length == 0);

        return a;
    }

    public int longitud(EE2_Ahorcado a) {
        return a.getPalabraABuscar().length;
    }

//    3-Método buscar(letra):  este método recibe una letra dada por el usuario y busca si 
//    la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    public boolean buscar(EE2_Ahorcado a, String l) {
        if (l == null) {
            return false;
        }
        if (l.length() == 0) {
            return false;
        }

        return (String.valueOf(a.getPalabraABuscar()).indexOf(l)) != -1;
    }

//    4-Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre 
//    cuantas letras han sido encontradas y cuántas le faltan. Este método además deberá 
//    devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez 
//    que se busque una letra que no esté, se le restará uno a sus oportunidades.
    public boolean encontradas(EE2_Ahorcado a, String l) {
        if (buscar(a, l)) {
            String letEncon = new String(a.getPalabraABuscar()).replaceAll("(?i)[^" + l + "]", "");

            a.setCantLetrasEncon(a.getCantLetrasEncon() + letEncon.length());

            String msg = longitud(a) == a.getCantLetrasEncon()
                    ? "Felicidades!! Ganaste.\n"
                    + "Te restaron " + intentos(a) + " intentos."
                    + "\n No te fuiste a la b."
                    : "La letra |" + l + "| fue encontrada " + letEncon.length() + (letEncon.length() > 1 ? " veces." : " vez.")
                    + "\n\nEncontraste " + a.getCantLetrasEncon() + " en total, restan " + (longitud(a) - a.getCantLetrasEncon()) + ".";

            JOptionPane.showMessageDialog(null, msg);

        } else {
            a.setCantJugadasMaximas(intentos(a) - 1);

            String msg = intentos(a) == 0 ? "Perdiste, te fuiste a la b.\n" + a.getFases(intentos(a)) : "Le erraste, te quedan " + intentos(a) + " oportunidades.\n " + a.getFases(intentos(a));

            JOptionPane.showOptionDialog(null, msg, "Si pierdes te vas a la b", JOptionPane.CLOSED_OPTION, 0, null, null, 0);

        }

        return buscar(a, l);
    }

//5-Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
    public int intentos(EE2_Ahorcado a) {
        return a.getCantJugadasMaximas();
    }

//Método juego(): el método juego se encargará de llamar todos los métodos previamente 
//    mencionados e informará cuando el usuario descubra toda la palabra o se quede sin 
//    intentos. Este método se llamará en el main.
    public void juego(EE2_Ahorcado a, Scanner leer) {
        JOptionPane.showMessageDialog(null, "Comienza el juego");

        do {
            encontradas(a, JOptionPane.showInputDialog(null, "Letra a buscar"));
        } while (intentos(a) != 0 && a.getCantLetrasEncon() != longitud(a));

    }
}
