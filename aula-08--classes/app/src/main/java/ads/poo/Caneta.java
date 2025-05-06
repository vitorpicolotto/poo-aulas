package ads.poo;

public class Caneta {
    private String cor;
    private int nivelTinta;
    private boolean aberta;



    public Caneta() {
        this.cor = "Preta";
        this.nivelTinta = 100;
        this.aberta = false;
    }

    public Caneta(String cor){
        this.cor = cor;
        this.nivelTinta = 100;
        this.aberta = false;
    }

    public Caneta (String cor, int nivelTinta){
        this.cor = cor;
        this.nivelTinta = nivelTinta;
        this.aberta = false;
    }

    
}