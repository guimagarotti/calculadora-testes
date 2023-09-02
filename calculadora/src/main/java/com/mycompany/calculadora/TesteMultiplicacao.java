package com.mycompany.calculadora;

public class TesteMultiplicacao {
    public static void main(String[] args) {
        Multiplicacao calc = new Multiplicacao();
        
        //MULTIPLICAÇÃO
        System.out.println("MULTIPLICAÇÃO");
        //Multiplicação de dois valores negativos
        int mult1 = calc.multiplicacao(-4, -3);
        System.out.println(mult1);
        
        //Multiplicação de dois valores positivos
        int mult2 = calc.multiplicacao(12, 7);
        System.out.println(mult2);

        //Multiplicação de um valor por zero
        int mult3 = calc.multiplicacao(24, 0);
        System.out.println(mult3);
    }
}
