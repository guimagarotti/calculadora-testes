package calculadora.junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class TesteMultiplicacaoTest {
    
@Test
    public void testeMetodoMultiplicacao() {
        // Configuração inicial de instância para teste
        Multiplicacao classeMultiplicacao = new Multiplicacao();

        // Chama o método que você deseja testar
        int resultado = classeMultiplicacao.multiplicacao(5, 25);

        // Verifica o resultado usando asserções do JUnit
        assertEquals(120, resultado); // Verifica se o resultado é igual a 120
    }    
    
}
