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
public class TesteDivisaoTest {
    
    @Test
    public void testeMetodoDivisao() {
        // Configuração inicial de instância para teste
        Divisao classeDivisao = new Divisao();

        // Chama o método que você deseja testar
        int resultado = classeDivisao.divisao(125, 25);

        // Verifica o resultado usando asserções do JUnit
        assertEquals(12, resultado); // Verifica se o resultado é igual a 12
    }    
    
}
