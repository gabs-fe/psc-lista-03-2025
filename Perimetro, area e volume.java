import java.util.Scanner;

public class Quatro
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in); 

        System.out.println("Qual a operação desejada?");
        System.out.println("1-perimetro, 2-área, 3-volume");
        int operacao = ler.nextInt(); //ler a opção desejada
        
        if (operacao != 1 && operacao != 2 && operacao != 3) { //se não for alguma das opções, irá para outra
            System.out.println("Operação inválida! Por favor, informe 1, 2 ou 3."); 
        }

        else //se estiver nas opções, ira executar os calculos
        System.out.println("Digite o raio do círculo: ");
        double raio = ler.nextDouble();

        {
            if (operacao==1) //se for selecionado 1
            {
                double perimetro = 2.0*3.14*raio; //calculo perimetro
                System.out.println("O perimetro é: " + perimetro); // printa perimetro
            }
            if (operacao==2)//se for selecionado 2
            {
                double area = 3.14*(raio*raio);//calcula area
                System.out.println("O A área é: " + area); // printa area
            }
            if (operacao==3)//se for selecionado 3
            {
                double volume = (4.0 / 3.0) * 3.14 * (raio * raio * raio);
                System.out.println("O volume é: " + volume); //printa raio
            }
        }
        ler.close();
    }
      
}


