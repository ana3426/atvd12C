package atividade12C;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("digite o primeiro numero:");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();
        int peso1 = 3;
        int peso2 = 2;
        double mediaPonderada = (n1 * peso1 + n2 * peso2) / (peso1 + peso2);
        System.out.println("A média ponderada é: " + mediaPonderada);
    }
}
