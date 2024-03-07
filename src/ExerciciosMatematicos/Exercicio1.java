package ExerciciosMatematicos;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        1. Escreva um programa que solicite ao usuário dois números e exiba a soma, subtração, multiplicação e divisão
        entre eles.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digire o primeiro número");
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o segundo número");
        int n2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Resultado da soma é: " + soma(n1,n2));
        System.out.println("Resultado da subtracao é: " + subtracao(n1,n2));
        System.out.println("Resultado da multiplicacao é: " + multiplicacao(n1,n2));
        System.out.println("Resultado da divisao é: " + divisao(n1,n2));

        scanner.close();
    }


    public static int soma(int n1, int n2){
        return n1 + n2;
    }
     public static int subtracao(int n1, int n2){
        return n1 - n2;
    }
     public static int multiplicacao(int n1, int n2){
        return n1 * n2;
    }
     public static double divisao(double n1, double n2){
        if(n2 == 0){
            System.out.println("Não é possível dividir por 0");
        }
        return n1/n2;

    }



}
