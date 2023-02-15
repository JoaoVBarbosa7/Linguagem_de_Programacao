import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        double num1, num2, num3, soma;

        System.out.print("Digite o primeiro valor: ");
        num1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        num2 = sc.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        num3 = sc.nextDouble();

        soma = num1 + num2 + num3;

        System.out.println("A soma dos 3 valores é: " + soma);

        sc.close();
    }
}
