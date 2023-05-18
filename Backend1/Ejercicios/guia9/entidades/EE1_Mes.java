package guia9.entidades;

import java.util.Arrays;
import java.util.Random;

/*
    Crea una clase en Java donde declares una variable de tipo array de 
    Strings que contenga los doce meses del año, en minúsculas. A continuación, 
    declara una variable mesSecreto de tipo String, y hazla igual a un 
    elemento del array (por ejemplo, mesSecreto = mes[9]. 
*/
public class EE1_Mes {
    private final String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto;

    public EE1_Mes() {
    }
    
    public EE1_Mes(Random rand) {
        this.mesSecreto = meses[rand.nextInt(12)];
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    @Override
    public String toString() {
        return "EE1_Mes{" + "meses=" + Arrays.toString(meses) + ", mesSecreto=" + mesSecreto + '}';
    }
    
    
    
}
