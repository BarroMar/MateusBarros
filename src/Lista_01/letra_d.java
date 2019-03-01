package Lista_01;

import java.util.Scanner;

public class letra_d {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salario, reajuste, valorfinal;

        System.out.println("informe o valor do seu salario: ");
        salario = sc.nextDouble();
        System.out.println("informe o valor do reajuste: ");
        reajuste = sc.nextDouble();


        valorfinal = salario * (reajuste / 100) + salario;
        System.out.println(" o valor do salario é: " + valorfinal);
    }
}