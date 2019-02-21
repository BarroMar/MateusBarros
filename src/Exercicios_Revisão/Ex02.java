package Exercicios_Revisão;


import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        System.out.println(" Entre com o total de vendas");
        Scanner sc = new Scanner (System.in);
        double totaldeVendas = sc.nextDouble();
        double comissao = totaldeVendas * 0.1 * 100;
        System.out.println(comissao);




    }
}
