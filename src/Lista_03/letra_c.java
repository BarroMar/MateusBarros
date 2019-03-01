package Lista_03;

import java.util.Scanner;

public class letra_c {
    public static void main(String[] args) {


        System.out.println("Entre com a idade do nadador: ");
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        double categoria;

        if (idade < 10) {

            System.out.println("Categoria Infantil");

        }if (idade > 10){

            System.out.println("Categoria juvenil");
        }else{
            System.out.println("categoria ssenior");

            }
        }
    }


