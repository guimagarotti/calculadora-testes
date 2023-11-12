package calculadora.junit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author guima
 * @version 1.2
 * @since Release 1.2 da aplicação - 12/11/2023
 * 
 *  Esta classe representa a realização de testes com JUnit na classe Multiplicacao.
 */
public class TesteMultiplicacaoTest {
	/**
	 * Método responsável por realizar o teste da operação de multiplicação, 
	 * instanciando a classe Multiplicacao, chamando seu método e passando os parâmetros 
	 * necessários para armazenar o valor da operação. Posteriormente, utilizando uma
	 * variável de referência, realiza o teste da classe com o assertEquals. 
	 * 
	 * @author guima
	 * @return Mensagem de status de validação do resultado via console.
	 */
	@Test
    public void testeMetodoMultiplicacao() {
        Multiplicacao classeMultiplicacao = new Multiplicacao();
        
        Double num1 = 5.0; // Variável referente ao número 1.
    	Double num2 = 3.0; // Variável referente ao número 2.
    	
    	Double resultado = classeMultiplicacao.multiplicacao(num1, num2);
    	Double expected = 15.0; // Variável referente ao resultado esperado.
    	
    	assertEquals(expected, resultado);
    }    
    
}
