public class Shoppings {
    public String cidade, bairro, rua, nome;
    public int numshop;

    public Shoppings(String nome, String cidade, String bairro, String rua, int numshop) {
        this.nome = nome;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numshop = numshop;
      }

    public void imprimirDados(){
        System.out.println("Rua: " + rua + "\nNúmero: " + numshop + "\nBairro: " + bairro + "\nCidade: " + cidade + "\nNome: " + nome);
      }

      public static void main(String[] args){
        Shoppings ShoppingSG = new Shoppings("Partage Shopping", "São Gonçalo", "Centro", "Av. Pres. Kennedy", 425);
        ShoppingSG.imprimirDados();

        Shoppings ShoppingNT = new Shoppings("Plaza Shopping", "Niterói", "Centro", "Rua Quinze de Novembro", 8);
        ShoppingNT.imprimirDados();

        Shoppings ShoppingRJ = new Shoppings("BarraShopping", "Rio de Janeiro", "Barra da Tijuca", "Av. das Américas", 4666);
        ShoppingRJ.imprimirDados();
      }

          

}
