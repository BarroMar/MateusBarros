package lista_02;

import java.util.Scanner;

public class letra_a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double distancia, combustivel, consumo;

        System.out.println("informe a distância percorrida em km");
        distancia = sc.nextFloat();

        System.out.println("informe a quantidade de combustível utilizada");
        combustivel = sc.nextFloat();

        consumo = distancia / combustivel;
        System.out.println(" O consumo médiodo veículo é de " + consumo + "km/l");
    }
}
