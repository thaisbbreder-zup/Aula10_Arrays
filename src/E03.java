import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        System.out.println("--------- Números ordenados ---------");

        Scanner entradadoUsuario = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();

        System.out.println("Insira um número inteiro: ");
        listaNumeros.add(entradadoUsuario.nextInt());

        System.out.println("Insira um número inteiro: ");
        listaNumeros.add(entradadoUsuario.nextInt());

        System.out.println("Os números inseridos fora: " + listaNumeros);

        //método sort ordena lista em ordem crescente
        Collections.sort(listaNumeros);
        System.out.println("ArrayList de números inteiros em ordem crescente: " + listaNumeros);

        //método sort ordena lista em ordem decrescente
        Collections.reverse(listaNumeros);
        System.out.println("ArrayList em ordem decrescente em ordem decrescente: " + listaNumeros);

    }
}


/* -------------------------------- Também solucionei o exercício utilizando apenas estrutura de comparação --------------------------------
import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        System.out.println("--------- Números ordenados ---------");

        Scanner entradadoUsuario = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();

        System.out.println("Insira um número inteiro: ");
        listaNumeros.add(entradadoUsuario.nextInt());

        System.out.println("Insira um número inteiro: ");
        listaNumeros.add(entradadoUsuario.nextInt());

        System.out.println("Os números inseridos fora: " + listaNumeros);

        //ordenação decrescente
        if (listaNumeros.get(0) < listaNumeros.get(1)){ //se o valor do indice 0 for menor que o valor de 1
            int ordemDecrescente = listaNumeros.get(0); //variável que recebe o valor do índice 0
            listaNumeros.set(0, listaNumeros.get(1)); //atualiza o índice 0 com o valor que estava no 1
            listaNumeros.set(1,ordemDecrescente); //atualiza o índice 1 com o valor armazenado na variável
        }

        System.out.println("\nArrayList em ordem decrescente em ordem decrescente: " + listaNumeros);

    }
}

 */