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
    
    @Test
    public void testeMetodoSubtracao() {
        // Configuração inicial de instância para teste
        Subtracao classeSubtracao = new Subtracao();

        // Chama o método que você deseja testar
        int resultado = classeSubtracao.subtracao(25, 14);

        // Verifica o resultado usando asserções do JUnit
        assertEquals(11, resultado); // Verifica se o resultado é igual a 11
    }    
    
}
