package atividade12C;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Por favor, digite a altura em metros: ");
        double altura = sc.nextDouble();
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.printf("O peso ideal para a altura informada é: %.2f kg%n", pesoIdeal);
    }
}
