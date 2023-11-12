package calculadora.junit.testes;

import calculadora.junit.Divisao;

/**
 * @author guima
 * @version 1.2
 * @since Release 1.2 da aplicação - 12/11/2023
 * 
 *  Esta classe representa a execução de validações de lógica da operação de divisão 
 *  da calculadora, através da instância da classe Divisao.
 */
public class TesteDivisao {
    public static void main(String[] args) {
        Divisao calc = new Divisao(); // Instância da classe
  
        Double div1 = calc.divisao(-12.0, -4.0); // Validação divisão de dois valores negativos.
        System.out.println(div1);
        
        Double div2 = calc.divisao(25.0, 1.0);  // Validação divisão de um valor por UM.
        System.out.println(div2);
        
        Double div3 = calc.divisao(60.0, 15.0); // Validação divisão de dois valores positivos.
        System.out.println(div3);
    }
}
