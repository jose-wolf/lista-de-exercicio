package ExerciciosMatematicos;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digire o primeiro número");
        double n1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite o segundo número");
        double n2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite o terceiro número");
        double n3 = Double.parseDouble(scanner.nextLine());

        System.out.println("Resultado da média é " + media(n1,n2,n3));

        scanner.close();

    }

    private static double media(double n1, double n2, double n3){
        return (n1 + n2 + n3)/3;
    }

}
