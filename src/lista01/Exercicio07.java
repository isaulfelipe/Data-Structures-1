package lista01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Digite um numero de 1 a 5: ");
            int num = scanner.nextInt();

            System.out.println(converterParaExtenso(num));
        } catch (InputMismatchException e) {
            System.err.println("Erro: Deve ser um numero inteiro.");
        }
    }

    public static String converterParaExtenso(int numero) {
        return switch (numero) {
            case 1 -> "Um";
            case 2 -> "Dois";
            case 3 -> "Três";
            case 4 -> "Quatro";
            case 5 -> "Cinco";
            default -> "valor invalido";
        };
    }
}