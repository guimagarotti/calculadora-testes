package calculadora.junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class TesteSomaTest {
    
    @Test
    public void testeMetodoSoma() {
        // Configuração inicial de instância para teste
        Soma classeSoma = new Soma();

        // Chama o método que você deseja testar
        int resultado = classeSoma.soma(5, 25);

        // Verifica o resultado usando asserções do JUnit
        assertEquals(10, resultado); // Verifica se o resultado é igual a 10
    }    
}
