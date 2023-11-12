package calculadora.junit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author guima
 * @version 1.2
 * @since Release 1.2 da aplicação - 12/11/2023
 * 
 *  Esta classe representa a realização de testes com JUnit na classe Divisao.
 */
public class TesteDivisaoTest {
	/**
	 * Método responsável por realizar o teste da operação de divisão, 
	 * instanciando a classe Divisao, chamando seu método e passando os parâmetros 
	 * necessários para armazenar o valor da operação. Posteriormente, utilizando uma
	 * variável de referência, realiza o teste da classe com o assertEquals.  
	 * 
	 * @author guima
	 * @return Mensagem de status de validação do resultado via console.
	 */
    @Test
    public void testeMetodoDivisao() {
    	Divisao classeDivisao = new Divisao();
    	
    	Double num1 = 15.0; // Variável referente ao número 1.
    	Double num2 = 5.0; // Variável referente ao número 2.
    	
    	Double resultado = classeDivisao.divisao(num1, num2);
    	Double expected = 3.0; // Variável referente ao resultado esperado.
    	
    	assertEquals(expected, resultado);
    }    
    
}
