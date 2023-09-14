package com.mycompany.calculadora;

public class TesteSoma {
    
    public static void main(String[] args) {
        Soma calc = new Soma();
        
        //SOMA
        System.out.println("SOMA");
        //Soma com dois valores maiores que 1.000
        int soma = calc.soma(4000, 3999);
        System.out.println(soma); 
        
        //Soma com dois valores negativos
        int soma2 = calc.soma(-25, -14);
        System.out.println(soma2); 
        
        //Soma com um valor negativo e um positivo
        int soma3 = calc.soma(-350, 410);
        System.out.println(soma3);         
    }   
}
