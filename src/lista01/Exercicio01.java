package lista01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite seu peso em KG: ");
            double peso = scanner.nextDouble();

            System.out.print("Digite sua altura em metros: ");
            double altura = scanner.nextDouble();

            double imc = calcularIMC(peso, altura);

            System.out.printf("Imc: %.2f%n", imc);

        } catch (ArithmeticException e){
            System.err.println("Erro: " + e.getMessage());
        }
    }

    public static double calcularIMC(double peso, double altura){
        if(altura == 0){
            throw new ArithmeticException("Divisão por zero detectada. Altura não pode ser zero.");
        }
        return  peso / (altura * altura);
    }

}