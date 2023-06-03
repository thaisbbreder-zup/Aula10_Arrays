import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        List<Double> alturas = new ArrayList<>();
        List<String> sexos = new ArrayList<>();

        Scanner entradaDoUsuario = new Scanner(System.in);

        int totalM = 0;
        int totalF = 0;
        double somaAlturaM = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Insira a altura: ");
            double altura = entradaDoUsuario.nextDouble();
            alturas.add(altura);

            System.out.print("Insira o sexo (M ou F): ");
            String sexo = entradaDoUsuario.next();
            sexos.add(sexo);

            if (sexo.equalsIgnoreCase("M")) {
                totalM++;
                somaAlturaM += altura;
            }else{
                totalF++;
            }
        }

        double maiorAltura = alturas.get(0);
        double menorAltura = alturas.get(0);

        for (int i = 1; i < alturas.size(); i++) {
            double altura = alturas.get(i);
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }
        }
        if (totalM != 0) {
            double mediaAlturaM = somaAlturaM / totalM;
            System.out.println("Média de altura dos homens: " + mediaAlturaM);
        } else {
            System.out.println("Não foram inseridos homens.");
        }


        System.out.println("A maior altura é " + maiorAltura);
        System.out.println("A menor altura é " + menorAltura);
        System.out.println("O total de pessoas do sexo feminino é " + totalF);

    }
}
