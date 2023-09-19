package calculadora.junit;

import org.junit.Assert;
import org.junit.Test;

public class TesteSoma {
   @Test 
    public static void main(String[] args) {
        Soma calc = new Soma();
            
        int soma = calc.soma(4000, 3999);
        System.out.println(soma); 
         
       Assert.assertEquals(10, soma);
             
    }   
}
