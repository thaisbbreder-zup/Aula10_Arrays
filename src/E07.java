/*7. Crie um programa para exibir o inteiro fornecido pelo usuário na ordem inversa.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E07 {

    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.print("Digite a quantidade de números inteiros que compõe a lista: ");
        int qntNumeros = entradaDoUsuario.nextInt();

        System.out.print("Digite os números (ex: 1 2 3 4 5): ");
        List<Integer> numeros = new ArrayList<>();

        //loop para adicionar os numeros na lista
        for (int i = 0; i < qntNumeros; i++) {
            numeros.add(entradaDoUsuario.nextInt());
        }

        System.out.println("A lista informada é: " + numeros);

        System.out.print("A ordem inversa dos números inseridos é: ");
        for (int i = numeros.size() - 1; i >= 0; i--) { //numeros.size() - 1 retorna o tamanho da lista, subtrai -1 para obter o índice do último elemento
            System.out.print(numeros.get(i) + " ");
        }
    }
}
