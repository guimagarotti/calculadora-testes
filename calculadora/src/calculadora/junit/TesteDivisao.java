package calculadora.junit;

public class TesteDivisao {
    public static void main(String[] args) {
        Divisao calc = new Divisao();
        
        //DIVISÃO
        System.out.println("DIVISÃO");
        //Divisão de dois valores negativos
        int div1 = calc.divisao(-12, -4);
        System.out.println(div1);
        
         //Divisão de um valor por UM
        int div2 = calc.divisao(25, 1);
        System.out.println(div2);
        
         //Divisão de dois valores positivos
        int div3 = calc.divisao(60, 15);
        System.out.println(div3);
    }
}
