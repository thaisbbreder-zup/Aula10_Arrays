import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numImpar = 0;
        int qntImpares = 0;

        for(int i = 0; i < 10; i++){
            if(vetor[i] % 2 != 0){
                numImpar += vetor[i];
                qntImpares++;
            }

        }
        int media = numImpar / qntImpares;
        System.out.println("A média do números impares de 1 a 10 é igual a " + media);
    }
}
