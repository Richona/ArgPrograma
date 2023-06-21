package guia11.entidades;

/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
*/
public class EP1_Dni {
    private char serie;
    private int num;

    public EP1_Dni() {
    }

    public EP1_Dni(char serie, int num) {
        this.serie = serie;
        this.num = num;
    }
    
    
    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    

    @Override
    public String toString() {
        return  "(serie=" + serie + ", num=" + num + ")";
    }

    
    
    
}
