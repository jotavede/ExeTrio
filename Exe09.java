/*
Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes.
Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino), 
uma nota para o cinema (zero até dez, valor inteiro) e a idade.

Baseado nisto faça um programa que informe:

qual a nota média recebida pelo cinema;
qual a nota média atribuída pelos homens;
qual a nota atribuída pela mulher mais jovem;
quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.

Utilize os conceitos aprendidos sobre vetores (ou mesmo o uso de matriz).

*/

import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sexoNum = 0;
        int idade;
        int menoridade = Integer.MAX_VALUE;
        int nota;
        int notaMulherJovem = -1;
        int somaNotasMulheresMais50 = 0;
        int contadorMulheresMais50 = 0;

        for (int i = 0; i < 30; i++) {

            System.out.print("Qual seu sexo? [1 - feminino / 2 - masculino] ");
            sexoNum = sc.nextInt();

            if (sexoNum != 1 && sexoNum != 2) {
                System.out.println("Sexo invalido. Encerrando cadastro.");
                break;
            }

            System.out.println("Qual sua idade?");
            idade = sc.nextInt();

            System.out.println("Qual a sua nota de 0 a 10");
            nota = sc.nextInt();

            if (sexoNum == 1) {

                if (idade < menoridade) {
                    menoridade = idade;
                    notaMulherJovem = nota;
                }

                if (idade > 50) {
                    somaNotasMulheresMais50 += nota;
                    contadorMulheresMais50++;
                }
            }
        }

        if (notaMulherJovem != -1) {
            System.out.println("A mulher mais jovem deu a nota " + notaMulherJovem);
        } else {
            System.out.println("Nenhuma mulher foi cadastrada.");
        }

        if (contadorMulheresMais50 > 0) {
            double mediaMulheresMais50 = (double) somaNotasMulheresMais50 / contadorMulheresMais50;
            System.out.println("A media das notas das mulheres com mais de 50 anos foi " + mediaMulheresMais50);
        } else {
            System.out.println("Nenhuma mulher com mais de 50 anos foi cadastrada.");
        }
    }
}

