public class Carros {
    protected String marca;
    private String modelo;

    public Carros(String marca, String modelo){ //CONSTRUCTOR -> É O QUE USAMOS PARA CRIAR OBJETOS (INSTANCIAR)
        this.marca = marca;
        this.modelo = modelo;
    }
//GETTERS & SETTERS (OBTER & DETERMINAR)

    public String getMarca(){  // GET => OBTENHO INFORMAÇÕES DO OBJETO
        return marca; //OBTER UM RETORNO VISUAL DA INFORMAÇÃO DESEJADA DO OBJETO
    }

    public void setMarca(String marca){ //DETERMINAR, ALTERAR INFORMAÇÕES
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
}