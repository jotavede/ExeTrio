/*
Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfacao de seus clientes.

Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino),
uma nota para o cinema (zero ate dez, valor inteiro) e a idade.

Baseado nisto faca um programa que informe:

qual a nota media recebida pelo cinema;
qual a nota media atribuida pelos homens;
qual a nota atribuida pela mulher mais jovem;
quantas das mulheres com mais de 50 anos deram nota superior a media recebida pelo cinema.

Utilize os conceitos aprendidos sobre vetores (ou mesmo o uso de matriz).
*/

import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] idades = new int[5];
        float[] notas = new float[5];
        int[] sexos = new int[5];

        int contadorMulheres = 0;
        int somaNotaHomens = 0;
        int somaNotas = 0;
        int mulherJovem = 200;
        int contadorMulheres50 = 0;

        float notaMulherJovem = 0;
        float mediaHomens = 0;
        float mediaCinema = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Cliente " + (i + 1));

            System.out.print("Qual seu sexo? [1 - Feminino / 2 - Masculino]: ");
            sexos[i] = sc.nextInt();

            System.out.print("Informe uma nota para o cinema (0-10): ");
            notas[i] = sc.nextInt();

            System.out.print("Informe sua idade: ");
            idades[i] = sc.nextInt();

            somaNotas += notas[i];

            if (sexos[i] == 2) {
                somaNotaHomens += notas[i];
            } else if (sexos[i] == 1) {
                contadorMulheres++;

                if (idades[i] < mulherJovem) {
                    notaMulherJovem = notas[i];
                }
            }
        }

        mediaCinema = somaNotas / 5;
        mediaHomens = somaNotaHomens / (5 - contadorMulheres);

        for (int i = 0; i < 5; i++) {
            if (sexos[i] == 1) {
                if (idades[i] > 50 && notas[i] > mediaCinema) {
                    contadorMulheres50++;
                }
            }
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("RESULTADOS DA PESQUISA");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("A nota media recebida pelo cinema e: " + mediaCinema);
        System.out.println("A nota media atribuida pelos homens e: " + mediaHomens);
        System.out.println("A nota atribuida pela mulher mais jovem e: " + notaMulherJovem);
        System.out.println("O numero de mulheres com mais de 50 anos que deram nota superior a media do cinema e: "
                + contadorMulheres50);

        sc.close();
    }
}
