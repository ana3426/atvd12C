package atividade12C;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        double  precoOriginal = sc.nextDouble();
        double  Desconto = precoOriginal * 0.85;
        System.out.printf("O preço com 15%% de desconto é: R$ %.2f%n", Desconto);
    }
}
