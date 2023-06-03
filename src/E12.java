import java.util.ArrayList;
import java.util.List;
public class E12 {
    public static void main(String[] args) {
        System.out.println("-------- VETOR ABC -------- ");

        int[] vetorA = {10, 24, 32, 47, 54, 67, 79, 81, 9, 12, 92, 44, 5, 4, 36, 17, 8, 59, 10, 3};
        List<Integer> vetorBPares = new ArrayList<>();
        List<Integer> vetorCImpares = new ArrayList<>();

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorBPares.add(vetorA[i]);
            } else {
                vetorCImpares.add(vetorA[i]);
            }
        }
        System.out.println("Vetor B (Pares): " + vetorBPares);
        System.out.println("Vetor C (Ímpares): " + vetorCImpares);
    }
}
