package lista01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite o valor do raio: ");
            double raio = scanner.nextDouble();

            double areaCirculo = calcularAreaCirculo(raio);

            System.out.printf("Área do Circulo: %.2f%n", areaCirculo);
        } catch (ArithmeticException e){
            System.err.println("Erro: " + e.getMessage());
        }
    }

    public static double calcularAreaCirculo(double raio){
        if(raio < 0){
            throw new ArithmeticException("O valor do raio não pode ser negativo.");
        }
        return Math.pow(raio, 2) * Math.PI;
    }

}