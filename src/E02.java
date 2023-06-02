import java.util.ArrayList;
import java.util.List;

public class E02 {
    public static void main(String[] args) {
        System.out.println(" --------------- Adicionando valor em lista ordenada ---------------");
        List<Integer> listaDeNumeros = new ArrayList<>();

        listaDeNumeros.add(1);
        listaDeNumeros.add(2);
        listaDeNumeros.add(3);
        listaDeNumeros.add(5);

        System.out.println("\nLista de números ordenados de 1 a 5: ");

        //  contains: método que retorna true se o elemento especificado estiver na lista
        if (listaDeNumeros.contains(4)) {
            System.out.println("Todos os números de 1 a 5 estão presentes na lista.");
        } else {
            System.out.println(listaDeNumeros + "\nOps, faltou o numero 4. \nAdicionando o nº 4 ao indice 3...");
        }

        //adicionando o 4 no índice 3
        listaDeNumeros.add(3, 4);

        if (listaDeNumeros.contains(4)) {
            System.out.println("\nTodos os números de 1 a 5 estão presentes na lista. Confira: \n" + listaDeNumeros);
        }

    }
}

