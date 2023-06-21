package guia11.entidades;

/*

*/
public class E3_Carta {
    private Integer numero;
    private String tipo;

    public E3_Carta() {
    }

    public E3_Carta(String tipo, Integer numero) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "{" + numero + " de " + tipo + '}';
    }
    
    
    
}
