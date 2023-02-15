import java.util.Scanner;
  
public class exercicio {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nome, endereco, genero, nacionalidade, profissao, idade, datan, cpf, rg, cnh;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        idade = sc.nextLine();

        System.out.print("Digite seu endereço: ");
        endereco = sc.nextLine();       

        System.out.print("Digite sua data de nascimento: ");
        datan = sc.nextLine();

        System.out.print("Digite seu CPF: ");
        cpf = sc.nextLine();

        System.out.print("Digite seu RG: ");
        rg = sc.nextLine();

        System.out.print("Digite sua CNH: ");
        cnh = sc.nextLine();

        System.out.print("Digite seu gênero: ");
        genero = sc.nextLine();

        System.out.print("Digite sua nacionalidade: ");
        nacionalidade = sc.nextLine();

        System.out.print("Digite sua profissão: ");
        profissao = sc.nextLine();
        
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nEndereço: " + endereco + "\nData de nascimento: " + datan +"\nCPF: " + cpf + "\nRG: " + rg + "\nCNH: " + cnh + "\nGênero: " + genero + "\nNacionalidade: " + nacionalidade + "\nProfissão: " + profissao);

         sc.close();
}
    
}
