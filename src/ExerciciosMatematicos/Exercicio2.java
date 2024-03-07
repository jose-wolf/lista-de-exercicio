package ExerciciosMatematicos;

import java.util.Scanner;

public class Exercicio2 {
    /*
    2. Escreva um programa que calcule a média aritmética de dois números.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digire o primeiro número");
        double n1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite o segundo número");
        double n2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Resultado da média é " + media(n1,n2));

        scanner.close();
    }

    private static double media(double n1, double n2){
        return (n1 + n2)/2;
    }

}
