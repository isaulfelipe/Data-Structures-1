package lista01;

import java.security.InvalidParameterException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite um numero inteiro para saber se é Par ou Ímpar: ");
            int num = scanner.nextInt();

            boolean ParOrImpar = isParOrImpar(num);

            System.out.println("O numero é " + (ParOrImpar ? "Par" : "Ímpar"));

        } catch (InvalidParameterException e) {
            System.err.print("Erro: " + e.getMessage());
        }
    }

    public static boolean isParOrImpar(int num){
        if(num % 1 != 0 ){
            throw new InvalidParameterException("O numero deve ser inteiro.");
        }
        return (num % 2 == 0);
    }
}
