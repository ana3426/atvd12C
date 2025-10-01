package atividade12C;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("digite o valor do deposito");
        double deposito = sc.nextDouble();
        System.out.println("digite o valor do desconto:");
        double desconto = sc.nextDouble();
        double resultado = deposito*(desconto/100);
        System.out.println("o resultado mensal sera:"+resultado);
    }
}
