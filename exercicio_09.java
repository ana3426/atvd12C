package atividade12C;

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("<<!nav>>Calculadora de Área de Trapézio<<!/nav>>");
        System.out.print("Digite o valor da base maior: ");
        double baseMaior = sc.nextDouble();
        System.out.print("Digite o valor da base menor: ");
        double baseMenor = sc.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double altura = sc.nextDouble();
        double area = (baseMaior + baseMenor) * altura / 2;
        System.out.println("A área do trapézio é: " + area);
    }
}
