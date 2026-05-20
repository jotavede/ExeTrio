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

        int sexoNum = 0;
        String sexo;

        for (int i=0; i<30; i++) {
            System.out.print("Qual seu sexo? [1 - masculino / 2 - feminino]");
            sexoNum = sc.nextInt();

            if (sexoNum==1) {
                sexo = "feminino";    
            }

            else if (sexoNum==2) {
                sexo = "masculino";
            }
        
       // Qual a nota média recebida pelo cinema;
        System.out.println("Qual a nota média recebida pelo cinema?");



        }
        
        
        // Qual a nota média atribuída pelos homens;
        System.out.println("Qual a nota média atribuída pelos homens?");


    }
}
