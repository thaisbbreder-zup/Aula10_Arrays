import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);

        int[][] somaMatriz = new int[4][5];
        int soma = 0;

        for (int i = 0; i < 4; i++) {  //percorre a linha
            for (int j = 0; j < 5; j++) { //percorre a coluna
                System.out.print("Informe um número: ");
                int numero = entradaDoUsuario.nextInt();
                somaMatriz[i][j] = numero;
                soma += numero;
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(somaMatriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("A soma dos números é: " + soma);
    }

}
