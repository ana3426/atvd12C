package atividade12C;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite a quantidade de horas: ");
        int horas = sc.nextInt();
        int minutos = horas * 60;
        System.out.println(horas + " horas equivalem a " + minutos + " minutos.");


    }
}
