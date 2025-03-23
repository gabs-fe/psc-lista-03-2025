import java.util.Scanner;
import java.util.Random;

public class Seis {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Digite o primeiro número:"); //ler primeiro número
        int numeroUm = ler.nextInt();

        System.out.println("Digite o segundo número:");//ler segundo numero
        int numeroDois = ler.nextInt();

        int menor = Math.min(numeroUm, numeroDois);//encontrar o menor numero entre os dois e armazenar na variavel "menor"
        int maior = Math.max(numeroUm, numeroDois);//encontrar o maior numero entre os dois e armazenar na variavel "maior"

        int sorteado = menor + aleatorio.nextInt((maior - menor) + 1);//o sorteado sera entre o maior e o menor + 1 para garantir que o maior seja incluido

        if (sorteado % 2 == 0) {//verifica se o número sorteado é divisível por 2 sem deixar resto, ou seja zero
            System.out.println("O número sorteado foi: " + sorteado + " e ele é PAR.");
        } else {//se não chegar a zero, é porque o número é negativo
            System.out.println("O número sorteado foi: " + sorteado + " e ele é ÍMPAR.");
        }
    ler.close(); 
    }
    
}
