package guia11.entidades;

/*

*/
public class EE2_Asiento {
    private int num;
    private char letra;
    private boolean ocupado;

    public EE2_Asiento() {
    }

    public EE2_Asiento(int num, char letra) {
        this.num = num;
        this.letra = letra;
        this.ocupado = false;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "" + num + letra + (ocupado ? "X" : " ");
    }
    
    
}
