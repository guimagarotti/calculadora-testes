package calculadora.junit;

public class TesteSoma { 
    public static void main(String[] args) {
        Soma calc = new Soma();
        
        //SUBTRAÇÃO
        System.out.println("SUBTRAÇÃO");
        //Soma com dois valores negativos
        int soma1 = calc.soma(-35, -44);
        System.out.println(soma1);
        
        //Subtração com dois valores positivos
        int soma2 = calc.soma(40, 76);
        System.out.println(soma2);
        
        //Subtração com um valor positivo e um valor negativo
        int soma3 = calc.soma(56, -24);
        System.out.println(soma3);             
    }   
}
