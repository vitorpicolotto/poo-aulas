package ads.poo;

public class Carro {
    //private static final int VELOCIDADE_MAXIMA_PADRAO = 200;

    private int velocidadeAtual;
    private String modeloCarro;

    public Carro(String modeloCarro){
        this.velocidadeAtual = 0;
        this.modeloCarro = modeloCarro;
    }

    public Carro(){
        this("Fusca");
    }

}