import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        double num1, num2, num3, soma, media;

        System.out.print("Digite o primeiro valor: ");
        num1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        num2 = sc.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        num3 = sc.nextDouble();

        soma = num1 + num2 + num3;

        media = soma / 3;

        System.out.println("A média dos 3 valores é: " + media);

        sc.close();
    }
}