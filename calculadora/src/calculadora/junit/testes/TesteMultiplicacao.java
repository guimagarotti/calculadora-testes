package calculadora.junit.testes;

import calculadora.junit.Multiplicacao;

/**
 * @author guima
 * @version 1.2
 * @since Release 1.2 da aplicação - 12/11/2023
 * 
 *  Esta classe representa a execução de validações de lógica da operação de 
 *  multiplicação da calculadora, através da instância da classe Multiplicacao.
 */
public class TesteMultiplicacao {
    public static void main(String[] args) {
        Multiplicacao calc = new Multiplicacao(); // Instância da classe
        
        Double mult1 = calc.multiplicacao(-4.0, -3.0); // Validação multiplicação de dois valores negativos.
        System.out.println(mult1);
        
        Double mult2 = calc.multiplicacao(12.0, 7.0); // Validação multiplicação de dois valores positivos.
        System.out.println(mult2);

        Double mult3 = calc.multiplicacao(24.0, 0.0); // Validação multiplicação de um valor por zero.
        System.out.println(mult3);
    }
}
