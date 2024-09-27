package batalhao;

class Soldado{
    private String nome;
    private int posicao;
    private static int quantidadeSoldados = 0;
    private static final int DISTANCIA = 2; 
    private static final int TAMANHO_EXERCITO = 2; 
    private static final String ARMA = "fuzil";

    public Soldado(String nome){
        this.nome = nome;
        this.posicao = 0;
        this.quantidadeSoldados++;
    }
    
    //nome pode consultar e alterar, get e set
    public Sting getNome(){
        return nome;
    }

    public int getPosicao(){
        return posicao;
    }

    public static int getQuantidadeSoldados() {
        return quantidadeSoldados;
    }

    //sobrecarga de movimentar    
    public void movimentar(int distancia){
        this.posicao += distancia;
        System.out.println("o soldado " + this.nome + " encontra-se na posicao " + this.posicao);
     }

    public void movimentar(){
       this.posicao += this.DISTANCIA;
       System.out.println("o soldado " + this.nome + " encontra-se na posicao " + this.posicao);
    }

    public void atacar(String arma){
        if(this.exercitoPronto()){
            System.out.println(this.nome + "esta atacando com " + arma);
        } else{
            System.out.println("o exercito ainda nao esta pronto! ");
        }
    }

    public void atacar(){
        if(this.exercitoPronto()){
            System.out.println(this.nome + "esta atacando com " + this.ARMA);
        } else{
            System.out.println("o exercito ainda nao esta pronto! Apenas " + this.getQuantidadeSoldados() + " soldados.");
        }
    }

    private boolean exercitoPronto(){
        if (this.getQuantidadeSoldados() >= TAMANHO_EXERCITO){
            return true;
        } else{
            return false;
        }
    }
}