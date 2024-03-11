package ExerciciosMatematicos;

import java.util.Scanner;

public class Exercício4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu peso");
        double peso = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite a sua altura");
        double altura = Double.parseDouble(scanner.nextLine());
        calculoImc(peso,altura);


    }

    public static void calculoImc(double peso,double altura){
        double resposta = peso / (altura * altura);
        System.out.println("Seu imc é: " + resposta);
    }

}
