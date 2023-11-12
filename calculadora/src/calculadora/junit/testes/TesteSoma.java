package calculadora.junit.testes;

import calculadora.junit.Soma;

/**
 * @author guima
 * @version 1.2
 * @since Release 1.2 da aplicação - 12/11/2023
 * 
 *  Esta classe representa a execução de validações de lógica da operação de soma 
 *  da calculadora, através da instância da classe Soma.
 */
public class TesteSoma { 
    public static void main(String[] args) {
        Soma calc = new Soma();
        
        Double soma1 = calc.soma(-35.0, -44.0); // Validação soma com dois valores negativos.
        System.out.println(soma1);
        
        Double soma2 = calc.soma(40.0, 76.0); // Validação soma com dois valores positivos.
        System.out.println(soma2);
        
        Double soma3 = calc.soma(56.0, -24.0); // Validação soma com um valor positivo e um valor negativo.
        System.out.println(soma3);             
    }   
}
