/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora.junit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author guima
 */
public class TesteSubtracaoTest {
	/**
	 * Método responsável por realizar o teste da operação de subtração, 
	 * instanciando a classe Subtracao, chamando seu método e passando os parâmetros 
	 * necessários para armazenar o valor da operação. Posteriormente, utilizando uma
	 * variável de referência, realiza o teste da classe com o assertEquals. 
	 * 	 
	 * @author guima 
	 * @return Mensagem de status de validação do resultado via console.
	 */
    @Test
    public void testeMetodoSubtracao() {
        Subtracao classeSubtracao = new Subtracao();

        Double num1 = 5.0;
    	Double num2 = 3.0;
    	
    	Double resultado = classeSubtracao.subtracao(num1, num2);
    	Double expected = 2.0;
    	
    	assertEquals(expected, resultado);
    }    
    
}
