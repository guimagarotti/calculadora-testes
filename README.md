# Calculadora em Java - Ramificação com Testes Unitários JUnit

Este é um projeto de calculadora simples, utilizando a linguagem de programação Java, que utiliza adicionalmente a ferramenta JUnit para testes de unidade.

## O que o projeto faz

Este projeto é responsável por implementar soluções de uma calculadora, que é capaz de realizar operações matemáticas básicas, como adição, subtração, multiplicação e divisão. Nessa ramificação, é possível validar se seus cálculos foram realizados corretamente, com auxílio da ferramenta JUnit.

## Por que o projeto é útil

  Esta calculadora pode ser útil para estudantes, desenvolvedores e qualquer pessoa que precise realizar cálculos matemáticos simples em um ambiente de desenvolvimento Java. Além disso, é uma ótima ferramenta
para desenvolvedores iniciantes, que precisam adquirir competências em sua carreira profissional.

## Como os usuários podem começar a usar o projeto
### Clone o repositório:
   <code>git clone https://github.com/guimagarotti/calculadora-testes.git</code>

### Navegue até o diretório:
    cd calculadora-junit

### Execute os testes de unidade usando o JUnit:
  <code>java -cp .:junit-<versao>.jar:hamcrest-core-<versao>.jar org.junit.runner.JUnitCore CalculatorTest</code>

### Agora você pode usar a calculadora em seus próprios projetos Java acessando a classe de Teste da Operação Desejada:

```
import com.example.Calculator;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Divisao divisao = new Divisao();
        // Utilize os métodos da calculadora aqui
    }
}
```


## Onde os usuários podem obter ajuda com seu projeto
  Se você precisar de ajuda com este projeto, sinta-se à vontade para abrir uma issue em meu GitHub.

## Quem mantém e contribui com o projeto
  Este projeto é mantido por Guilherme Magarotti. Contribuições e críticas construtivas são bem-vindas! Se necessário, basta entrar em contato comigo.
