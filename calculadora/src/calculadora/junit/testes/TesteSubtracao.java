package calculadora.junit.testes;

import calculadora.junit.Subtracao;

/**
 * @author guima
 * @version 1.2
 * @since Release 1.2 da aplicação - 12/11/2023
 * 
 *  Esta classe representa a execução de validações de lógica da operação de subtração 
 *  da calculadora, através da instância da classe Subtracao.
 */
public class TesteSubtracao {
    public static void main(String[] args) {
        Subtracao calc = new Subtracao();
        
        Double sub1 = calc.subtracao(-10.0, -20.0); // Validação subtração com dois valores negativos.
        System.out.println(sub1);
        
        Double sub2 = calc.subtracao(30.0, 26.0); // Validação subtração com dois valores positivos
        System.out.println(sub2);
        
        Double sub3 = calc.subtracao(56.0, 0.0); // Validação subtração com um valor positivo e zero.
        System.out.println(sub3);
    }
}
