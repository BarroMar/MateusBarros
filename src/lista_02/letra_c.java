package lista_02;

import java.util.Scanner;

public class letra_c {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float medida1, medida2, sala;

        System.out.println("Informe o valor da medida 1: ");
        medida1 = sc.nextFloat();
        System.out.println("Informe o valor da medida 2: ");
        medida2 = sc.nextFloat();
        sala = (medida1 * medida2);
        System.out.println("O tamanho da sala é " + sala + "M²");
    }
}