package atividade12C;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite a idade da pessoa em anos: ");
        int idadeEmAnos = sc.nextInt();
        int idadeEmDias = idadeEmAnos * 365;
        System.out.println("A pessoa já viveu aproximadamente " + idadeEmDias + " dias.");
    }
}
