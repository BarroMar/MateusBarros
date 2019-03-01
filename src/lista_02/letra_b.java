package lista_02;

import java.util.Scanner;

public class letra_b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float medida1, medida2, metrodocarpete, total;

        System.out.println("Informe o valor da medida 1: ");
        medida1 = sc.nextFloat();
        System.out.println("Informe o valor da medida 2: ");
        medida2 = sc.nextFloat();
        System.out.println(" informe o valor do m² do carpete: ");
        metrodocarpete = sc.nextFloat();
        total = (medida1 * medida2) * metrodocarpete;
        System.out.println("O valor total do carpete é " + total + "R$");
    }
}