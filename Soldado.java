package batalhao;

class Soldado{
    private String nome;
    private int posicao;
    private static int totalSoldados = 0;
    private static final int DISTANCIA = 2; 
    private static final String ARMA = "fuzil";

    public Soldado(String nome){
        this.nome = nome;
        this.posicao = 0;
        this.totalSoldados++;
    }
    
    //nome pode consultar e alterar, get e set
    public Sting getNome(){
        return nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public int getPosicao(){
        return posicao;
    }

    public void movimentar(int distancia){
        if (distancia <= 0 || distancia == NULL){ //ver condicao 
            distancia = DISTANCIA;
        } else{
            System.out.println(this.nome + "percorreu " + distancia + " metros");
        }
    }

    public void atacar(String arma){
        if (totalSoldados < 3){ //3 soldados para testar
            System.out.println("ainda nao, esperando o exercito ficar miaor! \nTemos " + totalSoldados + ", precisamos de no minimo 10 soldados!");
        }else{
            if(arma.isEmpty() || arma == NULL){
                arma = ARMA;
            }else{
                System.out.println(this.nome + "esta atacando com " + arma);
            }
        }
    }

    //public void movimentar
    //atacar
    //gets e sets
}