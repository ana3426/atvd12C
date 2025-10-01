package atividade12C;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite o valor total da compra: ");
        double valorCompra = sc.nextDouble();
        double valorParcela = valorCompra/3;
        System.out.printf("O valor a ser pago em 3 parcelas iguais é: R$ %.2f%n", valorParcela);
    }
}
