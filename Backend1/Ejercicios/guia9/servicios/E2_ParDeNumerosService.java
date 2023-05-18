package guia9.servicios;

import guia9.entidades.E2_ParDeNumeros;

/*
Crear una clase ParDeNumerosService, en el paquete Servicios, 
    que deberá además implementar los siguientes métodos:
1-Método mostrarValores que muestra cuáles son los dos números guardados.
    
2-Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    
3-Método calcularPotencia para calcular la potencia del mayor valor de la clase 
    elevado al menor número. Previamente se deben redondear ambos valores.
    
4-Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
public class E2_ParDeNumerosService {
    public void mostrarValores(E2_ParDeNumeros nums){
        System.out.println("Numeros aleatorios: " + nums.getN1() + ", " + nums.getN2());
    }
    
    public double devolverMayor(E2_ParDeNumeros nums){
        return nums.getN1() > nums.getN2() ? nums.getN1() : nums.getN2();
    }
    
    public double calcularPotencia(E2_ParDeNumeros nums){
        return Math.pow((int)devolverMayor(nums), devolverMayor(nums) == nums.getN1() ? nums.getN2() : nums.getN1());
    }
    
    public double calculaRaiz(E2_ParDeNumeros nums){
        return devolverMayor(nums) == nums.getN1() ? Math.sqrt(Math.abs(nums.getN2())) : Math.sqrt(Math.abs(nums.getN1()));
    }
    
}
