import java.util.Scanner;

public class Cadastro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Aqui solicitamos a quantidade de pessoas a serem inseridas
        System.out.println("Insira a quantidade de pessoas a serem cadastradas:");
        int n = sc.nextInt();

        //Cria o vetor para armazenar a idades
        int[] idades = new int[n];

        //Realiza o cadastro das idades no vetor
        for (int i = 0; i < n; i++) {
            System.out.println("Digite a idade da pessoa" + (i + 1) + ":");
            idades[i] = sc.nextInt();
        }

        // Inicia os contadores de cada faixa etária
        int menor18 = 0;
        int entre18e59 = 0;
        int maior60 = 0;

        //Faz a verificação das faixas
        for (int idade : idades) {
            if (idade < 18) {
                menor18++;
            } else if (idade > 18 && idade < 59) {
                entre18e59++;
            } else {
                maior60++;
            }
        }

        //Exibe os resultados
        System.out.println("Pessoas menores de 18: "+menor18);
        System.out.println("Pessoas entre 18 e 59: "+entre18e59);
        System.out.println("Pessoas com 60 ou mais: "+maior60);
    }
}