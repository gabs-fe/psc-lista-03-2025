import java.util.Scanner;

public class Tres
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in); 

        System.out.print("Qual o valor de a? ");//recebe valor de a
        double a = ler.nextDouble();
        System.out.print("Qual o valor de b? ");//recebe valor de b
        double b = ler.nextDouble();
        System.out.print("Qual o valor de c? ");//recebe valor de c
        double c = ler.nextDouble();

        if (a==0 && b==0 && c!=0){//checa os valores informados
            System.out.println("Coeficientes informados incorretamente ");
        }
        else if (a==0 && b!=0){//checa os valores informados
            System.out.println("Essa é uma equação de primeiro grau ");
            double raiz = -c / b;
            System.out.println("A raiz é de: " + raiz);
        }
        else {
            double delta = (b*b)-4*a*c; //faz a esquação

            if (delta<0){ //se delta for menor que zero
                System.out.println("Esta equação não possui raízes reais");
            }
            else if (delta==0){//se delta for igual a zero
                System.out.println("Esta equação possui duas  raízes reais iguais ");
            }
            else {//se delta for maior que zero
                double raiz1 = (-b+(Math.sqrt(delta)))/(2*a); // resultado com raiz positiva
                double raiz2 = (-b-(Math.sqrt(delta)))/(2*a); // resultado com raiz negativa

                System.out.println("Esta equação possui duas raízes reais diferentes.");
                System.out.println("x1 = " + raiz1);
                System.out.println("x2 = " + raiz2);
            }
        ler.close();
        }
        
    }
}
