package ads.poo.aula7;

public class Caneta {
    
    //atributos
    private String cor;
    private double nivelTinta;
    private boolean tampa;
    
    //metodos
    public void definirCor(String c){
        cor = c;
    }

    public String getCor(){
        return cor;
    }

    public void definirNivelTinta(double n){
        nivelTinta = n;
    }

    public void abrirFechar(boolean t){
        tampa = !tampa;
    }

    public boolean isAberta(){
        return tampa;
    }

}
