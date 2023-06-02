public class E11 {
    public static void main(String[] args) {
        System.out.println("-------- MAIOR E MENOR IDADE EM UM VETOR -------- ");
        int[] vetor = {12, 44, 5, 36, 17, 8, 59, 10};

        System.out.print("As idades informadas são: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        int menorIdade = vetor[0]; //não iniciei com 0 pq ele seria considerado a menor idade
        int indiceMenorIdade = 0;

        int maiorIdade = vetor[0];
        int indiceMaiorIdade = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menorIdade) {
                menorIdade = vetor[i];
                indiceMenorIdade = i;
            } else if ( vetor[i] > maiorIdade){
                maiorIdade = vetor[i];
                indiceMaiorIdade = i;
            }
        }

        System.out.println("\nA menor idade informada está no índice " + indiceMenorIdade + " e é " + menorIdade + " anos");
        System.out.println("A maior idade informada está no índice " + indiceMaiorIdade + " e é "+ maiorIdade + " anos");
    }
}
