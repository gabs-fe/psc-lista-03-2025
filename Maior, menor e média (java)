import java.util.Scanner;

public class Um
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in); 
        
        System.out.print("Qual o número 1? "); //recebe valor do primeiro numero
        int numeroUm = ler.nextInt();
        System.out.print("Qual o número 2? "); //recebe valor do segundo numero
        int numeroDois = ler.nextInt();
        System.out.print("Qual o número 3? "); //recebe o valor do terceiro numero
        int numeroTres = ler.nextInt();

        int [] numeros = {numeroUm, numeroDois, numeroTres}; //guarda tudo em um array

        int maior = Integer.MIN_VALUE; //faz a checagem do menor valor
        int menor = Integer.MAX_VALUE; //faz a checagem do maior valor

        for (int checados: numeros) // percorre todo o array
        {
            if (checados > maior) { //se o numero checado for maior que o já checado
                maior = checados; //o maior recebe esse valor
            }
            if (checados < menor) { // se o numero checado for menor que o já checado
                menor = checados; //o menor recebe esse valor
            }
        }

        int media = (numeroUm + numeroDois+ numeroTres) / 3; // faz a soma e a divisão e atribui a media

        System.out.println("O maior número é " + maior); //printa o maior
        System.out.println("O menor número é " + menor); //printa o menor
        System.out.println("A média de todos é: " + media); //printa a media

        ler.close();
    }
}
