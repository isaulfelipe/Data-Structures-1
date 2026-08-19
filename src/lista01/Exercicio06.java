package lista01;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public enum TipoEquacao{
        SEM_RAIZES,
        COM_UMA_RAIZ,
        COM_DUAS_RAIZES
    }

    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)){
            System.out.print("Digite o Valor de 'A' da sua equação de segundo grau: ");
            double a = scanner.nextDouble();

            if (a ==0){
                throw new IllegalArgumentException("'A' não pode ser 0 ");
            }
            System.out.print("Digite o Valor de 'B' da sua equação de segundo grau: ");
            double b = scanner.nextDouble();

            System.out.print("Digite o Valor de 'C' da sua equação de segundo grau: ");
            double c = scanner.nextDouble();

            double valorDelta = calcDelta(a, b, c);

            TipoEquacao tipo = classificarEquacao(valorDelta);

            switch (tipo) {
                case SEM_RAIZES -> System.out.println("A equação não possui raízes reais.");
                case COM_UMA_RAIZ -> System.out.printf("A raiz única é: %.2f%n", calcRaiz1(a, b, valorDelta));
                case COM_DUAS_RAIZES -> System.out.printf("As raízes são x1 = %.2f e x2 = %.2f%n",
                        calcRaiz1(a, b, valorDelta), calcRaiz2(a, b, valorDelta));
            }


        } catch (InputMismatchException e) {
            System.err.println("Erro: Formato numérico inválido");
        } catch (IllegalArgumentException e){
            System.err.println("Erro: " + e.getMessage());
        }
    }

    public static double calcDelta(double a, double b, double c){
        return ((b * b) - (4 * a * c));
    }

    public static TipoEquacao classificarEquacao(double delta){
        if(delta < 0){
            return TipoEquacao.SEM_RAIZES;
        }

        if(delta == 0){
            return TipoEquacao.COM_UMA_RAIZ;
        }

        return TipoEquacao.COM_DUAS_RAIZES;
    }

    public static double calcRaiz1(double a, double b, double delta){
        return ((-b) + Math.sqrt(delta)) / (2.0 * a);
    }

    public static double calcRaiz2(double a, double b, double delta){
        return ((-b) - Math.sqrt(delta)) / (2.0 * a);
    }
}
