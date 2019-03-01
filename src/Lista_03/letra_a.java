package Lista_03;

import java.util.Scanner;

public class letra_a {
    public static void main(String[] args) {


        System.out.println("Entre com a quantidade de folhas: ");
        Scanner sc = new Scanner(System.in);

        int totalfolha = sc.nextInt();
        double resultado;

        if (totalfolha < 100){
            resultado = totalfolha *0.25;
            System.out.println(resultado);
        }else{
            resultado = totalfolha *0.20;
            System.out.println(resultado);

        }
    }
}















