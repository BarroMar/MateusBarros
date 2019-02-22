package Exercicios_Revisão;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        int totalfolhas;
        double resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o numero de folhas a serem impressas");
        totalfolhas = sc.nextInt();
        if (totalfolhas <= 100){
            resultado = totalfolhas * 0.25;
        }else{
            resultado = totalfolhas * 0.20;
        }
        System.out.println(resultado);

    }
}
