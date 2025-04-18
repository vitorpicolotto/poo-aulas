package ads.poo.aula7;

public class Caneta {
    
    //atributos
    private String cor;
    private double nivelTinta;
    private boolean tampa;
    private int d;
    
    //metodos
    public void definirCor(String c){
        cor = c;
    }

    public String getCor(){
        return cor;
    }

    public void definirNivelTinta(double n){
        nivelTinta = n;
        if(nivelTinta > 1.0){ 
            nivelTinta = 1.0;
        } else if(nivelTinta <0.0){
            nivelTinta = 0.0;
        } else {
            nivelTinta = n;
        }
    }

    public double getNivelTinta(){
        return nivelTinta;
    }

    public void abrirFechar(boolean t){
        tampa = !tampa;
    }

    public boolean isAberta(){
        return tampa;
    }


    public String desenhar(int d){
        String desenhoTraco = "-";

        //1. se a caneta estiver aberta e com tinta, desenha
        //2. calcular quantas linhas conisgue desenhar com a quantidade de tinta que tem
                //se d = 1, desenha uma linha, se d=2 desenha duas linhas (retorna uma string com a quantidade de linhas)...
        //3. a cada linha desenhada, diminui o nivel de tinta em 0.1
        //4. return "-".repeat(d)
        //se o nivel de tinta for menor que 0.1, não desenha e retorna uma string dizendo que não tem tinta

        if(isAberta()){
            if(nivelTinta > 0.1){
                if(d > 0 && d <= 10){
                    if(nivelTinta >= d * 0.1){
                        nivelTinta -= d * 0.1;
                        return desenhoTraco.repeat(d);
                    } else {
                        return "Não tem tinta suficiente para desenhar " + d + " linhas.";
                    }
                } else {
                    return "Desenho inválido!";
                }
            } else {
                return "Não tem tinta suficiente para desenhar.";
            }

        }
        return desenhar(d);
    }



}
