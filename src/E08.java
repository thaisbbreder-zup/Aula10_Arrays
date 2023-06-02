/* 8. Crie um programa para exibir todos os inteiros dentro do intervalo 100-150 cuja soma de todos os dígitos é um número par.
- loop iniciando em 100

100 a 150
percorrer
variavel para somar cada i
se o i != 0
unidade = i % 10
soma += unidade


se for a divisao por 2 % != 0
*/

public class E08 {

    public static void main(String[] args) {
        System.out.println("Somando os algarismos de cada número de 100 a 150, os que resultam em par são: ");

        for (int i = 100; i <= 150; i++) { //percorre todos os nº de 100 a 150
            int soma = 0;
            int numero = i;

            while (numero != 0) { //enquanto o numero que esta sendo analisado for diferente de 0
                int unidade = numero % 10; //atribui a sobra da divisão por 10 (que sempre será o último dígito do número)
                soma += unidade; //soma é a variável que vai armazenar essa sobra e somar com sobra do próximo
                numero /= 10; //remove o último digito do numero e realiza todo o procedimento até numero == 0
            }

            if (soma % 2 == 0) { //
                System.out.println(i + " = " + soma);
            }
        }
    }
}
