package lista01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.print("Digite sua nota da primeira unidade: ");
            double n1 = scanner.nextDouble();

            System.out.print("Digite sua nota da segunda unidade: ");
            double n2 = scanner.nextDouble();

            System.out.print("Digite sua nota da terceira unidade: ");
            double n3 = scanner.nextDouble();

            double media = calcMedia(n1, n2, n3);

            System.out.printf("A sua média é %.2f e você está %s%n", media, aprovRepFinal(media));
        } catch (IllegalArgumentException e) {
            System.err.print("Erro: " + e.getMessage());
        }
    }

    public static double calcMedia(double n1, double n2, double n3){

        if (isNotaInvalida(n1) || isNotaInvalida(n2) || isNotaInvalida(n3)) {
            throw new IllegalArgumentException("As notas devem estar entre 0.0 e 10.0");
        }

        return (n1 + n2 + n3) / 3.0;
    }

    private static boolean isNotaInvalida(double nota) {
        return nota < 0 || nota > 10;
    }

    private static String aprovRepFinal(double media){
        if(media >= 7.0){
            return "Aprovado";
        }

        if (media >= 3.5){
            return "na Final";
        }

        return "Reprovado";
    }
}