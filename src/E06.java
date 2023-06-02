/*
6. Crie um programa para verificar se o inteiro fornecido é um múltiplo de 5 e 7.
 */

import java.util.Scanner;
public class E06 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("----------- Escreva um número inteiro e eu te direi se ele é múltiplo de 5 ou 7 -----------");
        int numero = entradaDoUsuario.nextInt();

        if (numero % 5 == 0 && numero % 7 == 0){
            System.out.println("O número " + numero+ " é multiplo de 5 e de 7!");
        }else if (numero % 5 == 0 && numero % 7 != 0){
            System.out.println("O número " + numero+ " é multiplo de 5 mas não é de 7!");
        }else if (numero % 5 != 0 && numero % 7 == 0){
            System.out.println("O número " + numero+ " é multiplo de 7 mas não é de 5!");
        }else{
            System.out.println("O número " + numero+ " não é multiplo de 5 e nem de 7!");
        }
    }

}
