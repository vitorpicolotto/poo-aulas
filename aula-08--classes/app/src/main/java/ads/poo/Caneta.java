package ads.poo;

public class Caneta {
    private String cor;
    private int nivelTinta;
    private boolean aberta;


    private static final String COR_PADRAO = "preto";



    public Caneta() {
        this.cor = "Preta";
        this.nivelTinta = 100;
        this.aberta = false;
    }

    public Caneta(String cor){
        this();
        this.cor = cor;
    }

    public Caneta (String cor, int nivelTinta){
        this(cor);
        this.nivelTinta = nivelTinta;
    }


    public Caneta (String cor, int nivelTinta, boolean aberta){
        this(cor, nivelTinta);
        this.aberta = aberta;
    }


    public String desenhar(int quantidade, String ponta){
        return ponta.repeat(quantidade);
    } //Método padrão, onde eu chamo todos os parâmetros. A quantidade e a ponta são chamados no App.

    public String desenhar(int quantidade){
        return desenhar(quantidade, "-");
    } //Sobrecarga do método anterior, onde eu chamo o padrão acima (onde a quantidade será determinada no App), enquanto defino a ponta

}