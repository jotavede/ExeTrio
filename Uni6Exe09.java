/*
Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes.
Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino), uma nota para o cinema (zero até dez, valor inteiro) e a idade.

Baseado nisto faça um programa que informe:

qual a nota média recebida pelo cinema;
qual a nota média atribuída pelos homens;
qual a nota atribuída pela mulher mais jovem;
quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.

Utilize os conceitos aprendidos sobre vetores (ou mesmo o uso de matriz).

*/

import java.util.Scanner;

public class Uni6Exe09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] idades = new int[5];
        float[] notas = new float[5];
        int[] sexos = new int[5];

        int contadorMulheres = 0, somaNotaHomens = 0, somaNotas = 0, mulherJovem = 200, contadorMulheres50 = 0;
        float notaMulherJovem = 0, mediaHomens = 0, mediaCinema = 0;

        for (int i = 0; i < 5; i++) {
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
    }
}