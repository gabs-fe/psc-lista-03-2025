import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numeroUm = ler.nextInt();

        System.out.println("Digite o segundo número:");
        double numeroDois = ler.nextInt();

        ler.nextLine();

        System.out.println("Qual a operação desejada?");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        System.out.println("^");

        char simbolo = ler.nextLine().charAt(0); // ler o símbolo da operação desejada

        if (simbolo != '+' && simbolo != '-' && simbolo != '*' && simbolo != '/' && simbolo != '^') {
            // Verifica se o símbolo é inválido
            System.out.println("Operação inválida!");
        } else {
            //executa a operação correspondente
            if (simbolo == '+') {
                double soma = numeroUm + numeroDois;
                System.out.println("Resultado: " + soma);
            }
            if (simbolo == '-') {
                double subtracao = numeroUm - numeroDois;
                System.out.println("Resultado: " + subtracao);
            }
            if (simbolo == '*') {
                double multiplicacao = numeroUm * numeroDois;
                System.out.println("Resultado: " + multiplicacao);
            }
            if (simbolo == '/') {
                if (numeroDois != 0){
                    double divisao = numeroUm / numeroDois; 
                    System.out.println("Resultado: " + divisao);} 
                else{
                    System.out.println("Erro: Divisão por zero não permitida!");}
            }
            if (simbolo == '^') {
                double potenciacao = Math.pow(numeroUm, numeroDois); // Calcula potenciação
                System.out.println("Resultado: " + potenciacao);
            }
        }

        ler.close(); 
    }
}
