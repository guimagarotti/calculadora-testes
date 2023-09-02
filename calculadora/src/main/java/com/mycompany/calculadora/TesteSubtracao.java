package com.mycompany.calculadora;

public class TesteSubtracao {
    public static void main(String[] args) {
        Subtracao calc = new Subtracao();
        
        //SUBTRAÇÃO
        System.out.println("SUBTRAÇÃO");
        //Subtração com dois valores negativos
        int sub1 = calc.subtracao(-10, -20);
        System.out.println(sub1);
        
        //Subtração com dois valores positivos
        int sub2 = calc.subtracao(30, 26);
        System.out.println(sub2);
        
        //Subtração com um valor positivo e zero
        int sub3 = calc.subtracao(56, 0);
        System.out.println(sub3);
    }
}
