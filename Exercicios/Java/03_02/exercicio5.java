import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        double num1, num2;

        System.out.print("Digite o primeiro valor: ");
        num1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        num2 = sc.nextDouble();

        if(num1 < num2){
            System.out.println("O menor valor é: " + num1);
        }else{
            System.out.println("O menor valor é: " + num2);
        }

        sc.close();
    }
}
