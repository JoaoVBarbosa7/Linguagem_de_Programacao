import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        double num1, resto;

        System.out.print("Digite um valor: ");
        num1 = sc.nextDouble();

        resto = num1  * num1;

        System.out.println("O quadrado de " + num1  + " é: " + resto);

        sc.close();
    }
}