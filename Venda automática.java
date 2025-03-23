import java.util.Scanner;

public class Dois
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in); 
        int[] arrayNotas = {50, 20, 10, 5, 2, 1}; //define os valores aceitos das notas 

        System.out.print("Qual foi o valor da compra? "); //recebe o valor da compra
        int valorCompra = ler.nextInt();
        System.out.print("Qual foi o valor pago? "); //recebe o valor pago
        int valorPago = ler.nextInt();

        if (valorPago < valorCompra){
            System.out.println("A quantia paga é insuficiente"); //caso o valor pago não seja suficiente
        } 

        else {
            int troco = valorPago - valorCompra; //descobrir o valor do troco
            System.out.println("Troco a ser devolvido é de: R$ " + troco); //printar o valor do troco

            for (int chegagemNotas : arrayNotas) //percorre o array
            {
                int qtdNotas = troco / chegagemNotas; //a quantidade de notas vai ser o resultado de troco dividido com a maior nota aceita
                troco %= chegagemNotas; //atualiza o valor da nota para checar de novo

                if (qtdNotas > 0) //o laço de for vai percorrer até que não seja mais possível
                {
                    System.out.println("Notas de R$ " + chegagemNotas + ": " + qtdNotas); //printa as notas e suas quantidades
                }
            }
        }
        ler.close();
    }
}
