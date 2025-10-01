package atividade12C;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite o comprimento do lado do quadrado: ");
        double lado = sc.nextDouble();
        double area = lado * lado;
        double perimetro = 4 * lado;
        System.out.println("A área do quadrado é: " + area);
        System.out.println("O perímetro do quadrado é: " + perimetro);
    }
}
